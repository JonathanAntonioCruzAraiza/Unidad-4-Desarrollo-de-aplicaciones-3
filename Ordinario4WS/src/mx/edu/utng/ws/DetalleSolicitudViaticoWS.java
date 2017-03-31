package mx.edu.utng.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DetalleSolicitudViaticoWS {
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private PreparedStatement ps;
	
	
	public DetalleSolicitudViaticoWS() {
		conectar();
	}
	private void conectar(){
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/wstest",
					"postgres","12345");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int agregarDetalleSolicitudViatico(DetalleSolicitudViatico detalleSolicitudViatico){
		int result =0;
		if (connection != null) {
			try {
				ps = connection.prepareStatement(
						"INSERT INTO detalle_solicitud_viatico( "
						+ "monto_solicitado, "
						+ "monto_otorgado, "
						+ "monto_comprobado, "
						+ "comprobacion_valida, "
						+ "solicitud_viaticos, "
						+ "partida) "
						+ "VALUES (?,?,?,?,?,?);");
				ps.setString(1, detalleSolicitudViatico.getMontoSolicitado());
				ps.setString(2, detalleSolicitudViatico.getMontoOtorgado());
				ps.setString(3, detalleSolicitudViatico.getMontoComprobado());
				ps.setString(4, detalleSolicitudViatico.getComprobacionValida());
				ps.setString(5, detalleSolicitudViatico.getSolicitudViatico());
				ps.setString(6, detalleSolicitudViatico.getPartida());
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int editarDetalleSolicitudViatico(DetalleSolicitudViatico detalleSolicitudViatico){
		int result =0;
		if (connection != null) {
			try {
				ps = connection.prepareStatement(
						"UPDATE detalle_solicitud_viatico SET "
						+ "monto_solicitado = ? , "
						+ "monto_otorgado = ? , "
						+ "monto_comprobado = ? , "
						+ "comprobacion_valida = ? , "
						+ "solicitud_viaticos = ? , "
						+ "partida = ?  "
						+ "WHERE id = ? ;");
				ps.setString(1, detalleSolicitudViatico.getMontoSolicitado());
				ps.setString(2, detalleSolicitudViatico.getMontoOtorgado());
				ps.setString(3, detalleSolicitudViatico.getMontoComprobado());
				ps.setString(4, detalleSolicitudViatico.getComprobacionValida());
				ps.setString(5, detalleSolicitudViatico.getSolicitudViatico());
				ps.setString(6, detalleSolicitudViatico.getPartida());
				ps.setInt(7, detalleSolicitudViatico.getId());
				
				
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	public int eliminarDetalleSolicitudViatico(int id){
		int result =0;
		if (connection != null) {
			try {
				ps = connection.prepareStatement(
						"DELETE FROM detalle_solicitud_viatico WHERE id = ?;");
				ps.setInt(1, id);
				result =ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public DetalleSolicitudViatico[] getDetalle(){
		DetalleSolicitudViatico[] result = null;
		List<DetalleSolicitudViatico> detallesViaticos = new ArrayList<DetalleSolicitudViatico>();
		
		if (connection != null) {
			try {
				statement = connection.createStatement();
				resultSet = statement.executeQuery(
						"SELECT * FROM detalle_solicitud_viatico;");
				while (resultSet.next()) {
					DetalleSolicitudViatico detalleSolicitudViatico = new DetalleSolicitudViatico(
							resultSet.getInt("id"),
							resultSet.getString("monto_solicitado"),
							resultSet.getString("monto_otorgado"),
							resultSet.getString("monto_comprobado"),
							resultSet.getString("comprobacion_valida"),
							resultSet.getString("solicitud_viaticos"),
							resultSet.getString("partida"));
					detallesViaticos.add(detalleSolicitudViatico);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		result = detallesViaticos.toArray(new DetalleSolicitudViatico[detallesViaticos.size()]);
		return result;
	}
	
	
	public DetalleSolicitudViatico obtenerDetalleSolicitudViatico(int id){
		DetalleSolicitudViatico detalleSolicitudViatico = null;
		
		if (connection != null) {
			try {
				ps = connection.prepareStatement("SELECT * FROM detalle_solicitud_viatico WHERE id = ?;");
				ps.setInt(1, id);
			    resultSet = ps.executeQuery();
				if(resultSet.next()) {
					detalleSolicitudViatico = new DetalleSolicitudViatico(
							resultSet.getInt("id"),
							resultSet.getString("monto_solicitado"),
							resultSet.getString("monto_otorgado"),
							resultSet.getString("monto_comprobado"),
							resultSet.getString("comprobacion_valida"),
							resultSet.getString("solicitud_viaticos"),
							resultSet.getString("partida"));
					
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return detalleSolicitudViatico;
	}
}
