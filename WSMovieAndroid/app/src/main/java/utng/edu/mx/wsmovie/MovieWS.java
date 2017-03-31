package utng.edu.mx.wsmovie;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.MarshalFloat;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;


public class MovieWS extends AppCompatActivity implements View.OnClickListener {
    private EditText etName;
    private EditText etSinopsis;
    //private EditText etType;
    private EditText etPrice;
    private Button btGuardar;
    private Button btListar;
    private ToggleButton tbCategorie;
    private Movie movie = null;
    final String NAMESPACE =
            "http://ws.utng.edu.mx";
    final SoapSerializationEnvelope envelope =
            new SoapSerializationEnvelope(SoapEnvelope.VER11);
    static String URL =
            "http://localhost:8080/Ordinario/services/DetalleSolicitudViaticoWS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_ws);
        components();
    }

    private void components() {
        etName = (EditText) findViewById(R.id.et_name);
        etSinopsis = (EditText) findViewById(R.id.et_sinopsis);
        //etType = (EditText) findViewById(R.id.et_type);
        etPrice = (EditText) findViewById(R.id.et_price);
        btGuardar = (Button) findViewById(R.id.bt_save);
        btListar = (Button) findViewById(R.id.bt_list);
        tbCategorie= (ToggleButton)findViewById(R.id.tb_categorie);
        btGuardar.setOnClickListener(this);
        btListar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_consume_w, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        String name = etName.getText().toString();
        String sinopsis = etSinopsis.getText().toString();
        //String type = etType.getText().toString();
        String price = etPrice.getText().toString();


        if (v.getId() == btGuardar.getId()) {
            if (name != null && !name.isEmpty() &&
                    name != null && !sinopsis.isEmpty() &&
                    sinopsis != null && !sinopsis.isEmpty() &&
                    price != null && !price.isEmpty()) {

                try {
                    if (getIntent().getExtras().getString("action")
                            .equals("update")) {
                        updateMovie tarea = new updateMovie();
                        tarea.execute();
                        cleanEditTex();
                    }

                } catch (Exception e) {
                    //Cuando no se haya mandado una accion por defecto es insertar.
                    InsertMovie tarea = new InsertMovie();
                    tarea.execute();
                }
            }

        }
        if (btListar.getId() == v.getId()) {
            startActivity(new Intent(MovieWS.this, ListMovie.class));
        }
    }//fin conClick

    private void cleanEditTex() {
        etName.setText("");
        etSinopsis.setText("");
        //etType.setText("");
        etPrice.setText("");
    }


    private class InsertMovie extends
            AsyncTask<String, Integer, Boolean> {

        @Override
        protected Boolean doInBackground(String... params) {
            boolean result = true;
            final String METHOD_NAME = "addMovie";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

            SoapObject request =
                    new SoapObject(NAMESPACE, METHOD_NAME);

            movie = new Movie();
            movie.setProperty(0, 0);
            obtenerDatos();

            PropertyInfo info = new PropertyInfo();
            info.setName("movie");
            info.setValue(movie);
            info.setType(movie.getClass());
            request.addProperty(info);
            envelope.setOutputSoapObject(request);
            envelope.addMapping(NAMESPACE, "Movie", Movie.class);

            /* Para serializar flotantes y otros tipos no cadenas o enteros*/
            MarshalFloat mf = new MarshalFloat();
            mf.register(envelope);

            HttpTransportSE transportSE = new HttpTransportSE(URL);
            try {
                transportSE.call(SOAP_ACTION, envelope);
                SoapPrimitive response =
                        (SoapPrimitive) envelope.getResponse();
                String res = response.toString();
                if (!res.equals("1")) {
                    result = false;
                }

            } catch (Exception e) {
                Log.e("Error ", e.getMessage());
                result = false;
            }

            return result;
        }

        @Override
        protected void onPostExecute(Boolean result) {
            if (result) {
                cleanEditTex();
                Toast.makeText(getApplicationContext(),
                        "Movie Inserted.",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "Error Insert.",
                        Toast.LENGTH_SHORT).show();

            }
        }
    }//fin tarea insertar

    private class updateMovie extends
            AsyncTask<String, Integer, Boolean> {

        protected Boolean doInBackground(String... params) {

            boolean result = true;

            final String METHOD_NAME = "editMovie";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);

            movie = new Movie();
            movie.setProperty(0, getIntent().getExtras().getString("valor0"));
            obtenerDatos();

            PropertyInfo info = new PropertyInfo();
            info.setName("movie");
            info.setValue(movie);
            info.setType(movie.getClass());

            request.addProperty(info);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);

            envelope.setOutputSoapObject(request);

            envelope.addMapping(NAMESPACE, "Movie", movie.getClass());

            MarshalFloat mf = new MarshalFloat();
            mf.register(envelope);

            HttpTransportSE transporte = new HttpTransportSE(URL);

            try {
                transporte.call(SOAP_ACTION, envelope);

                SoapPrimitive response = (SoapPrimitive) envelope
                        .getResponse();
                String res = response.toString();

                if (!res.equals("1")) {
                    result = false;
                }

            } catch (HttpResponseException e) {
                Log.e("Error HTTP", e.toString());
            } catch (IOException e) {
                Log.e("Error IO", e.toString());
            } catch (XmlPullParserException e) {
                Log.e("Error XmlPullParser", e.toString());
            }

            return result;

        }

        protected void onPostExecute(Boolean result) {

            if (result) {
                Toast.makeText(getApplicationContext(), "Update",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Error Update",
                        Toast.LENGTH_SHORT).show();

            }
        }
    }

    private void obtenerDatos() {
        movie.setProperty(1, etName.getText().toString());
        movie.setProperty(2, etSinopsis.getText().toString());

        if(tbCategorie.isChecked()){
            movie.setProperty(3,2);
        }else{
            movie.setProperty(3,1);
        }
        //movie.setProperty(3, Integer.parseInt(etType.getText().toString()));
        movie.setProperty(4, Float.parseFloat(etPrice.getText().toString()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle datosRegreso = this.getIntent().getExtras();
        try {
            Log.i("Dato", datosRegreso.getString("valor3"));
            etName.setText(datosRegreso.getString("valor1"));
            etSinopsis.setText(datosRegreso.getString("valor2"));
            if (datosRegreso.getString("valor3").equals("1")) {
                tbCategorie.setChecked(false);
            } else {
                tbCategorie.setChecked(true);
            }

             //etType.setText(datosRegreso.getString("valor3"));
            etPrice.setText(datosRegreso.getString("valor4"));
        } catch (Exception e) {
            Log.e("Reload Error", e.toString());
        }

    }

}
