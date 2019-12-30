/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;
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
public class JBSeccion extends javax.swing.JFrame {
    DefaultTableModel model;
    Conectar con;
    /**
     * Creates new form JBProyecto
     */
    public JBSeccion() {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btnagregar = new javax.swing.JToggleButton();
        jButton7 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 570, 200));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mostrar Todos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por clave: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 100, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opciones sección");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seccion2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 130));

        jButton6.setBackground(new java.awt.Color(0, 0, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 40));

        btnagregar.setBackground(new java.awt.Color(0, 0, 51));
        btnagregar.setForeground(new java.awt.Color(0, 0, 51));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_home_inicio.png"))); // NOI18N
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 50, 50));

        jButton7.setBackground(new java.awt.Color(0, 0, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Limpiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 130, 40));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 60, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HD.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //BOTON MOSTAR TODOS
        mostrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        JPrincipal j = new JPrincipal();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       // BOTON LIMPIAR
      model = new DefaultTableModel();
      txtTabla.setModel(model);
      txtBuscar.setText(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // BOTON PARA SALIR
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTON MODIFICAR
         int fila = txtTabla.getSelectedRow();
        if (fila>=0){
            Estatica.getS().setId_sec(Integer.parseInt(txtTabla.getValueAt(fila, 0).toString()));
            Estatica.getS().setNombre(txtTabla.getValueAt(fila, 1).toString());
            Estatica.getS().setUbicacion(txtTabla.getValueAt(fila, 2).toString());
            Estatica.getS().setTelefono(txtTabla.getValueAt(fila, 3).toString());
            Estatica.getS().setMail(txtTabla.getValueAt(fila, 4).toString());
            Estatica.getS().setId_dpto(Integer.parseInt(txtTabla.getValueAt(fila, 5).toString()));
            //MANDA A LA INTERFACE DE MODFICAR
            JModificarS mod = new JModificarS();
            mod.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // BOTON BUSCAR
         String cadena = txtBuscar.getText();
        
     if(!"".equals(cadena)){
          buscar();
     }
     else{
         JOptionPane.showMessageDialog(null,"Ingrese una clave para poder buscar");
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTON ELIMINAR
         Seccion sec = new Seccion();
        int fila = txtTabla.getSelectedRow();
        if (fila>=0){
            sec.setId_sec(Integer.parseInt(txtTabla.getValueAt(fila, 0).toString()));  
            //MANDA A LLAMAR AL METODO DE ELIMINAR DE LA CLASE SECCION
            sec.eliminar();
           mostrar();
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No selecciono ninguna fila");
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    //BUSCA Y MUESTRA UN REGISTRO DE LA TABLA SECCION
    public void buscar(){
         String valor = txtBuscar.getText();
         String[] titulos = {"Seccion", "Nombre", "Ubicacion", "Telefono","Email","Departamento"};
           String sql = "SELECT * from seccion";
           String [] registros = new String[6];
           model = new DefaultTableModel(null,titulos);
           con = new Conectar();
        try{  
           Statement st;
           st = con.getConnection().createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while (rs.next()){
               registros[0] = rs.getString("id_sec");
               if(valor.equalsIgnoreCase(registros[0])){
               registros[1] = rs.getString("nombre_sec");
               registros[2] = rs.getString("ubicacion_sec");
               registros[3] = rs.getString("telefono_sec");
               registros[4] = rs.getString("mail_sec");
               registros[5] = rs.getString("id_dpto");
               model.addRow(registros);
               txtTabla.setModel(model);
              
               }
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(JBSeccion.class.getName()).log(Level.SEVERE, null, ex);
       }
        txtBuscar.setText(null);
    }
    //MUESTRA TODOS LOS REGISTROS DE LA TABLA SECCION
    public void mostrar(){
        
            String[] titulos = {"Departamento", "Nombre", "Ubicacion", "Telefono","Email","Departamento"};
            String sql = "SELECT * from seccion";
            String [] registros = new String[6];
            model = new DefaultTableModel(null,titulos);
            con = new Conectar();
         try{   
            Statement st;
            st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                registros[0] = rs.getString("id_sec");
                registros[1] = rs.getString("nombre_sec");
                registros[2] = rs.getString("ubicacion_sec");
                registros[3] = rs.getString("telefono_sec");
                registros[4] = rs.getString("mail_sec");
                registros[5] = rs.getString("id_dpto");
                model.addRow(registros);
                
                txtTabla.setModel(model);
                
            }   } catch (SQLException ex) {
            Logger.getLogger(JBSeccion.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(JBSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBSeccion().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTable txtTabla;
    // End of variables declaration//GEN-END:variables
}
