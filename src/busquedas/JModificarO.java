/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;


import clases.*;


/**
 *
 * @author JAcus
 */
public class JModificarO extends javax.swing.JFrame {
    Obrero o = new Obrero ();
    /**
     * Creates new form JTrabajador
     */
    public JModificarO() {
        initComponents();
        this.setLocationRelativeTo(null);
        modificar();
        
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHoraExtra = new javax.swing.JTextField();
        comDia = new javax.swing.JComboBox<>();
        comMes = new javax.swing.JComboBox<>();
        comGenero = new javax.swing.JComboBox<>();
        comAño = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnagregar = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JButton();
        botonagregar1 = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        btnagregar3 = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnCambiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RFC:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Genero:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        txtRfc.setBackground(new java.awt.Color(204, 204, 204));
        txtRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcActionPerformed(evt);
            }
        });
        getContentPane().add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 97, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dia:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mes:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Año:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Horas extra:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        txtHoraExtra.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtHoraExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 60, -1));

        comDia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comDiaMousePressed(evt);
            }
        });
        comDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comDiaActionPerformed(evt);
            }
        });
        getContentPane().add(comDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        comMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(comMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        comGenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        getContentPane().add(comGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        comAño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007" }));
        getContentPane().add(comAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Obrero");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/obrero.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 130, 130));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, -1));

        btnagregar.setBackground(new java.awt.Color(0, 0, 51));
        btnagregar.setForeground(new java.awt.Color(0, 0, 51));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_home_inicio.png"))); // NOI18N
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 50, 50));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 60, 50));

        botonagregar1.setBackground(new java.awt.Color(0, 0, 51));
        botonagregar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonagregar1.setForeground(new java.awt.Color(255, 255, 255));
        botonagregar1.setText("Aceptar");
        botonagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonagregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 115, 43));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Modificar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, 50));

        btnagregar3.setBackground(new java.awt.Color(0, 0, 51));
        btnagregar3.setForeground(new java.awt.Color(0, 0, 51));
        btnagregar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnagregar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 50, 50));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clave empleado:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 30));

        txtClave.setEditable(false);
        txtClave.setBackground(new java.awt.Color(204, 204, 204));
        txtClave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 97, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 90, -1));

        btnCambiar.setText("Cambiar Fecha");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gray.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // BOTON PARA VOLVER AL MENU PRINCIPAL
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

    private void btnagregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregar3ActionPerformed
        // BOTON PARA VOLVER A LA INTERFACE DE BUSCAR
        JBObrero jo = new JBObrero();
        jo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnagregar3ActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // BOTON CAMBIAR
        Fecha f = new Fecha();
        f.setDia(comDia.getSelectedItem().toString());
        f.setMes(comMes.getSelectedItem().toString());
        f.setAño(comAño.getSelectedItem().toString());
        o.setFecha_nacimiento(f);
        o.setCadena(1);
        
        comDia.setEnabled(false);
        comMes.setEnabled(false);
        comAño.setEnabled(false);
        botonagregar1.setEnabled(true);
        
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void botonagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregar1ActionPerformed
        // BOTON ACEPTAR
        //GUARDA LOS NUEVOS VALORES
        o.setClave_empleado(Integer.parseInt(txtClave.getText()));
        o.setNombre(txtNombre.getText());
        o.setRfc(txtRfc.getText());
        o.setGenero(comGenero.getSelectedItem().toString());
        o.setHoras_extra(Integer.parseInt(txtHoraExtra.getText()));
        //MANDA A LLMAR A EL METODO DE LAS CLASES TRABAJADOR Y OBRERO
        System.out.println(o.getCadena());
        System.out.println(o.getFecha_nacimiento());
        
        o.modificarTrabajador();
        o.modificar();
    }//GEN-LAST:event_botonagregar1ActionPerformed

    private void comDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comDiaActionPerformed
     comDia.setEnabled(true);
        comMes.setEnabled(true);
        comAño.setEnabled(true);
        btnCambiar.setEnabled(true);
        botonagregar1.setEnabled(false);
    }//GEN-LAST:event_comDiaActionPerformed

    private void comDiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comDiaMousePressed
        // TODO add your handling code here:
         comDia.setEnabled(true);
        comMes.setEnabled(true);
        comAño.setEnabled(true);
        btnCambiar.setEnabled(true);
        botonagregar1.setEnabled(false);
    }//GEN-LAST:event_comDiaMousePressed

      public void modificar(){
        //inhabilita los selectores de la fecha
        btnCambiar.setEnabled(false);
        comDia.setEnabled(false);
        comMes.setEnabled(false);
        comAño.setEnabled(false);
        txtFecha.setEnabled(false);
        //PONEN LOS DATOS DEL REGISTRO
        txtClave.setText(String.valueOf(Estatica.getO().getClave_empleado()));
        txtNombre.setText(String.valueOf(Estatica.getO().getNombre()));
        txtRfc.setText(String.valueOf(Estatica.getO().getRfc()));
        txtHoraExtra.setText(String.valueOf(Estatica.getO().getHoras_extra()));
        comGenero.setSelectedItem(Estatica.getO().getGenero());
        txtFecha.setText(Estatica.getO().getFecha());
        o.setFecha(Estatica.getO().getFecha());
        o.setCadena(7);
        
        
        
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
            java.util.logging.Logger.getLogger(JModificarO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JModificarO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JModificarO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JModificarO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JModificarO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonagregar1;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnagregar;
    private javax.swing.JToggleButton btnagregar3;
    private javax.swing.JComboBox<String> comAño;
    private javax.swing.JComboBox<String> comDia;
    private javax.swing.JComboBox<String> comGenero;
    private javax.swing.JComboBox<String> comMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraExtra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
}
