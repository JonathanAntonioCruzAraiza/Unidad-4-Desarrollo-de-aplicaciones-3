package mx.edu.utng.ws;

public class MoviesWSProxy implements mx.edu.utng.ws.MoviesWS {
  private String _endpoint = null;
  private mx.edu.utng.ws.MoviesWS moviesWS = null;
  
  public MoviesWSProxy() {
    _initMoviesWSProxy();
  }
  
  public MoviesWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initMoviesWSProxy();
  }
  
  private void _initMoviesWSProxy() {
    try {
      moviesWS = (new mx.edu.utng.ws.MoviesWSServiceLocator()).getMoviesWS();
      if (moviesWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)moviesWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)moviesWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (moviesWS != null)
      ((javax.xml.rpc.Stub)moviesWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.edu.utng.ws.MoviesWS getMoviesWS() {
    if (moviesWS == null)
      _initMoviesWSProxy();
    return moviesWS;
  }
  
  public int addMovie(mx.edu.utng.ws.Movie movie) throws java.rmi.RemoteException{
    if (moviesWS == null)
      _initMoviesWSProxy();
    return moviesWS.addMovie(movie);
  }
  
  public int editMovie(mx.edu.utng.ws.Movie movie) throws java.rmi.RemoteException{
    if (moviesWS == null)
      _initMoviesWSProxy();
    return moviesWS.editMovie(movie);
  }
  
  public mx.edu.utng.ws.Movie[] getMovies() throws java.rmi.RemoteException{
    if (moviesWS == null)
      _initMoviesWSProxy();
    return moviesWS.getMovies();
  }
  
  public mx.edu.utng.ws.Movie getOneMovie(int id) throws java.rmi.RemoteException{
    if (moviesWS == null)
      _initMoviesWSProxy();
    return moviesWS.getOneMovie(id);
  }
  
  public int removeMovie(int id) throws java.rmi.RemoteException{
    if (moviesWS == null)
      _initMoviesWSProxy();
    return moviesWS.removeMovie(id);
  }
  
  
}