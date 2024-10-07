/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasir;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.awt.PageAttributes;
import static java.awt.PageAttributes.MediaType.C;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miqda
 */
public class Kasir {

    private static Connection Connection;

    public static void main(String[] args) {
        PageAttributes.MediaType connection = Go();
        if (connection!= null) {
            System.out.println("Database connected sucssesfully");
        }
    }
    private static PageAttributes.MediaType Go() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost");
            m.setDatabaseName("kasir");
            m.setUser("root");
            m.setPassword("");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");
            
            Connection = m.getConnection();
            System.out.println("Koneksi sukses");
            return C;
            
        } catch (SQLException e) {
            System.err.println("Konelsi gagal!\n"+ e.getMessage());
        }
        return null;
    }

    static boolean login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
