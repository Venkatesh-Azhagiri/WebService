
package org.example.hello;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.hello package. 
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

    private final static QName _SayHello_QNAME = new QName("http://www.example.org/hello/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://www.example.org/hello/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.hello
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloOperationResponse1 }
     * 
     */
    public SayHelloOperationResponse1 createSayHelloOperationResponse1() {
        return new SayHelloOperationResponse1();
    }

    /**
     * Create an instance of {@link SayHelloOperation }
     * 
     */
    public SayHelloOperation createSayHelloOperation() {
        return new SayHelloOperation();
    }

    /**
     * Create an instance of {@link NewOperationResponse }
     * 
     */
    public NewOperationResponse createNewOperationResponse() {
        return new NewOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/hello/", name = "sayHello")
    public JAXBElement<String> createSayHello(String value) {
        return new JAXBElement<String>(_SayHello_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/hello/", name = "sayHelloResponse")
    public JAXBElement<String> createSayHelloResponse(String value) {
        return new JAXBElement<String>(_SayHelloResponse_QNAME, String.class, null, value);
    }

}
