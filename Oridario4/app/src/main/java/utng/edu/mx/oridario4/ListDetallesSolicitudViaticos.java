package utng.edu.mx.oridario4;

import android.app.ListActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class ListDetallesSolicitudViaticos extends ListActivity {
    final String NAMESPACE = "http://ws.utng.edu.mx";
    final SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
            SoapEnvelope.VER11);
    private ArrayList<DetalleSolicitudViaticos> detalleSolicitudViaticoses = new ArrayList<DetalleSolicitudViaticos>();
    private int idSeleccionado;
    private int posicionSeleccionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Detalles query = new Detalles();
        query.execute();
        registerForContextMenu(getListView());
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_modificar:
               DetalleSolicitudViaticos detalleSolicitudViaticos = detalleSolicitudViaticoses.get(posicionSeleccionado);
                Bundle bundleLibro = new Bundle();
                for (int i = 0; i < detalleSolicitudViaticos.getPropertyCount(); i++) {
                    bundleLibro.putString("valor" + i, detalleSolicitudViaticos.getProperty(i)
                            .toString());
                }
                bundleLibro.putString("action", "update");
                Intent intent = new Intent(ListDetallesSolicitudViaticos.this, DetallesWS.class);
                intent.putExtras(bundleLibro);
                startActivity(intent);
                return true;
            case R.id.item_eliminar:
                DeleteDetalles eliminar = new DeleteDetalles();
                eliminar.execute();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(getApplicationContext());
        menuInflater.inflate(R.menu.menu_back, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_regresar:
                startActivity(new Intent(ListDetallesSolicitudViaticos.this, DetalleSolicitudViaticos.class));
                break;
            default:
                break;
        }
        return super.onMenuItemSelected(featureId, item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        menu.setHeaderTitle(getListView().getAdapter().getItem(info.position).toString());
        idSeleccionado = (Integer) detalleSolicitudViaticoses.get(info.position).getProperty(0);
        posicionSeleccionado = info.position;
        inflater.inflate(R.menu.menu_options, menu);
    }

    private class Detalles extends AsyncTask<String, Integer, Boolean> {

        protected Boolean doInBackground(String... params) {
            boolean result = true;
            final String METHOD_NAME = "getDetalle";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;
            detalleSolicitudViaticoses.clear();
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            envelope.setOutputSoapObject(request);
            HttpTransportSE transporte = new HttpTransportSE(DetallesWS.URL);
            try {
                transporte.call(SOAP_ACTION, envelope);
                Vector<SoapObject> response = (Vector<SoapObject>) envelope.getResponse();
                if (response != null) {
                    for (SoapObject objSoap : response) {
                        DetalleSolicitudViaticos detalleSolicitudViaticos =
                                new DetalleSolicitudViaticos();
                        detalleSolicitudViaticos.setProperty(0,
                                Integer.parseInt(objSoap.getProperty("id").toString()));
                        detalleSolicitudViaticos.setProperty(1,
                                objSoap.getProperty("montoSolicitado").toString());
                        detalleSolicitudViaticos.setProperty(2,
                                objSoap.getProperty("montoOtorgado").toString());
                        detalleSolicitudViaticos.setProperty(3,
                                objSoap.getProperty("montoComprobado").toString());
                        detalleSolicitudViaticos.setProperty(4,
                                objSoap.getProperty("comprobacionValida").toString());
                        detalleSolicitudViaticos.setProperty(5,
                                objSoap.getProperty("solicitudViatico").toString());
                        detalleSolicitudViaticos.setProperty(6,
                                objSoap.getProperty("partida").toString());
                        detalleSolicitudViaticoses.add(detalleSolicitudViaticos);
                    }
                }
            } catch (XmlPullParserException e) {
                Log.e("Error XMLPullParser", e.toString());
                result = false;
            } catch (HttpResponseException e) {
                Log.e("Error HTTP", e.toString());

                result = false;
            } catch (IOException e) {
                Log.e("Error IO", e.toString());
                result = false;
            } catch (ClassCastException e) {
                try {
                    SoapObject objSoap = (SoapObject) envelope.getResponse();
                    DetalleSolicitudViaticos detalleSolicitudViaticos = new DetalleSolicitudViaticos();
                    detalleSolicitudViaticos.setProperty(0,
                            Integer.parseInt(objSoap.getProperty("id").toString()));
                    detalleSolicitudViaticos.setProperty(1,
                            objSoap.getProperty("montoSolicitado").toString());
                    detalleSolicitudViaticos.setProperty(2,
                            objSoap.getProperty("montoOtorgado").toString());
                    detalleSolicitudViaticos.setProperty(3,
                            objSoap.getProperty("montoComprobado").toString());
                    detalleSolicitudViaticos.setProperty(4,
                            objSoap.getProperty("comprobacionValida").toString());
                    detalleSolicitudViaticos.setProperty(5,
                            objSoap.getProperty("solicitudViatico").toString());
                    detalleSolicitudViaticos.setProperty(6,
                            objSoap.getProperty("partida").toString());
                    detalleSolicitudViaticoses.add(detalleSolicitudViaticos);
                } catch (SoapFault e1) {
                    Log.e("Error SoapFault", e.toString());
                    result = false;
                }
            }
            return result;
        }
        protected void onPostExecute(Boolean result) {
            if (result) {
                final String[] datos = new String[detalleSolicitudViaticoses.size()];
                for (int i = 0; i < detalleSolicitudViaticoses.size(); i++) {
                    datos[i] = detalleSolicitudViaticoses.get(i).getProperty(0) + " - "
                            + detalleSolicitudViaticoses.get(i).getProperty(1);
                }
                ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                        ListDetallesSolicitudViaticos.this,
                        android.R.layout.simple_list_item_1, datos);
                setListAdapter(adaptador);
            } else {
                Toast.makeText(getApplicationContext(), "No data found.",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }


    private class DeleteDetalles extends AsyncTask<String, Integer, Boolean> {

        protected Boolean doInBackground(String... params) {
            boolean result = true;
            final String METHOD_NAME = "eliminarDetalleSolicitudViatico";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("id", idSeleccionado);
            envelope.setOutputSoapObject(request);
            HttpTransportSE transportSE = new HttpTransportSE(DetallesWS.URL);
            try {
                transportSE.call(SOAP_ACTION, envelope);
                SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                String res = response.toString();

                if (!res.equals("0")) {
                    result = true;
                }
            } catch (Exception e) {
                Log.e("Error", e.toString());
                result = false;
            }
            return result;
        }
        protected void onPostExecute(Boolean result) {
            if (result) {
                Toast.makeText(getApplicationContext(),"removed", Toast.LENGTH_SHORT).show();
                Detalles consulta = new Detalles();
                consulta.execute();
            } else {
                Toast.makeText(getApplicationContext(),"Error while deleting", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
