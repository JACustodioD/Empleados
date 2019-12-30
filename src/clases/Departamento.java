
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Departamento {
    //ATRIBUTOS
    private int id_dpto;
    private String nombre,ubicacion,telefono,mail;
    
    //METODO CONSTRUCTOR

    public Departamento() {
    }
    
    //METODOS GET Y SET 

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
    
    //METODO PARA AGREGAR EN LA TABLA DEPARTAMENTO
    public void agregar(){
        Connection conect = con.getConnection();
        String sql = "INSERT INTO departamento (id_dpto,nombre_dpto,ubicacion_dpto,telefono_dpto,mail_dpto) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString(1,String.valueOf(id_dpto));
            pds.setString(2,nombre);
            pds.setString(3,ubicacion);
            pds.setString(4,telefono);
            pds.setString(5, mail);
            int n = pds.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Departamento agregado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Departamento no agregado"+ex);
        }
    }
    
    //METODO PARA MODFICAR EN LA TABLA DEPARTAMENTO
    
    public void modificar(){
        Connection conect = con.getConnection();
        String sql = "UPDATE departamento SET nombre_dpto = ?, ubicacion_dpto = ?, telefono_dpto = ?, mail_dpto = ? WHERE id_dpto = "+id_dpto+" ";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString(1,nombre);
            pds.setString(2,ubicacion);
            pds.setString(3,telefono);
            pds.setString(4, mail);
            pds.executeUpdate();
            JOptionPane.showMessageDialog(null,"Departamento modificado");
        } catch (SQLException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Departamento no agregado: "+ex);
            
        }
    }
    
    //METODO PARA ELIMINAR EN LA TABLA DEPARTAMENTO
    
    public void eliminar(){
        Connection conect = con.getConnection();
        String sql = "DELETE FROM departamento WHERE id_dpto = "+id_dpto+" ";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.executeUpdate();
            JOptionPane.showMessageDialog(null,"Departamento eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Departamneto no eliminado "+ex);
        }
        
    }
    
}
