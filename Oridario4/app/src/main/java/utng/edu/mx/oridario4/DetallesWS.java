package utng.edu.mx.oridario4;

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

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class DetallesWS extends AppCompatActivity  implements View.OnClickListener{

    private EditText etMontoSolicitado;
    private EditText etMontoOtorgado;
    private EditText etMontoComprobado;
    private EditText etComprobacionValida;
    private EditText etSolicitudViaticos;
    private EditText etPartida;
    private Button btGuardar;
    private Button btListar;

    private DetalleSolicitudViaticos detalleSolicitudViaticos = null;
    final String NAMESPACE =
            "http://ws.utng.edu.mx";
    final SoapSerializationEnvelope envelope =
            new SoapSerializationEnvelope(SoapEnvelope.VER11);
    static String URL =
            "http://192.168.2.85:8080/Ordinario/services/DetalleSolicitudViaticoWS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        components();
    }

    private void components() {
        etMontoSolicitado = (EditText) findViewById(R.id.et_monto_solicitado);
        etMontoOtorgado = (EditText) findViewById(R.id.et_monto_otorgado);
        etMontoComprobado = (EditText) findViewById(R.id.et_monton_comprobado);
        etComprobacionValida = (EditText) findViewById(R.id.et_comprobacion_valida);
        etSolicitudViaticos = (EditText) findViewById(R.id.et_solicitud_viaticos);
        etPartida = (EditText) findViewById(R.id.et_partida);
        btGuardar = (Button) findViewById(R.id.bt_save);
        btListar = (Button) findViewById(R.id.bt_list);
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
          if (btGuardar.getId() ==v.getId()) {
              try {
                  if (getIntent().getExtras().getString("action").equals("update")) {
                      updateMovie tarea = new updateMovie();
                      tarea.execute();
                  }


              } catch (Exception e) {
                  //Cuando no se haya mandado una accion por defecto es insertar.
                  InsertDetalle tarea = new InsertDetalle();
                  tarea.execute();
              }
          }

        if (btListar.getId() == v.getId()) {
            startActivity(new Intent(DetallesWS.this, ListDetallesSolicitudViaticos.class));
        }
    }//fin conClick

    private class InsertDetalle extends
            AsyncTask<String, Integer, Boolean> {

        @Override
        protected Boolean doInBackground(String... params) {
            boolean result = true;
            final String METHOD_NAME = "agregarDetalleSolicitudViatico";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            detalleSolicitudViaticos = new DetalleSolicitudViaticos();
            detalleSolicitudViaticos.setProperty(0, 0);
            obtenerDatos();
            PropertyInfo info = new PropertyInfo();
            info.setName("DetalleSolicitudViaticos");
            info.setValue(detalleSolicitudViaticos);
            info.setType(detalleSolicitudViaticos.getClass());
            request.addProperty(info);
            envelope.setOutputSoapObject(request);
            envelope.addMapping(NAMESPACE, "DetalleSolicitudViaticos", DetalleSolicitudViaticos.class);
            HttpTransportSE transportSE = new HttpTransportSE(URL);
            try {
                transportSE.call(SOAP_ACTION, envelope);
                SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
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
                Toast.makeText(getApplicationContext(),
                        "Movie Inserted.",
                        Toast.LENGTH_SHORT).show();
                cleanEditTex();
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
            final String METHOD_NAME = "editarDetalleSolicitudViatico";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            detalleSolicitudViaticos = new DetalleSolicitudViaticos();
            detalleSolicitudViaticos.setProperty(0, getIntent().getExtras().getString("valor0"));
            obtenerDatos();
            PropertyInfo info = new PropertyInfo();
            info.setName("editarDetalleSolicitudViaticos");
            info.setValue(detalleSolicitudViaticos);
            info.setType(detalleSolicitudViaticos.getClass());
            request.addProperty(info);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.setOutputSoapObject(request);
            envelope.addMapping(NAMESPACE, "DetalleSolicitudViaticos",
                    detalleSolicitudViaticos.getClass());
            HttpTransportSE transporte = new HttpTransportSE(URL);
            try {
                transporte.call(SOAP_ACTION, envelope);
                SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
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
                cleanEditTex();
            } else {
                Toast.makeText(getApplicationContext(), "Error al actualizar",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void obtenerDatos() {
        detalleSolicitudViaticos.setProperty(1, etMontoSolicitado.getText().toString());
        detalleSolicitudViaticos.setProperty(2, etMontoOtorgado.getText().toString());
        detalleSolicitudViaticos.setProperty(3, etMontoComprobado.getText().toString());
        detalleSolicitudViaticos.setProperty(4, etComprobacionValida.getText().toString());
        detalleSolicitudViaticos.setProperty(5, etSolicitudViaticos.getText().toString());
        detalleSolicitudViaticos.setProperty(6, etPartida.getText().toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle datosRegreso = this.getIntent().getExtras();
        try {
            etMontoSolicitado.setText(datosRegreso.getString("valor1"));
            etMontoOtorgado.setText(datosRegreso.getString("valor2"));
            etMontoComprobado.setText(datosRegreso.getString("valor3"));
            etComprobacionValida.setText(datosRegreso.getString("valor4"));
            etSolicitudViaticos.setText(datosRegreso.getString("valor5"));
            etPartida.setText(datosRegreso.getString("valor6"));
        } catch (Exception e) {
            Log.e("Reload Error", e.toString());
        }
    }
    private void cleanEditTex() {
        etMontoSolicitado.setText("");
        etMontoOtorgado.setText("");
        etMontoComprobado.setText("");
        etComprobacionValida.setText("");
        etSolicitudViaticos.setText("");
        etPartida.setText("");
    }


}
