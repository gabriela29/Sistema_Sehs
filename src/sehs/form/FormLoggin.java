/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.form;

//import BunifuDrag.BunifuDrag;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javafx.util.converter.LocalDateTimeStringConverter;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sehs.Database.AccesoDB;
import sehs.controller.ClienteBLL;

/**
 *
 * @author proxc
 */
public class FormLoggin extends javax.swing.JFrame {
 private Timer objTimer;
    private int a;
    //hola GIt hub
    /**
     * Creates new form Home41
     */
    public FormLoggin() {
        initComponents();
         setLocationRelativeTo(null);
       ImageIcon imagen1=new ImageIcon(getClass().getResource("logo_sehs.png"));
       Icon fondo1= new ImageIcon(imagen1.getImage().getScaledInstance(lblimagen1.getWidth(), lblimagen1.getHeight(), Image.SCALE_DEFAULT));
       lblimagen1.setIcon(fondo1);
      
                
        new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
           //  LocalDateTime now = LocalDateTime.now();
//        jLabel6.setText(String.valueOf(now.getSecond()));
//        jLabel15.setText(String.valueOf(now.getMinute()));
       // jLabel14.setText(String.valueOf(now.getHour()));  
        
            }
        }).start();
     
 
    
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblimagen1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtpass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        btnsalir = new java.awt.Button();
        btnAceptarL = new java.awt.Button();
        ProgressB12 = new javax.swing.JProgressBar();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Servicio Educacional Hogar y Salud ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        lblimagen1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblimagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 550));

        jPanel5.setBackground(new java.awt.Color(71, 120, 197));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Ingreso al Sistema");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Usuario");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Contraseña");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        txtpass.setBackground(new java.awt.Color(71, 120, 197));
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(null);
        txtpass.setCaretColor(new java.awt.Color(76, 98, 137));
        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassFocusGained(evt);
            }
        });

        txtUser.setBackground(new java.awt.Color(71, 120, 197));
        txtUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        txtUser.setCaretColor(new java.awt.Color(76, 98, 137));
        txtUser.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(71, 120, 197));
        btnsalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setLabel("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnAceptarL.setBackground(new java.awt.Color(36, 47, 65));
        btnAceptarL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAceptarL.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarL.setLabel("Ingresar");
        btnAceptarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarLActionPerformed(evt);
            }
        });

        ProgressB12.setBackground(new java.awt.Color(255, 255, 255));
        ProgressB12.setForeground(new java.awt.Color(204, 204, 255));
        ProgressB12.setBorderPainted(false);
        ProgressB12.setOpaque(true);

        jCheckBox1.setBackground(new java.awt.Color(71, 120, 197));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Recordar Contraseña");
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgressB12, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox1)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(btnAceptarL, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66)))
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(19, 19, 19)
                        .addComponent(btnAceptarL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(ProgressB12, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 430, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 551));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jPanel2MouseDragged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jLabel4.setVisible(true);
        ProgressB12.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void btnAceptarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarLActionPerformed
        // TODO add your handling code here:
        ClienteBLL oUsuario= new ClienteBLL();
        try {
            if (oUsuario.validaUsuario(txtUser.getText(), txtpass.getText())) {
                objTimer = new Timer(25, new FormLoggin.ClaseTime());
                objTimer.start();//activa el hilo hace visible el progressbar
                jLabel4.setVisible(true);
                ProgressB12.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado...");
            }
        } catch (Exception ex) {
            Logger.getLogger(FormLoggin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarLActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        // TODO add your handling code here:
        txtUser.setText("");
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusGained
        // TODO add your handling code here:
        txtpass.setText("");
    }//GEN-LAST:event_txtpassFocusGained

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed
public class ClaseTime implements ActionListener {//la clase timer hereda de actionListener

        @Override
        public void actionPerformed(ActionEvent ae) {
            a = ProgressB12.getValue();
            if (a < 100) {
                a++;
                ProgressB12.setValue(a);
            } else {
                objTimer.stop();//para el cronometro
                Cerrar();
                Principal  f = new Principal();
               f.show();
            }
        }
    }
private void Cerrar() {
        dispose();
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
            java.util.logging.Logger.getLogger(FormLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLoggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressB12;
    private java.awt.Button btnAceptarL;
    private java.awt.Button btnsalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
