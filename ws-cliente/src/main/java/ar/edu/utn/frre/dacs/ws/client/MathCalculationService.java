
package ar.edu.utn.frre.dacs.ws.client;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MathCalculationService", targetNamespace = "http://www.frre.utn.edu.ar/wsdl", wsdlLocation = "http://localhost:8080/ws-server/MathCalculationService/SimpleMathCalculationServiceImpl?wsdl")
public class MathCalculationService
    extends Service
{

    private final static URL MATHCALCULATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException MATHCALCULATIONSERVICE_EXCEPTION;
    private final static QName MATHCALCULATIONSERVICE_QNAME = new QName("http://www.frre.utn.edu.ar/wsdl", "MathCalculationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws-server/MathCalculationService/SimpleMathCalculationServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MATHCALCULATIONSERVICE_WSDL_LOCATION = url;
        MATHCALCULATIONSERVICE_EXCEPTION = e;
    }

    public MathCalculationService() {
        super(__getWsdlLocation(), MATHCALCULATIONSERVICE_QNAME);
    }

    public MathCalculationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MATHCALCULATIONSERVICE_QNAME, features);
    }

    public MathCalculationService(URL wsdlLocation) {
        super(wsdlLocation, MATHCALCULATIONSERVICE_QNAME);
    }

    public MathCalculationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MATHCALCULATIONSERVICE_QNAME, features);
    }

    public MathCalculationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MathCalculationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MathCalculationServer
     */
    @WebEndpoint(name = "MathCalculationPort")
    public MathCalculationServer getMathCalculationPort() {
        return super.getPort(new QName("http://www.frre.utn.edu.ar/wsdl", "MathCalculationPort"), MathCalculationServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MathCalculationServer
     */
    @WebEndpoint(name = "MathCalculationPort")
    public MathCalculationServer getMathCalculationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.frre.utn.edu.ar/wsdl", "MathCalculationPort"), MathCalculationServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MATHCALCULATIONSERVICE_EXCEPTION!= null) {
            throw MATHCALCULATIONSERVICE_EXCEPTION;
        }
        return MATHCALCULATIONSERVICE_WSDL_LOCATION;
    }

}
