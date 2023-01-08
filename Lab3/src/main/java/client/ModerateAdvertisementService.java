
package client;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ModerateAdvertisementService", targetNamespace = "http://moderate_advertisement/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ModerateAdvertisementService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns client.ModerateAdvertisementStatement
     */
    @WebMethod(operationName = "CreateStatement")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CreateStatement", targetNamespace = "http://moderate_advertisement/", className = "client.CreateStatement")
    @ResponseWrapper(localName = "CreateStatementResponse", targetNamespace = "http://moderate_advertisement/", className = "client.CreateStatementResponse")
    @Action(input = "http://moderate_advertisement/ModerateAdvertisementService/CreateStatementRequest", output = "http://moderate_advertisement/ModerateAdvertisementService/CreateStatementResponse")
    public ModerateAdvertisementStatement createStatement(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        PostAdvertisementStatement arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<client.AllowAdvertisementResponse>
     */
    @WebMethod(operationName = "AllowAdvertisement")
    @RequestWrapper(localName = "AllowAdvertisement", targetNamespace = "http://moderate_advertisement/", className = "client.AllowAdvertisement")
    @ResponseWrapper(localName = "AllowAdvertisementResponse", targetNamespace = "http://moderate_advertisement/", className = "client.AllowAdvertisementResponse")
    public Response<AllowAdvertisementResponse> allowAdvertisementAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        ModerateAdvertisementStatement arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AllowAdvertisement")
    @RequestWrapper(localName = "AllowAdvertisement", targetNamespace = "http://moderate_advertisement/", className = "client.AllowAdvertisement")
    @ResponseWrapper(localName = "AllowAdvertisementResponse", targetNamespace = "http://moderate_advertisement/", className = "client.AllowAdvertisementResponse")
    public Future<?> allowAdvertisementAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        ModerateAdvertisementStatement arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<AllowAdvertisementResponse> asyncHandler);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns client.ModerateAdvertisementStatement
     */
    @WebMethod(operationName = "AllowAdvertisement")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AllowAdvertisement", targetNamespace = "http://moderate_advertisement/", className = "client.AllowAdvertisement")
    @ResponseWrapper(localName = "AllowAdvertisementResponse", targetNamespace = "http://moderate_advertisement/", className = "client.AllowAdvertisementResponse")
    @Action(input = "http://moderate_advertisement/ModerateAdvertisementService/AllowAdvertisementRequest", output = "http://moderate_advertisement/ModerateAdvertisementService/AllowAdvertisementResponse")
    public ModerateAdvertisementStatement allowAdvertisement(
        @WebParam(name = "arg0", targetNamespace = "")
        ModerateAdvertisementStatement arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1);

}
