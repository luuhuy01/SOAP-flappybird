
package com.flappybird.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flappybird.service package. 
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

    private final static QName _GetScoreHistory_QNAME = new QName("http://service.flappybird.com/", "getScoreHistory");
    private final static QName _GetTopScoreUser_QNAME = new QName("http://service.flappybird.com/", "getTopScoreUser");
    private final static QName _GetTopScoreUserResponse_QNAME = new QName("http://service.flappybird.com/", "getTopScoreUserResponse");
    private final static QName _SaveRegisterResponse_QNAME = new QName("http://service.flappybird.com/", "saveRegisterResponse");
    private final static QName _CheckLogin_QNAME = new QName("http://service.flappybird.com/", "checkLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://service.flappybird.com/", "checkLoginResponse");
    private final static QName _SaveScore_QNAME = new QName("http://service.flappybird.com/", "saveScore");
    private final static QName _GetScoreHistoryResponse_QNAME = new QName("http://service.flappybird.com/", "getScoreHistoryResponse");
    private final static QName _SaveScoreResponse_QNAME = new QName("http://service.flappybird.com/", "saveScoreResponse");
    private final static QName _SaveRegister_QNAME = new QName("http://service.flappybird.com/", "saveRegister");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flappybird.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveScoreResponse }
     * 
     */
    public SaveScoreResponse createSaveScoreResponse() {
        return new SaveScoreResponse();
    }

    /**
     * Create an instance of {@link SaveRegister }
     * 
     */
    public SaveRegister createSaveRegister() {
        return new SaveRegister();
    }

    /**
     * Create an instance of {@link GetScoreHistory }
     * 
     */
    public GetScoreHistory createGetScoreHistory() {
        return new GetScoreHistory();
    }

    /**
     * Create an instance of {@link GetTopScoreUser }
     * 
     */
    public GetTopScoreUser createGetTopScoreUser() {
        return new GetTopScoreUser();
    }

    /**
     * Create an instance of {@link GetTopScoreUserResponse }
     * 
     */
    public GetTopScoreUserResponse createGetTopScoreUserResponse() {
        return new GetTopScoreUserResponse();
    }

    /**
     * Create an instance of {@link SaveRegisterResponse }
     * 
     */
    public SaveRegisterResponse createSaveRegisterResponse() {
        return new SaveRegisterResponse();
    }

    /**
     * Create an instance of {@link GetScoreHistoryResponse }
     * 
     */
    public GetScoreHistoryResponse createGetScoreHistoryResponse() {
        return new GetScoreHistoryResponse();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link SaveScore }
     * 
     */
    public SaveScore createSaveScore() {
        return new SaveScore();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoreHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "getScoreHistory")
    public JAXBElement<GetScoreHistory> createGetScoreHistory(GetScoreHistory value) {
        return new JAXBElement<GetScoreHistory>(_GetScoreHistory_QNAME, GetScoreHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTopScoreUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "getTopScoreUser")
    public JAXBElement<GetTopScoreUser> createGetTopScoreUser(GetTopScoreUser value) {
        return new JAXBElement<GetTopScoreUser>(_GetTopScoreUser_QNAME, GetTopScoreUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTopScoreUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "getTopScoreUserResponse")
    public JAXBElement<GetTopScoreUserResponse> createGetTopScoreUserResponse(GetTopScoreUserResponse value) {
        return new JAXBElement<GetTopScoreUserResponse>(_GetTopScoreUserResponse_QNAME, GetTopScoreUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "saveRegisterResponse")
    public JAXBElement<SaveRegisterResponse> createSaveRegisterResponse(SaveRegisterResponse value) {
        return new JAXBElement<SaveRegisterResponse>(_SaveRegisterResponse_QNAME, SaveRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "saveScore")
    public JAXBElement<SaveScore> createSaveScore(SaveScore value) {
        return new JAXBElement<SaveScore>(_SaveScore_QNAME, SaveScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoreHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "getScoreHistoryResponse")
    public JAXBElement<GetScoreHistoryResponse> createGetScoreHistoryResponse(GetScoreHistoryResponse value) {
        return new JAXBElement<GetScoreHistoryResponse>(_GetScoreHistoryResponse_QNAME, GetScoreHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "saveScoreResponse")
    public JAXBElement<SaveScoreResponse> createSaveScoreResponse(SaveScoreResponse value) {
        return new JAXBElement<SaveScoreResponse>(_SaveScoreResponse_QNAME, SaveScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.flappybird.com/", name = "saveRegister")
    public JAXBElement<SaveRegister> createSaveRegister(SaveRegister value) {
        return new JAXBElement<SaveRegister>(_SaveRegister_QNAME, SaveRegister.class, null, value);
    }

}
