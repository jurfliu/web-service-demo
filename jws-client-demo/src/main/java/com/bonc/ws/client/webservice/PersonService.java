
package com.bonc.ws.client.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonService", targetNamespace = "http://impl.webservice.xj.bonc.com/", wsdlLocation = "http://localhost:8002/ws-demo?wsdl")
public class PersonService
    extends Service
{

    private final static URL PERSONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONSERVICE_EXCEPTION;
    private final static QName PERSONSERVICE_QNAME = new QName("http://impl.webservice.xj.bonc.com/", "PersonService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8002/ws-demo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONSERVICE_WSDL_LOCATION = url;
        PERSONSERVICE_EXCEPTION = e;
    }

    public PersonService() {
        super(__getWsdlLocation(), PERSONSERVICE_QNAME);
    }

    public PersonService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONSERVICE_QNAME, features);
    }

    public PersonService(URL wsdlLocation) {
        super(wsdlLocation, PERSONSERVICE_QNAME);
    }

    public PersonService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONSERVICE_QNAME, features);
    }

    public PersonService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Speaker
     */
    @WebEndpoint(name = "PersonPort")
    public Speaker getPersonPort() {
        return super.getPort(new QName("http://impl.webservice.xj.bonc.com/", "PersonPort"), Speaker.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Speaker
     */
    @WebEndpoint(name = "PersonPort")
    public Speaker getPersonPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.webservice.xj.bonc.com/", "PersonPort"), Speaker.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONSERVICE_EXCEPTION!= null) {
            throw PERSONSERVICE_EXCEPTION;
        }
        return PERSONSERVICE_WSDL_LOCATION;
    }

}
