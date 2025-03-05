/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricitymanagment;

/**
 *
 * @author rashique
 * jdbc:mysql://localhost:3305/ebs?zeroDateTimeBehavior=CONVERT_TO_NULL
 */
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3305/ebs", "root", "Rashique@123"); // replace the password according to your account
            s = c.createStatement();
        } catch (Exception e) {
        }
    }
}
