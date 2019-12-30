
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Obrero extends Trabajador{
    //ATRIBUTOS
    private int horas_extra;
    private Double importe;
    
    //METODO CONSTRUCTOR

    public Obrero() {
    }
    
    //METODOS GET Y SET DE LOS ATRIBUTOS

    public int getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte() {
        this.importe = (horas_extra*40.0);
       
    }
    
    
    //METODO PARA AGREGAR EN LA TABLA DE OBRERO
    public void agregar(){
        setImporte();
        Connection conect = con.getConnection();
        String sql = "INSERT INTO obrero (horas_extra,importe,clave_trabajador) VALUES (?,?,?)";
        try{    
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString(1, String.valueOf(horas_extra));
            pds.setString(2,String.valueOf(importe));
            pds.setString(3,String.valueOf(super.getClave_empleado()));
            int n = pds.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Obrero!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Obrero.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error al registrar Obrero! "+ex);
        }
    }
    
    //METODO PARA MODIFICAR EN LA TABLA OBRERO
    
    public void modificar(){
        setImporte();
        Connection conect = con.getConnection();
        String sql = "UPDATE obrero SET horas_extra =?, importe = ? WHERE clave_trabajador =  "+super.getClave_empleado()+" ";
       
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            
            pds.setString(1,String.valueOf(horas_extra));
            pds.setString(2, String.valueOf(importe));
            pds.executeUpdate();
            System.out.println("Registro modificado");
        } catch (SQLException ex) {
            Logger.getLogger(Obrero.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error al modicar el registro"+ex);
        }
    }
    
    //METODO PARA ELIMINAR EN LA TABLA OBRERO
    public void eliminar(){
        Connection conect = con.getConnection();
        String sql = "DELETE FROM obrero WHERE clave_trabajador = "+super.getClave_empleado()+" ";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.executeUpdate();
            System.out.println("Registro eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(Obrero.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Registro no eliminado "+ex);
        }
    }
    
}
