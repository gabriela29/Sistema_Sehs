/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.DATABASE;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SEHS - TI
 */
public class AccesoDB {
    public static Connection conectabd() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sehsFINAL", "postgres", "postgres");
           // JOptionPane.showMessageDialog(null, "Conectado con exito");
            //usuario: gadmin- clave: gadmin
           return con ;
        }
        catch (SQLException error) {
     JOptionPane.showMessageDialog(null, error);
            return null;
        }  
    
    }
    
//    private final String url= "jdbc:postgresql://localhost:5432/sehsFINAL";
//    private final String user = "postgres";
//    private final String password = "postgres";
//    
//    
//    public Connection conectabd(){
//        
//        Connection conn = null;
//        try {
//           conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sehsFINAL", "postgres", "postgres");
//            System.out.println("Connected to the PostgreSQL server succesfully");
//        } catch (Exception e) {
//        System.out.println(e.getMessage());
//                 
//        }
//    return conn;
//    }
//    
    
    
    
    
}
