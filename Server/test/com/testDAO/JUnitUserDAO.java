/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testDAO;

import com.flappybird.dao.UserDAO;
import com.flappybird.user.User;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author luuhu
 */
public class JUnitUserDAO {
    
    @Test
    public void testCheckLogin(){
        User user = new User();
        UserDAO userDAO = new UserDAO();
        user.setUsername("huy");
        user.setPassword("huy");
        assertEquals(userDAO.checkLogin(user), true);
    }
}
