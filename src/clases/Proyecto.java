
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Proyecto {
    //ATRIBUTOS
    private int clave_proyecto, id_sec;
    private Fecha fecha_i,fecha_f;
    private String descripcion;
    
    //METODO CONSTRUCTOR

    public Proyecto() {
    }
    
    //METODOS GET Y SET

    public int getClave_proyecto() {
        return clave_proyecto;
    }

    public void setClave_proyecto(int clave_proyecto) {
        this.clave_proyecto = clave_proyecto;
    }

    public int getId_sec() {
        return id_sec;
    }

    public void setId_sec(int id_sec) {
        this.id_sec = id_sec;
    }

    public Fecha getFecha_i() {
        return fecha_i;
    }

    public void setFecha_i(Fecha fecha_i) {
        this.fecha_i = fecha_i;
    }

    public Fecha getFecha_f() {
        return fecha_f;
    }

    public void setFecha_f(Fecha fecha_f) {
        this.fecha_f = fecha_f;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    //VARIABLE PARA ESTABLECER LA CONEXION
    Conectar con = new Conectar();
    
    //METODO PARA AGREGAR EN LA TABLA PROYECTO
    public void agregar(){
        Connection conect = con.getConnection();
        String sql = "INSERT INTO proyecto (clave_proyecto,descripcion,fecha_i,fecha_f,id_sec) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString (1,String.valueOf(clave_proyecto));
            pds.setString (2,descripcion);
            pds.setString (3,fecha_i.toString());
            pds.setString (4,fecha_f.toString());
            pds.setString (5,String.valueOf(id_sec));
            
            int n = pds.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Proyecto agregado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Proyecto no agregado:  "+ex);

        }
        
    }
    
    //METODO PARA ELIMINAR EN LA TABLA PROYECTO
    public void eliminar(){
        Connection conect = con.getConnection();
        String sql = "DELETE FROM proyecto WHERE clave_proyecto = "+clave_proyecto+" ";
    
        try {
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.executeUpdate();
            JOptionPane.showMessageDialog(null,"Proyecto eliminado!");
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"Proyecto no eliminado!  "+ex);

        }
    }
}
