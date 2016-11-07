/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author UKI
 */
public class Database {
    private String server = "jdbc:mysql://localhost:3306/akademik", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;
    
    public void connect() throws SQLException {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();
    }
}
