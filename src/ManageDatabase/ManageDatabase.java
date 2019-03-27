/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alumne
 */
public class ManageDatabase {
    
    static final String DB_URL = "jdbc:mysql://univeylandia.cat:3306/univeylandia_test2";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "super";
    static final String DB_PASSWD = "Alumne123";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM categories");
            while (resultSet.next()) {
                System.out.printf("%d\t%s\t\n",
                        resultSet.getInt(1),
                        resultSet.getString(2));
            }

        } catch (SQLException ex) {
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
            }
        }
    }
    
}
