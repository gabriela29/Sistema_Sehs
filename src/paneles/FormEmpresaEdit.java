/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Window;
import javax.swing.SwingUtilities;
import sehs.controller.EmpresaBLL;
import sehs.entity.EmpresaTO;


/**
 *
 * @author SEHS - TI
 */
public class FormEmpresaEdit extends javax.swing.JPanel {
  
            
    /**
     * Creates new form FormEmpresa
     */
    public FormEmpresaEdit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_ruc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txturl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        BtnCancelar = new java.awt.Button();
        btnAceptar = new java.awt.Button();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Nombre de la Empresa:");

        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_ruc.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_ruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rucActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("RUC:");

        txturl.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txturl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txturlActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel9.setText("Dirección:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel10.setText("URL:");

        txt_direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        BtnCancelar.setActionCommand("btn_cancel");
        BtnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        BtnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        BtnCancelar.setLabel("Cancel");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setActionCommand("btn_complete");
        btnAceptar.setBackground(new java.awt.Color(36, 193, 93));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setLabel("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Empresa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(237, 237, 237)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
       Window w = SwingUtilities.getWindowAncestor(FormEmpresaEdit.this);
       w.setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txturlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txturlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txturlActionPerformed

    private void txt_rucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rucActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
       procesar(1);
    }//GEN-LAST:event_btnAceptarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BtnCancelar;
    private java.awt.Button btnAceptar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_ruc;
    private javax.swing.JTextField txturl;
    // End of variables declaration//GEN-END:variables

    private void procesar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//EmpresaBLL obj = new EmpresaBLL;
  EmpresaTO emp;  
    
//     private void procesar(int op) {
//        empr = datosEmpresa();
//        try {
//            String msj = obj.EmpleadoProcesar(emp, op);
//           // txtIdEmpleado.setText(emp.getIdempleado());
//            JOptionPane.showMessageDialog(this, msj);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
//    }
    
    
   
}





