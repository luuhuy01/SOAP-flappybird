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
public class UserDAO extends DAO {

    public UserDAO() {
    }

    public User checkLogin(User user) {
        String sql = "select  u.id, u.name, u.phone, u.position, u.status from user u where u.username = ? and u.password = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String phone = rs.getString(3);
                String position = rs.getString(4);
                int status = rs.getInt(5);
                
                user.setId(id);
                user.setName(name);
                user.setPhone(phone);
                user.setPosition(position);
                if(status > 0){
                    user.setStatus(true);
                }else{
                    user.setStatus(false);
                }
                
                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean saveRegister(User user) {
        String sql = "INSERT INTO user(username, password, name, phone, position, status) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getPhone());
            ps.setString(5, "USER");
            ps.setInt(6, 1);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Score> getScoreHistory(User user) {
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
            while (rs.next()) {
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

    public boolean addUser(User user) {
        String sql = "INSERT INTO user(username, password, name, phone, position, status) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getPosition());
            if (user.getStatus()) {
                ps.setInt(6, 1);
            } else {
                ps.setInt(6, 0);
            }
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean editUser(User user) {
        String sql = "UPDATE user SET username = ?, password = ?, name = ?, phone = ?, position = ?, status = ? WHERE id = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getPosition());
            if (user.getStatus()) {
                ps.setInt(6, 1);
            } else {
                ps.setInt(6, 0);
            }
            ps.setInt(7, user.getId());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();          
            return false;
        }
        return true;
    }

    public boolean deleteUser(User user) {
        String sql = "UPDATE user SET status = '0' WHERE id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, user.getId());
            
            ps.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
            return false;
        }
        return true;
    }

    public List<User> findUserByName(String name) {
        List<User> users = new ArrayList<>();
        String sql = "SELECT id, username, password, name, phone, position, status FROM user WHERE name LIKE ?";
        String key = "%" + name + "%";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, key);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setName(rs.getString(4));
                user.setPhone(rs.getString(5));
                user.setPosition(rs.getString(6));
                if(rs.getInt(7) >0 ){
                    user.setStatus(true);
                }else{
                    user.setStatus(false);
                }
                
                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }
}
