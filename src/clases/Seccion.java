package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Seccion {
    //ATRIBUTOS
    private int id_sec,id_dpto;
    private String nombre,ubicacion,telefono,mail;
    
    
    //METODO CONSTRUCTOR

    public Seccion() {
    }
    
    //METODOS GET Y SET

    public int getId_sec() {
        return id_sec;
    }

    public void setId_sec(int id_sec) {
        this.id_sec = id_sec;
    }

    public int getId_dpto() {
        return id_dpto;
    }

    public void setId_dpto(int id_dpto) {
        this.id_dpto = id_dpto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    //VARIABLE PARA ESTABLECER CONEXION
    Conectar con = new Conectar ();
    
    //METODO PARA AGREGAR EN LA TABLA SECCION
    public void agregar(){
        Connection conect = con.getConnection();
        String sql = "INSERT INTO seccion (id_sec,nombre_sec,ubicacion_sec,telefono_sec,mail_sec,id_dpto) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString(1,String.valueOf(id_sec));
            pds.setString(2,nombre);
            pds.setString(3,ubicacion);
            pds.setString(4,telefono);
            pds.setString(5, mail);
            pds.setString(6,String.valueOf(id_dpto));
            int n = pds.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Seccion agregada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Seccion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Seccion no agregada"+ex);
        }
    }
    
    //METODO PARA MODFICAR EN LA TABLA Seccion
    
    public void modificar(){
        Connection conect = con.getConnection();
        String sql = "UPDATE seccion SET nombre_sec = ? ,ubicacion_sec = ?, telefono_sec = ?, mail_sec = ? , id_dpto = ? WHERE id_sec = "+id_sec+" ";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString(1,nombre);
            pds.setString(2,ubicacion);
            pds.setString(3,telefono);
            pds.setString(4, mail);
            pds.setString(5,String.valueOf(id_dpto));
            pds.executeUpdate();
            JOptionPane.showMessageDialog(null,"Seccion modificada");
        } catch (SQLException ex) {
            Logger.getLogger(Seccion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Seccion no agregada: "+ex);
            
        }
    }
    
    //METODO PARA ELIMINAR EN LA TABLA SECCION
    
    public void eliminar(){
        Connection conect = con.getConnection();
        String sql = "DELETE FROM seccion WHERE id_sec = "+id_sec+" ";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.executeUpdate();
            JOptionPane.showMessageDialog(null,"Seccion eliminada");
        } catch (SQLException ex) {
            Logger.getLogger(Seccion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Seccion no eliminada "+ex);
        }
        
    }
    
}
