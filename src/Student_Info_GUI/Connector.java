package Student_Info_GUI;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/studentdb"; 
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");
        } catch (Exception e) {
            System.out.println("Connection error: " + e.getMessage());
        }
        return conn;
    }
}
