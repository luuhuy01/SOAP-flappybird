/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flappybird.dao;

import com.flappybird.user.Score;
import com.flappybird.user.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luuhu
 */
public class UserDAO extends DAO{
    
    public UserDAO() {
    }
    
    public User checkLogin(User user){
        String sql = "select  u.id, u.name from user u where u.username = ? and u.password = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                
                user.setId(id);
                user.setName(name);
                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
        return null;
    }
    
    public boolean saveRegister(User user){
        String sql = "INSERT INTO user(username, password, name) VALUES(?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
     public List<Score> getScoreHistory(User user){
        List<Score> scores = new ArrayList<>();
        
        String sql = "SELECT  score.id, score.score, score.create_at FROM `user` "
                + "INNER JOIN score  "
                + "ON user.id = score.user_id "
                + "WHERE user.username = ? "
                + "ORDER BY create_at DESC";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                int score = rs.getInt("score");
                Date date = rs.getDate("create_at");
                Score s = new Score();
                s.setId(id);
                s.setScore(score);
                s.setCreateAt(date);
                scores.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scores;
    }
  
}
