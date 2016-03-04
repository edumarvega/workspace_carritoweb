
package ar.com.templateit.cds.web.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.templateit.cds.web.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoadUsuarioEcommerceResponse_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "loadUsuarioEcommerceResponse");
    private final static QName _GetUsuarioEcommerceByIdResponse_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "getUsuarioEcommerceByIdResponse");
    private final static QName _Delete_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "delete");
    private final static QName _SaveResponse_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "saveResponse");
    private final static QName _Save_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "save");
    private final static QName _GetUsuarioEcommerceById_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "getUsuarioEcommerceById");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "updateResponse");
    private final static QName _LoadUsuarioEcommerce_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "loadUsuarioEcommerce");
    private final static QName _DeleteResponse_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "deleteResponse");
    private final static QName _Update_QNAME = new QName("http://service.web.cds.templateit.com.ar/", "update");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.templateit.cds.web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link LoadUsuarioEcommerceResponse }
     * 
     */
    public LoadUsuarioEcommerceResponse createLoadUsuarioEcommerceResponse() {
        return new LoadUsuarioEcommerceResponse();
    }

    /**
     * Create an instance of {@link UsuarioEcommerce }
     * 
     */
    public UsuarioEcommerce createUsuarioEcommerce() {
        return new UsuarioEcommerce();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link GetUsuarioEcommerceById }
     * 
     */
    public GetUsuarioEcommerceById createGetUsuarioEcommerceById() {
        return new GetUsuarioEcommerceById();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link GetUsuarioEcommerceByIdResponse }
     * 
     */
    public GetUsuarioEcommerceByIdResponse createGetUsuarioEcommerceByIdResponse() {
        return new GetUsuarioEcommerceByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link LoadUsuarioEcommerce }
     * 
     */
    public LoadUsuarioEcommerce createLoadUsuarioEcommerce() {
        return new LoadUsuarioEcommerce();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadUsuarioEcommerceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "loadUsuarioEcommerceResponse")
    public JAXBElement<LoadUsuarioEcommerceResponse> createLoadUsuarioEcommerceResponse(LoadUsuarioEcommerceResponse value) {
        return new JAXBElement<LoadUsuarioEcommerceResponse>(_LoadUsuarioEcommerceResponse_QNAME, LoadUsuarioEcommerceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioEcommerceByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "getUsuarioEcommerceByIdResponse")
    public JAXBElement<GetUsuarioEcommerceByIdResponse> createGetUsuarioEcommerceByIdResponse(GetUsuarioEcommerceByIdResponse value) {
        return new JAXBElement<GetUsuarioEcommerceByIdResponse>(_GetUsuarioEcommerceByIdResponse_QNAME, GetUsuarioEcommerceByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioEcommerceById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "getUsuarioEcommerceById")
    public JAXBElement<GetUsuarioEcommerceById> createGetUsuarioEcommerceById(GetUsuarioEcommerceById value) {
        return new JAXBElement<GetUsuarioEcommerceById>(_GetUsuarioEcommerceById_QNAME, GetUsuarioEcommerceById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadUsuarioEcommerce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "loadUsuarioEcommerce")
    public JAXBElement<LoadUsuarioEcommerce> createLoadUsuarioEcommerce(LoadUsuarioEcommerce value) {
        return new JAXBElement<LoadUsuarioEcommerce>(_LoadUsuarioEcommerce_QNAME, LoadUsuarioEcommerce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.cds.templateit.com.ar/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

}
