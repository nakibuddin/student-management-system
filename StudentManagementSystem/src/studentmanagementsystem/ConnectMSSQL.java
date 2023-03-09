/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author RrReyad
 */
public class ConnectMSSQL {
    Connection conn;

    /**
     *
     * @return
     */
    public static Connection connectDB(){
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection conn = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=Student;selectMethod=cursor", "sa", "123456");
return conn;
}
 catch (Exception e) {
JOptionPane.showMessageDialog(null,e);
        return null;}
        

}
}
