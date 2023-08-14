/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MINH
 */
public class DB {
    public Connection conn;
    protected String url = "jdbc:mysql://localhost:3306/bmhotel";
    protected String user = "root";
    protected String password = "";
    
    public DB() {
    try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("An error occurred while onnecting MySQL databse");
            e.printStackTrace();
        }
    }
}
