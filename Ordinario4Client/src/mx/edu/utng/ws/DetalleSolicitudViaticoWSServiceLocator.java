/**
 * DetalleSolicitudViaticoWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.edu.utng.ws;

public class DetalleSolicitudViaticoWSServiceLocator extends org.apache.axis.client.Service implements mx.edu.utng.ws.DetalleSolicitudViaticoWSService {

    public DetalleSolicitudViaticoWSServiceLocator() {
    }


    public DetalleSolicitudViaticoWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DetalleSolicitudViaticoWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DetalleSolicitudViaticoWS
    private java.lang.String DetalleSolicitudViaticoWS_address = "http://localhost:8080/Ordinario/services/DetalleSolicitudViaticoWS";

    public java.lang.String getDetalleSolicitudViaticoWSAddress() {
        return DetalleSolicitudViaticoWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DetalleSolicitudViaticoWSWSDDServiceName = "DetalleSolicitudViaticoWS";

    public java.lang.String getDetalleSolicitudViaticoWSWSDDServiceName() {
        return DetalleSolicitudViaticoWSWSDDServiceName;
    }

    public void setDetalleSolicitudViaticoWSWSDDServiceName(java.lang.String name) {
        DetalleSolicitudViaticoWSWSDDServiceName = name;
    }

    public mx.edu.utng.ws.DetalleSolicitudViaticoWS getDetalleSolicitudViaticoWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DetalleSolicitudViaticoWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDetalleSolicitudViaticoWS(endpoint);
    }

    public mx.edu.utng.ws.DetalleSolicitudViaticoWS getDetalleSolicitudViaticoWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.edu.utng.ws.DetalleSolicitudViaticoWSSoapBindingStub _stub = new mx.edu.utng.ws.DetalleSolicitudViaticoWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getDetalleSolicitudViaticoWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDetalleSolicitudViaticoWSEndpointAddress(java.lang.String address) {
        DetalleSolicitudViaticoWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.edu.utng.ws.DetalleSolicitudViaticoWS.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.edu.utng.ws.DetalleSolicitudViaticoWSSoapBindingStub _stub = new mx.edu.utng.ws.DetalleSolicitudViaticoWSSoapBindingStub(new java.net.URL(DetalleSolicitudViaticoWS_address), this);
                _stub.setPortName(getDetalleSolicitudViaticoWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DetalleSolicitudViaticoWS".equals(inputPortName)) {
            return getDetalleSolicitudViaticoWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.utng.edu.mx", "DetalleSolicitudViaticoWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.utng.edu.mx", "DetalleSolicitudViaticoWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DetalleSolicitudViaticoWS".equals(portName)) {
            setDetalleSolicitudViaticoWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
