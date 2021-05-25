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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
     
}
