package mx.edu.utng.ws;

public class DetalleSolicitudViaticoWSProxy implements mx.edu.utng.ws.DetalleSolicitudViaticoWS {
  private String _endpoint = null;
  private mx.edu.utng.ws.DetalleSolicitudViaticoWS detalleSolicitudViaticoWS = null;
  
  public DetalleSolicitudViaticoWSProxy() {
    _initDetalleSolicitudViaticoWSProxy();
  }
  
  public DetalleSolicitudViaticoWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initDetalleSolicitudViaticoWSProxy();
  }
  
  private void _initDetalleSolicitudViaticoWSProxy() {
    try {
      detalleSolicitudViaticoWS = (new mx.edu.utng.ws.DetalleSolicitudViaticoWSServiceLocator()).getDetalleSolicitudViaticoWS();
      if (detalleSolicitudViaticoWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)detalleSolicitudViaticoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)detalleSolicitudViaticoWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (detalleSolicitudViaticoWS != null)
      ((javax.xml.rpc.Stub)detalleSolicitudViaticoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.edu.utng.ws.DetalleSolicitudViaticoWS getDetalleSolicitudViaticoWS() {
    if (detalleSolicitudViaticoWS == null)
      _initDetalleSolicitudViaticoWSProxy();
    return detalleSolicitudViaticoWS;
  }
  
  public int agregarDetalleSolicitudViatico(mx.edu.utng.ws.DetalleSolicitudViatico detalleSolicitudViatico) throws java.rmi.RemoteException{
    if (detalleSolicitudViaticoWS == null)
      _initDetalleSolicitudViaticoWSProxy();
    return detalleSolicitudViaticoWS.agregarDetalleSolicitudViatico(detalleSolicitudViatico);
  }
  
  public int editarDetalleSolicitudViatico(mx.edu.utng.ws.DetalleSolicitudViatico detalleSolicitudViatico) throws java.rmi.RemoteException{
    if (detalleSolicitudViaticoWS == null)
      _initDetalleSolicitudViaticoWSProxy();
    return detalleSolicitudViaticoWS.editarDetalleSolicitudViatico(detalleSolicitudViatico);
  }
  
  public int eliminarDetalleSolicitudViatico(int id) throws java.rmi.RemoteException{
    if (detalleSolicitudViaticoWS == null)
      _initDetalleSolicitudViaticoWSProxy();
    return detalleSolicitudViaticoWS.eliminarDetalleSolicitudViatico(id);
  }
  
  public mx.edu.utng.ws.DetalleSolicitudViatico obtenerDetalleSolicitudViatico(int id) throws java.rmi.RemoteException{
    if (detalleSolicitudViaticoWS == null)
      _initDetalleSolicitudViaticoWSProxy();
    return detalleSolicitudViaticoWS.obtenerDetalleSolicitudViatico(id);
  }
  
  public mx.edu.utng.ws.DetalleSolicitudViatico[] getDetalle() throws java.rmi.RemoteException{
    if (detalleSolicitudViaticoWS == null)
      _initDetalleSolicitudViaticoWSProxy();
    return detalleSolicitudViaticoWS.getDetalle();
  }
  
  
}