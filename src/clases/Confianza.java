
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Confianza extends Trabajador{
    //ATRIBUTOS
    private int num_proyecto,id_sec;
    private double bono;
    
    //METODO CONSTRUCTOR

    public Confianza() {
    }
    
    //METODOS GET Y SET

    public int getNum_proyecto() {
        return num_proyecto;
    }

    public void setNum_proyecto(int num_proyecto) {
        this.num_proyecto = num_proyecto;
    }

    public int getId_sec() {
        return id_sec;
    }

    public void setId_sec(int id_sec) {
        this.id_sec = id_sec;
    }

    public double getBono() {
        bono = num_proyecto * 3000;
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    //METODO PARA AGREAGAR EN LA TABLA DE CONFIANZA
    public void agregar(){
        Connection conect = con.getConnection();
        String sql = "INSERT INTO confianza (num_proyecto,bono,clave_trabajador,id_sec) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString(1,String.valueOf(num_proyecto));
            pds.setString(2,String.valueOf(getBono()));
            pds.setString(3,String.valueOf(super.getClave_empleado()));
            pds.setString(4,String.valueOf(id_sec));
            int n = pds.executeUpdate();
            if(n>0){
                System.out.println("Empleado de Confianza");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Confianza.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro al registrar "+ex);
        }
    }
    
    //METODO PARA MODIFICAR EN LA TABLA DE CONFIANZA
    public void modficar(){
        Connection conect = con.getConnection();
        String sql = "UPDATE confianza SET num_proyecto = "+num_proyecto+", id_Sec = "+id_sec+", bono = "+getBono()+" WHERE clave_trabajador = "+super.getClave_empleado()+" ";
    
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.executeUpdate();
            System.out.println("REGISTRO MODIFICADO CON EXITO");
        } catch (SQLException ex) {
            Logger.getLogger(Confianza.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROE AL MODIFICAR REGISTRO"+ex);
        }
    }
    
    //METODO PARA ELIMINAR EN LA TABLA CONFIANZA
    public void eliminar(){
        Connection conect = con.getConnection();
        String sql = "DELETE FROM confianza WHERE clave_trabajador = "+super.getClave_empleado()+" ";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.executeUpdate();
            System.out.println("Registro eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Confianza.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"REGISTRO NO ELIMINADO "+ex);
        }
    }
}
