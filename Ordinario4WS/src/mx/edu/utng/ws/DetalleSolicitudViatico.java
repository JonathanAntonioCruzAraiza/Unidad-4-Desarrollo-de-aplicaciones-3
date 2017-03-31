package mx.edu.utng.ws;

public class DetalleSolicitudViatico {
	private int id;
	private String montoSolicitado;
	private String montoOtorgado;
	private String montoComprobado;
	private String comprobacionValida;
	private String solicitudViatico;
	private String partida;
	
	
	
	public DetalleSolicitudViatico(int id, String  montoSolicitado,
			String montoOtorgado, String montoComprobado, String comprobacionValida,
			String solicitudViatico ,String partida) {
		super();
		this.id = id;
		this.montoSolicitado = montoSolicitado;
		this.montoOtorgado = montoOtorgado;
		this.montoComprobado = montoComprobado;
		this.comprobacionValida =comprobacionValida;
		this.solicitudViatico = solicitudViatico;
		this.partida = partida;
	}



	public DetalleSolicitudViatico() {
		this(0,"","","","","","");
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMontoSolicitado() {
		return montoSolicitado;
	}



	public void setMontoSolicitado(String montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}



	public String getMontoOtorgado() {
		return montoOtorgado;
	}



	public void setMontoOtorgado(String montoOtorgado) {
		this.montoOtorgado = montoOtorgado;
	}



	public String getMontoComprobado() {
		return montoComprobado;
	}



	public void setMontoComprobado(String montoComprobado) {
		this.montoComprobado = montoComprobado;
	}



	public String getComprobacionValida() {
		return comprobacionValida;
	}



	public void setComprobacionValida(String comprobacionValida) {
		this.comprobacionValida = comprobacionValida;
	}



	public String getSolicitudViatico() {
		return solicitudViatico;
	}



	public void setSolicitudViatico(String solicitudViatico) {
		this.solicitudViatico = solicitudViatico;
	}



	public String getPartida() {
		return partida;
	}



	public void setPartida(String partida) {
		this.partida = partida;
	}



	@Override
	public String toString() {
		return "DetalleSolicitudViatico [id=" + id + ", montoSolicitado=" + montoSolicitado + ", montoOtorgado="
				+ montoOtorgado + ", montoComprobado=" + montoComprobado + ", comprobacionValida=" + comprobacionValida
				+ ", solicitudViatico=" + solicitudViatico + ", partida=" + partida + "]";
	}

  
	


}
