/**
 * MoviesWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.edu.utng.ws;

public interface MoviesWS extends java.rmi.Remote {
    public int removeMovie(int id) throws java.rmi.RemoteException;
    public int addMovie(mx.edu.utng.ws.Movie movie) throws java.rmi.RemoteException;
    public int editMovie(mx.edu.utng.ws.Movie movie) throws java.rmi.RemoteException;
    public mx.edu.utng.ws.Movie[] getMovies() throws java.rmi.RemoteException;
    public mx.edu.utng.ws.Movie getOneMovie(int id) throws java.rmi.RemoteException;
}
