/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flappybird.dao;

import com.flappybird.user.Score;
import com.flappybird.user.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author luuhu
 */
public class ScoreDAO extends DAO{
    
    public boolean saveScore(User user, int score){
        String sql = "INSERT INTO score(score, create_at, user_id) VALUES(?, now(), ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);          
            ps.setInt(1, score);         
            ps.setInt(2, user.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
     
    public List<Score> getTopScoreUser(){
        List<Score> scores = new ArrayList<>();
        
        String sql = "SELECT user.id, username, name, score.id, score, create_at "
                + "FROM user INNER JOIN score "
                + "ON user.id = score.user_id "
                + "ORDER BY score.score DESC "
                + "LIMIT 10";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int userId = rs.getInt("user.id");
                String username = rs.getString("username");
                String name = rs.getString("name");
                User user = new User();
                user.setId(userId);
                user.setUsername(username);
                user.setName(name);
                int scoreId = rs.getInt("score.id");
                int score = rs.getInt("score");
                Date date = rs.getDate("create_at");
                Score s = new Score();
                s.setId(scoreId);
                s.setScore(score);
                s.setCreateAt(date);
                s.setUser(user);
                scores.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scores;
    }
     
    public List<String> countOfPlay(){
        List<String> list = new ArrayList<>();
        String sql = "SELECT u.username, count(s.score) as countOfPlay "
                + "FROM user u inner join score s on u.id =  s.user_id " 
                + "group by u.username "
                + "order by countOfPlay DESC;";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
                String username = rs.getString(1);
                int countOfPlay = rs.getInt(2);
                String result = username +" "+ countOfPlay;
                
                list.add(result);
            }         
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public Score getHighestScoreAUser(String username){
        
        String sql = "SELECT user.id, username, name, score.id, score, create_at "
                + "FROM user INNER JOIN score ON user.id = score.user_id "
                + "WHERE username = ? ORDER BY score.score DESC LIMIT 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int userId = rs.getInt("user.id");
                String name = rs.getString("name");
                User user = new User();
                user.setId(userId);
                user.setUsername(username);
                user.setName(name);
                int scoreId = rs.getInt("score.id");
                int score = rs.getInt("score");
                Date date = rs.getDate("create_at");
                Score s = new Score();
                s.setId(scoreId);
                s.setScore(score);
                s.setCreateAt(date);
                s.setUser(user);
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
