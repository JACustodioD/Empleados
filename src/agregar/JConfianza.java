/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregar;
import clases.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author JAcus
 */
public class JConfianza extends javax.swing.JFrame {
    //ATRIBUTOS
    Confianza e = new Confianza();
    /**
     * Creates new form JTrabajador
     */
    public JConfianza() {
        initComponents();
        this.setLocationRelativeTo(null);
        seccion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proyecto1 = new clases.Proyecto();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtSeccion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroP = new javax.swing.JLabel();
        comProyectos = new javax.swing.JComboBox<>();
        comSeccion = new javax.swing.JComboBox<>();
        comGenero = new javax.swing.JComboBox<>();
        comAño = new javax.swing.JComboBox<>();
        botonagregar1 = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comDia = new javax.swing.JComboBox<>();
        btnagregar = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        comMes = new javax.swing.JComboBox<>();
        txtFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RFC:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Género:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 170, -1));

        txtSeccion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtSeccion.setForeground(new java.awt.Color(255, 255, 255));
        txtSeccion.setText("Sección:");
        getContentPane().add(txtSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dia:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mes:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Año:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        txtNumeroP.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtNumeroP.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroP.setText("Numero de proyectos:");
        getContentPane().add(txtNumeroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        comProyectos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comProyectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        comProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comProyectosActionPerformed(evt);
            }
        });
        getContentPane().add(comProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        comSeccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(comSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 80, -1));

        comGenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        getContentPane().add(comGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        comAño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007" }));
        getContentPane().add(comAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        botonagregar1.setBackground(new java.awt.Color(0, 0, 51));
        botonagregar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonagregar1.setForeground(new java.awt.Color(255, 255, 255));
        botonagregar1.setText("Agregar");
        botonagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonagregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 115, 43));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleado de confianza");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 290, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -10, 140, 140));

        comDia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(comDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        btnagregar.setBackground(new java.awt.Color(0, 0, 51));
        btnagregar.setForeground(new java.awt.Color(0, 0, 51));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_home_inicio.png"))); // NOI18N
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 50, 50));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 60, 50));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clave empleado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, 30));

        txtRfc.setBackground(new java.awt.Color(204, 204, 204));
        txtRfc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcActionPerformed(evt);
            }
        });
        getContentPane().add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 97, -1));

        txtClave.setBackground(new java.awt.Color(204, 204, 204));
        txtClave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 97, -1));

        comMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(comMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        txtFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gray.jpg"))); // NOI18N
        getContentPane().add(txtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // BOTON PARA VOLVER A LA PAGINA PRINCIPAL
        JPrincipal j = new JPrincipal();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // BOTON SALIR
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void comProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comProyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comProyectosActionPerformed

    private void txtRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void botonagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregar1ActionPerformed
        // BOTON AGREGAR
        
        //GUARDAMOS LOS DATOS EN LOS ATRIBUTOS DE LA CLASE CONFIANZA
        e.setClave_empleado(Integer.parseInt(txtClave.getText()));
        e.setNombre(txtNombre.getText());
        e.setRfc(txtRfc.getText());
        e.setGenero(comGenero.getSelectedItem().toString());
        e.setId_sec(Integer.parseInt(comSeccion.getSelectedItem().toString()));
        e.setNum_proyecto(Integer.parseInt(comProyectos.getSelectedItem().toString()));
        Fecha f = new Fecha();
        f.setDia(comDia.getSelectedItem().toString());
        f.setMes(comMes.getSelectedItem().toString());
        f.setAño(comAño.getSelectedItem().toString());
        e.setFecha_nacimiento(f);

        //MADNAMOS A LLAMAR LOS METODOS PARA AGREGAR DE LAS CLASES TRABAJADORY CONFIANZA
        e.agregarTrabajador();
        e.agregar();
       
        //LIMPIAMOS LOS CAMPOS
        txtNombre.setText(null);
        txtClave.setText(null);
        txtRfc.setText(null);
    }//GEN-LAST:event_botonagregar1ActionPerformed

        //METODO PARA QUE APAREZCAN LOS DATOS DE LA SECCION 
        public void seccion (){
            Conectar con;
            String sql = "SELECT id_sec from seccion";
            con = new Conectar();
         try{   
            Statement st;
            st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            comSeccion.removeAllItems();
            while(rs.next()){
                comSeccion.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JConfianza.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(JConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JConfianza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JConfianza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonagregar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnagregar;
    private javax.swing.JComboBox<String> comAño;
    private javax.swing.JComboBox<String> comDia;
    private javax.swing.JComboBox<String> comGenero;
    private javax.swing.JComboBox<String> comMes;
    private javax.swing.JComboBox<String> comProyectos;
    private javax.swing.JComboBox<String> comSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private clases.Proyecto proyecto1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JLabel txtFondo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNumeroP;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JLabel txtSeccion;
    // End of variables declaration//GEN-END:variables
}