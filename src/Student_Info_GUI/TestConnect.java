package Student_Info_GUI;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class TestConnect {
    public static void main(String[] args) {
        Connection con = Connector.connect();
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Database connected successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Database connection failed!");
        }
    }
}
