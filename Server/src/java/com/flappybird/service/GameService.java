/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flappybird.service;

import com.flappybird.dao.ScoreDAO;
import com.flappybird.dao.UserDAO;
import com.flappybird.user.Score;
import com.flappybird.user.User;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author luuhu
 */
@WebService(serviceName = "GameService")
public class GameService {


    @WebMethod(operationName = "checkLogin")
    public User checkLogin(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        User userRes = userDAO.checkLogin(user);
        return userRes;
    }

    @WebMethod(operationName = "saveRegister")
    public Boolean saveRegister(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        return userDAO.saveRegister(user);
    }

    @WebMethod(operationName = "saveScore")
    public Boolean saveScore(@WebParam(name = "user") User user,@WebParam(name = "score") int score) {
        ScoreDAO scoreDAO = new ScoreDAO();
        return scoreDAO.saveScore(user, score);
    }

    @WebMethod(operationName = "getScoreHistory")
    public List<Score> getScoreHistory(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        return userDAO.getScoreHistory(user);   
    }
    
    
    @WebMethod(operationName = "getTopScoreUser")
    public List<Score> getTopScoreUser() {
        ScoreDAO scoreDAO = new ScoreDAO();
        return scoreDAO.getTopScoreUser();
    }


    @WebMethod(operationName = "addUser")
    public Boolean addUser(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        return userDAO.addUser(user);
    }

    @WebMethod(operationName = "editUser")
    public Boolean editUser(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        return userDAO.editUser(user);
    }

    @WebMethod(operationName = "deleteUser")
    public Boolean deleteUser(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        return userDAO.deleteUser(user);
    }

    @WebMethod(operationName = "findUserByName")
    public List<User> findUserByName(@WebParam(name = "name") String name) {
        UserDAO userDAO = new UserDAO();
        return userDAO.findUserByName(name);
    }

    @WebMethod(operationName = "countOfPlay")
    public List<String> countOfPlay() {
        ScoreDAO scoreDAO = new ScoreDAO();
        return scoreDAO.countOfPlay();
    }

}
