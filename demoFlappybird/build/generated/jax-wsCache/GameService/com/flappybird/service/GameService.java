
package com.flappybird.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GameService", targetNamespace = "http://service.flappybird.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GameService {


    /**
     * 
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.AddUserResponse")
    @Action(input = "http://service.flappybird.com/GameService/addUserRequest", output = "http://service.flappybird.com/GameService/addUserResponse")
    public Boolean addUser(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.flappybird.service.Score
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHighestScoreAUser", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.GetHighestScoreAUser")
    @ResponseWrapper(localName = "getHighestScoreAUserResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.GetHighestScoreAUserResponse")
    @Action(input = "http://service.flappybird.com/GameService/getHighestScoreAUserRequest", output = "http://service.flappybird.com/GameService/getHighestScoreAUserResponse")
    public Score getHighestScoreAUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "countOfPlay", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.CountOfPlay")
    @ResponseWrapper(localName = "countOfPlayResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.CountOfPlayResponse")
    @Action(input = "http://service.flappybird.com/GameService/countOfPlayRequest", output = "http://service.flappybird.com/GameService/countOfPlayResponse")
    public List<String> countOfPlay();

    /**
     * 
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.DeleteUserResponse")
    @Action(input = "http://service.flappybird.com/GameService/deleteUserRequest", output = "http://service.flappybird.com/GameService/deleteUserResponse")
    public Boolean deleteUser(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editUser", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.EditUser")
    @ResponseWrapper(localName = "editUserResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.EditUserResponse")
    @Action(input = "http://service.flappybird.com/GameService/editUserRequest", output = "http://service.flappybird.com/GameService/editUserResponse")
    public Boolean editUser(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param name
     * @return
     *     returns java.util.List<com.flappybird.service.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUserByName", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.FindUserByName")
    @ResponseWrapper(localName = "findUserByNameResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.FindUserByNameResponse")
    @Action(input = "http://service.flappybird.com/GameService/findUserByNameRequest", output = "http://service.flappybird.com/GameService/findUserByNameResponse")
    public List<User> findUserByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.util.List<com.flappybird.service.Score>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTopScoreUser", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.GetTopScoreUser")
    @ResponseWrapper(localName = "getTopScoreUserResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.GetTopScoreUserResponse")
    @Action(input = "http://service.flappybird.com/GameService/getTopScoreUserRequest", output = "http://service.flappybird.com/GameService/getTopScoreUserResponse")
    public List<Score> getTopScoreUser();

    /**
     * 
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveRegister", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.SaveRegister")
    @ResponseWrapper(localName = "saveRegisterResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.SaveRegisterResponse")
    @Action(input = "http://service.flappybird.com/GameService/saveRegisterRequest", output = "http://service.flappybird.com/GameService/saveRegisterResponse")
    public Boolean saveRegister(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param score
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveScore", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.SaveScore")
    @ResponseWrapper(localName = "saveScoreResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.SaveScoreResponse")
    @Action(input = "http://service.flappybird.com/GameService/saveScoreRequest", output = "http://service.flappybird.com/GameService/saveScoreResponse")
    public Boolean saveScore(
        @WebParam(name = "user", targetNamespace = "")
        User user,
        @WebParam(name = "score", targetNamespace = "")
        int score);

    /**
     * 
     * @param user
     * @return
     *     returns java.util.List<com.flappybird.service.Score>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getScoreHistory", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.GetScoreHistory")
    @ResponseWrapper(localName = "getScoreHistoryResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.GetScoreHistoryResponse")
    @Action(input = "http://service.flappybird.com/GameService/getScoreHistoryRequest", output = "http://service.flappybird.com/GameService/getScoreHistoryResponse")
    public List<Score> getScoreHistory(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param user
     * @return
     *     returns com.flappybird.service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkLogin", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.CheckLogin")
    @ResponseWrapper(localName = "checkLoginResponse", targetNamespace = "http://service.flappybird.com/", className = "com.flappybird.service.CheckLoginResponse")
    @Action(input = "http://service.flappybird.com/GameService/checkLoginRequest", output = "http://service.flappybird.com/GameService/checkLoginResponse")
    public User checkLogin(
        @WebParam(name = "user", targetNamespace = "")
        User user);

}
