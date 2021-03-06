
package com.flappybird.service;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GameService", targetNamespace = "http://service.flappybird.com/", wsdlLocation = "http://localhost:8080/Server/GameService?WSDL")
public class GameService_Service
    extends Service
{

    private final static URL GAMESERVICE_WSDL_LOCATION;
    private final static WebServiceException GAMESERVICE_EXCEPTION;
    private final static QName GAMESERVICE_QNAME = new QName("http://service.flappybird.com/", "GameService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Server/GameService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GAMESERVICE_WSDL_LOCATION = url;
        GAMESERVICE_EXCEPTION = e;
    }

    public GameService_Service() {
        super(__getWsdlLocation(), GAMESERVICE_QNAME);
    }

    public GameService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GAMESERVICE_QNAME, features);
    }

    public GameService_Service(URL wsdlLocation) {
        super(wsdlLocation, GAMESERVICE_QNAME);
    }

    public GameService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GAMESERVICE_QNAME, features);
    }

    public GameService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GameService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GameService
     */
    @WebEndpoint(name = "GameServicePort")
    public GameService getGameServicePort() {
        return super.getPort(new QName("http://service.flappybird.com/", "GameServicePort"), GameService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GameService
     */
    @WebEndpoint(name = "GameServicePort")
    public GameService getGameServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.flappybird.com/", "GameServicePort"), GameService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GAMESERVICE_EXCEPTION!= null) {
            throw GAMESERVICE_EXCEPTION;
        }
        return GAMESERVICE_WSDL_LOCATION;
    }

}
