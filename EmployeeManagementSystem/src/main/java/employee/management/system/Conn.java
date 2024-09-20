package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection conn;
    Statement statement;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "root");
            statement = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}