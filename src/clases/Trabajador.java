
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Trabajador {
    //Atributos
    private int clave_empleado;
    private String nombre,rfc,genero,fecha;
    private Fecha fecha_nacimiento;
    private Double sueldo = 500.0;
    
    //METODO CONSTRUCTOR
    public Trabajador() {
    }
    
    //METODOS GET Y SET DE CADA ATRIBUTO

    public int getClave_empleado() {
        return clave_empleado;
    }

    public void setClave_empleado(int clave_empleado) {
        this.clave_empleado = clave_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public Double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo (Double sueldo){
        this.sueldo = sueldo;
    }
    //Variable para establecer las conexiones
    Conectar con = new Conectar();
    
    //METODO PARA AGREGAR DATOS A LA TABLA TRABAJADOR DE LA BD
    public void agregarTrabajador(){
            Connection conect = con.getConnection();
            String sql = "INSERT INTO trabajador (clave_trabajador,nombre,rfc,genero,sueldo,fecha_nacimiento) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.setString(1, String.valueOf(clave_empleado));
            pds.setString(2, nombre);
            pds.setString(3, rfc);
            pds.setString(4, genero);
            pds.setString(5, String.valueOf(sueldo));
            pds.setString(6, fecha_nacimiento.toString());
            int n = pds.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Trabajador agregado como :");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Registro de trabajador fallido: "+ex);
        }
        
         Conectar cc = new Conectar();
    }
    //Variable para recuperar la fecha
    private String cadena;
    //Metodo para obtener la fecha
    public void setCadena(int i){
        if (i==1){
            cadena = fecha_nacimiento.toString();
        }
        else{
            cadena = fecha;
        }
    }
    public String getCadena(){
        return cadena;
    }
    
    //METODO PARA MODIFICAR LA TABLA DE TRABAJADOR
    
    public void modificarTrabajador(){
        //cadena();
        Connection conect = con.getConnection();
        String sql = "UPDATE trabajador SET nombre = ? , rfc =  ? , genero = ?, fecha_nacimiento = ?  WHERE clave_trabajador = "+clave_empleado+ " ";
        
        try{
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString (2, rfc);
            ps.setString (3, genero);
            ps.setString(4, cadena);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Trabajador Modificado");
            } catch (SQLException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"fallo en la actualizacion 1"+ex);
            }
    }
    
    //METODO PARA ELIMINAR TRABAJADOR
    public void eliminarTrabajdor(){
        Connection conect = con.getConnection();
        String sql = "DELETE FROM trabajador WHERE clave_trabajador = "+clave_empleado+" ";
       
        try{
            PreparedStatement pds = conect.prepareStatement(sql);
            pds.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro Eliminado");
        }catch(SQLException ex){
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
