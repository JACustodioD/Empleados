/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;
import agregar.*;
import clases.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAcus
 */
public class JBConfianza extends javax.swing.JFrame {
    DefaultTableModel model;
    Conectar con;
    /**
     * Creates new form JBProyecto
     */
    public JBConfianza() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Buscar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtTabla = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTabla.setBackground(new java.awt.Color(204, 204, 204));
        txtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(txtTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 560, 190));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 130, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 20));

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 100, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Opciones Empleado");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 140));

        btnagregar.setBackground(new java.awt.Color(0, 0, 51));
        btnagregar.setForeground(new java.awt.Color(0, 0, 51));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_home_inicio.png"))); // NOI18N
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 50, 50));

        btnSalir.setBackground(new java.awt.Color(0, 0, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ICONO1.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 60, 50));

        jButton6.setBackground(new java.awt.Color(0, 0, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 40));

        jButton7.setBackground(new java.awt.Color(0, 0, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Mostrar Todos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HD.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON LIMPIAR
      model = new DefaultTableModel();
      txtTabla.setModel(model);
      txtBuscar.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // BOTON PARA VOLVER A LA PAGINA PRINCIPAL
        JPrincipal j = new JPrincipal();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // BOTON PARA SALIR
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // BOTON MOSTAR TODOS
        mostrar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // BOTON MODIFICAR
        //GUARDA LOS DATOS DE LA FILA SELECCIONADA
        int fila = txtTabla.getSelectedRow();
        if (fila>=0){
            Estatica.getC().setClave_empleado(Integer.parseInt(txtTabla.getValueAt(fila, 0).toString()));
            Estatica.getC().setNombre(txtTabla.getValueAt(fila, 1).toString());
            Estatica.getC().setRfc(txtTabla.getValueAt(fila, 2).toString());
            Estatica.getC().setFecha(txtTabla.getValueAt(fila, 3).toString());
            Estatica.getC().setGenero(txtTabla.getValueAt(fila, 4).toString());
            Estatica.getC().setSueldo(Double.parseDouble(txtTabla.getValueAt(fila, 5).toString()));
            Estatica.getC().setNum_proyecto(Integer.parseInt(txtTabla.getValueAt(fila, 6).toString()));
            Estatica.getC().setBono(Double.parseDouble(txtTabla.getValueAt(fila, 7).toString()));
            Estatica.getC().setId_sec(Integer.parseInt(txtTabla.getValueAt(fila, 7).toString()));
            //MANDA A LA INTERFACE DE MODIFICAR
            JModificarC mod = new JModificarC();
            mod.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");
        }
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //BOTON BUSCAR
     String cadena = txtBuscar.getText();
        
     if(!"".equals(cadena)){
          buscar();
     }
     else{
         JOptionPane.showMessageDialog(null,"Ingrese una clave para poder buscar");
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTON ELIMINAR
        Confianza con = new Confianza();
        //GUARDA LOS DATOS DE LA FILA SELECCIONADA
        int fila = txtTabla.getSelectedRow();
        if (fila>=0){
            con.setClave_empleado(Integer.parseInt(txtTabla.getValueAt(fila, 0).toString()));
            //MANDA A LLLAMR AL METODO ELIMINAR DE LAS CLASES CONFIANZA Y TRABAJADOR
            con.eliminar();
            con.eliminarTrabajdor();
           mostrar();
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    //METODO PARA BUSCAR EN LA TABLA DE TRABAJADOR Y CONFIANZA Y MOSTAR EL REGISTRO EN LA INTEFACE
        public void buscar(){
         String valor = txtBuscar.getText();
         String[] titulos = {"Clave", "Nombre", "RFC", "Fecha de Nacimiento","Genero","Sueldo","Proyectos", "Bono","Seccion"};
           String sql = "SELECT confianza.clave_trabajador,nombre,rfc,fecha_nacimiento,genero,sueldo,num_proyecto,bono,id_sec FROM confianza INNER JOIN  trabajador  WHERE confianza.clave_trabajador LIKE trabajador.clave_trabajador";
           String [] registros = new String[9];
           model = new DefaultTableModel(null,titulos);
           con = new Conectar();
        try{  
           Statement st;
           st = con.getConnection().createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while (rs.next()){
               registros[0] = rs.getString("confianza.clave_trabajador");
               if(valor.equalsIgnoreCase(registros[0])){
               registros[1] = rs.getString("nombre");
               registros[2] = rs.getString("rfc");
               registros[3] = rs.getString("fecha_nacimiento");
               registros[4] = rs.getString("genero");
               registros[5] = rs.getString("sueldo");
               registros[6] = rs.getString("num_proyecto");
               registros[7] = rs.getString("bono");
               registros[8] = rs.getString("id_sec");
               model.addRow(registros);
               txtTabla.setModel(model);
              
               }
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(JBConfianza.class.getName()).log(Level.SEVERE, null, ex);
       }
        txtBuscar.setText(null);
    }
    //METODO PARA SELECCIONAR TODOS LOS REGISTROS DE LAS TABLAS TRABJADOR Y CONFIANZA Y MOSTRARLOS EN LA INTERFACE
    public void mostrar(){
         String[] titulos = {"Clave", "Nombre", "RFC", "Fecha de Nacimiento","Genero","Sueldo","Proyectos", "Bono","Seccion"};
           String sql = "SELECT confianza.clave_trabajador,nombre,rfc,fecha_nacimiento,genero,sueldo,num_proyecto,bono,id_sec FROM confianza INNER JOIN  trabajador  WHERE confianza.clave_trabajador LIKE trabajador.clave_trabajador";
           String [] registros = new String[9];
           model = new DefaultTableModel(null,titulos);
           con = new Conectar();
        try{  
           Statement st;
           st = con.getConnection().createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while (rs.next()){
               registros[0] = rs.getString("confianza.clave_trabajador");
               registros[1] = rs.getString("nombre");
               registros[2] = rs.getString("rfc");
               registros[3] = rs.getString("fecha_nacimiento");
               registros[4] = rs.getString("genero");
               registros[5] = rs.getString("sueldo");
               registros[6] = rs.getString("num_proyecto");
               registros[7] = rs.getString("bono");
               registros[8] = rs.getString("id_sec");
               model.addRow(registros);
           }
           txtTabla.setModel(model);
       } catch (SQLException ex) {
           Logger.getLogger(JBConfianza.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JBConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBConfianza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnagregar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTable txtTabla;
    // End of variables declaration//GEN-END:variables
}
