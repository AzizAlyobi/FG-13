package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DB {

    private static Connection conn;

    private DB() {

    }

    public static Connection getConnection() {
        if (conn == null) {

            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://mysql5042.site4now.net:3306/db_a6f511_fg13kau?zeroDateTimeBehavior=convertToNull", "a6f511_fg13kau", "A1234567");

                return conn;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return conn;
    }

}
