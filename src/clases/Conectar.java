
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conectar {
    private static Connection conexion;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "root";
    private final String contraseña = "4127";
    private final String url = "jdbc:mysql://localhost/empresa";
    
    public Conectar(){
         conexion = null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Conexion Fallida !"+e.getMessage());
        
        }   
        
    }
    
    public Connection getConnection(){
        return conexion;
    }
    
    public void desconectar(){
        conexion = null;
        if (conexion == null){
            JOptionPane.showMessageDialog(null,"Conexiín Terminada!");
        }
    }
}
