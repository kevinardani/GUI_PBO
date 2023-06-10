
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ardan
 */
public class Konfig {
    private static Connection MySQLConfig;
    public  static Connection configDB()throws SQLException {
        try {
            String url="jdbc:mysql://localhost:3306/gui_pbo"; // url database
            String user="root"; //user database
            String pass=""; //password database
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig=DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException e) {
            System.out.println("Koneksi gagal"+e.getMessage()); //Perintah menampilkan eror pada koneksi
        }
        
        return MySQLConfig;
     }
}
