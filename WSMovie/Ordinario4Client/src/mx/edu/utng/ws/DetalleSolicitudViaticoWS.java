/**
 * DetalleSolicitudViaticoWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.edu.utng.ws;

public interface DetalleSolicitudViaticoWS extends java.rmi.Remote {
    public mx.edu.utng.ws.DetalleSolicitudViatico obtenerDetalleSolicitudViatico(int id) throws java.rmi.RemoteException;
    public mx.edu.utng.ws.DetalleSolicitudViatico[] getDetalle() throws java.rmi.RemoteException;
    public int agregarDetalleSolicitudViatico(mx.edu.utng.ws.DetalleSolicitudViatico detalleSolicitudViatico) throws java.rmi.RemoteException;
    public int editarDetalleSolicitudViatico(mx.edu.utng.ws.DetalleSolicitudViatico detalleSolicitudViatico) throws java.rmi.RemoteException;
    public int eliminarDetalleSolicitudViatico(int id) throws java.rmi.RemoteException;
}
