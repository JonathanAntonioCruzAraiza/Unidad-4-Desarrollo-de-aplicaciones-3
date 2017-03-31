/**
 * MoviesWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.edu.utng.ws;

public interface MoviesWSService extends javax.xml.rpc.Service {
    public java.lang.String getMoviesWSAddress();

    public mx.edu.utng.ws.MoviesWS getMoviesWS() throws javax.xml.rpc.ServiceException;

    public mx.edu.utng.ws.MoviesWS getMoviesWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
