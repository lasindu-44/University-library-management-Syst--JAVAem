/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crx
 */
public class connect {
    
    Connection c;
    Statement s;
    
    public connect() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///project","root","");  
            System.out.print("Databse connected");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
