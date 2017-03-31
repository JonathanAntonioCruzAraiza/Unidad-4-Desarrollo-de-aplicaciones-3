/**
 * DetalleSolicitudViatico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.edu.utng.ws;

public class DetalleSolicitudViatico  implements java.io.Serializable {
    private java.lang.String comprobacionValida;

    private int id;

    private java.lang.String montoComprobado;

    private java.lang.String montoOtorgado;

    private java.lang.String montoSolicitado;

    private java.lang.String partida;

    private java.lang.String solicitudViatico;

    public DetalleSolicitudViatico() {
    }

    public DetalleSolicitudViatico(
           java.lang.String comprobacionValida,
           int id,
           java.lang.String montoComprobado,
           java.lang.String montoOtorgado,
           java.lang.String montoSolicitado,
           java.lang.String partida,
           java.lang.String solicitudViatico) {
           this.comprobacionValida = comprobacionValida;
           this.id = id;
           this.montoComprobado = montoComprobado;
           this.montoOtorgado = montoOtorgado;
           this.montoSolicitado = montoSolicitado;
           this.partida = partida;
           this.solicitudViatico = solicitudViatico;
    }


    /**
     * Gets the comprobacionValida value for this DetalleSolicitudViatico.
     * 
     * @return comprobacionValida
     */
    public java.lang.String getComprobacionValida() {
        return comprobacionValida;
    }


    /**
     * Sets the comprobacionValida value for this DetalleSolicitudViatico.
     * 
     * @param comprobacionValida
     */
    public void setComprobacionValida(java.lang.String comprobacionValida) {
        this.comprobacionValida = comprobacionValida;
    }


    /**
     * Gets the id value for this DetalleSolicitudViatico.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DetalleSolicitudViatico.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the montoComprobado value for this DetalleSolicitudViatico.
     * 
     * @return montoComprobado
     */
    public java.lang.String getMontoComprobado() {
        return montoComprobado;
    }


    /**
     * Sets the montoComprobado value for this DetalleSolicitudViatico.
     * 
     * @param montoComprobado
     */
    public void setMontoComprobado(java.lang.String montoComprobado) {
        this.montoComprobado = montoComprobado;
    }


    /**
     * Gets the montoOtorgado value for this DetalleSolicitudViatico.
     * 
     * @return montoOtorgado
     */
    public java.lang.String getMontoOtorgado() {
        return montoOtorgado;
    }


    /**
     * Sets the montoOtorgado value for this DetalleSolicitudViatico.
     * 
     * @param montoOtorgado
     */
    public void setMontoOtorgado(java.lang.String montoOtorgado) {
        this.montoOtorgado = montoOtorgado;
    }


    /**
     * Gets the montoSolicitado value for this DetalleSolicitudViatico.
     * 
     * @return montoSolicitado
     */
    public java.lang.String getMontoSolicitado() {
        return montoSolicitado;
    }


    /**
     * Sets the montoSolicitado value for this DetalleSolicitudViatico.
     * 
     * @param montoSolicitado
     */
    public void setMontoSolicitado(java.lang.String montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }


    /**
     * Gets the partida value for this DetalleSolicitudViatico.
     * 
     * @return partida
     */
    public java.lang.String getPartida() {
        return partida;
    }


    /**
     * Sets the partida value for this DetalleSolicitudViatico.
     * 
     * @param partida
     */
    public void setPartida(java.lang.String partida) {
        this.partida = partida;
    }


    /**
     * Gets the solicitudViatico value for this DetalleSolicitudViatico.
     * 
     * @return solicitudViatico
     */
    public java.lang.String getSolicitudViatico() {
        return solicitudViatico;
    }


    /**
     * Sets the solicitudViatico value for this DetalleSolicitudViatico.
     * 
     * @param solicitudViatico
     */
    public void setSolicitudViatico(java.lang.String solicitudViatico) {
        this.solicitudViatico = solicitudViatico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetalleSolicitudViatico)) return false;
        DetalleSolicitudViatico other = (DetalleSolicitudViatico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comprobacionValida==null && other.getComprobacionValida()==null) || 
             (this.comprobacionValida!=null &&
              this.comprobacionValida.equals(other.getComprobacionValida()))) &&
            this.id == other.getId() &&
            ((this.montoComprobado==null && other.getMontoComprobado()==null) || 
             (this.montoComprobado!=null &&
              this.montoComprobado.equals(other.getMontoComprobado()))) &&
            ((this.montoOtorgado==null && other.getMontoOtorgado()==null) || 
             (this.montoOtorgado!=null &&
              this.montoOtorgado.equals(other.getMontoOtorgado()))) &&
            ((this.montoSolicitado==null && other.getMontoSolicitado()==null) || 
             (this.montoSolicitado!=null &&
              this.montoSolicitado.equals(other.getMontoSolicitado()))) &&
            ((this.partida==null && other.getPartida()==null) || 
             (this.partida!=null &&
              this.partida.equals(other.getPartida()))) &&
            ((this.solicitudViatico==null && other.getSolicitudViatico()==null) || 
             (this.solicitudViatico!=null &&
              this.solicitudViatico.equals(other.getSolicitudViatico())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getComprobacionValida() != null) {
            _hashCode += getComprobacionValida().hashCode();
        }
        _hashCode += getId();
        if (getMontoComprobado() != null) {
            _hashCode += getMontoComprobado().hashCode();
        }
        if (getMontoOtorgado() != null) {
            _hashCode += getMontoOtorgado().hashCode();
        }
        if (getMontoSolicitado() != null) {
            _hashCode += getMontoSolicitado().hashCode();
        }
        if (getPartida() != null) {
            _hashCode += getPartida().hashCode();
        }
        if (getSolicitudViatico() != null) {
            _hashCode += getSolicitudViatico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetalleSolicitudViatico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "DetalleSolicitudViatico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comprobacionValida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "comprobacionValida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoComprobado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "montoComprobado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoOtorgado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "montoOtorgado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoSolicitado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "montoSolicitado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "partida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitudViatico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "solicitudViatico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
