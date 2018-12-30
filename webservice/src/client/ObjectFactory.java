
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _SendEmail_QNAME = new QName("http://webservice/", "sendEmail");
    private final static QName _SendEmailBatch_QNAME = new QName("http://webservice/", "sendEmailBatch");
    private final static QName _SendEmailBatchResponse_QNAME = new QName("http://webservice/", "sendEmailBatchResponse");
    private final static QName _SendEmailResponse_QNAME = new QName("http://webservice/", "sendEmailResponse");
    private final static QName _ValidateEmailAddress_QNAME = new QName("http://webservice/", "validateEmailAddress");
    private final static QName _ValidateEmailAddressResponse_QNAME = new QName("http://webservice/", "validateEmailAddressResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailBatch }
     * 
     */
    public SendEmailBatch createSendEmailBatch() {
        return new SendEmailBatch();
    }

    /**
     * Create an instance of {@link SendEmailBatchResponse }
     * 
     */
    public SendEmailBatchResponse createSendEmailBatchResponse() {
        return new SendEmailBatchResponse();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link ValidateEmailAddress }
     * 
     */
    public ValidateEmailAddress createValidateEmailAddress() {
        return new ValidateEmailAddress();
    }

    /**
     * Create an instance of {@link ValidateEmailAddressResponse }
     * 
     */
    public ValidateEmailAddressResponse createValidateEmailAddressResponse() {
        return new ValidateEmailAddressResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendEmailBatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sendEmailBatch")
    public JAXBElement<SendEmailBatch> createSendEmailBatch(SendEmailBatch value) {
        return new JAXBElement<SendEmailBatch>(_SendEmailBatch_QNAME, SendEmailBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendEmailBatchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sendEmailBatchResponse")
    public JAXBElement<SendEmailBatchResponse> createSendEmailBatchResponse(SendEmailBatchResponse value) {
        return new JAXBElement<SendEmailBatchResponse>(_SendEmailBatchResponse_QNAME, SendEmailBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateEmailAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateEmailAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "validateEmailAddress")
    public JAXBElement<ValidateEmailAddress> createValidateEmailAddress(ValidateEmailAddress value) {
        return new JAXBElement<ValidateEmailAddress>(_ValidateEmailAddress_QNAME, ValidateEmailAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateEmailAddressResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateEmailAddressResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "validateEmailAddressResponse")
    public JAXBElement<ValidateEmailAddressResponse> createValidateEmailAddressResponse(ValidateEmailAddressResponse value) {
        return new JAXBElement<ValidateEmailAddressResponse>(_ValidateEmailAddressResponse_QNAME, ValidateEmailAddressResponse.class, null, value);
    }

}
