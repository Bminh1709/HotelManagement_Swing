/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Core.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MINH
 */
public class AccessController extends DB{
    
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM `admin` WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false on error
        }
    }
}
