
package grafica;

public class MenuUsuario extends javax.swing.JFrame {

    public MenuUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        dispose();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        btnAgendarse = new javax.swing.JButton();
        lblTituloEstado = new javax.swing.JLabel();
        lblTituloUsuario = new javax.swing.JLabel();
        lblEstadoActual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 380));
        setPreferredSize(new java.awt.Dimension(600, 380));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Usuario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedula.setText("4.972.650-2");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        btnAgendarse.setText("Agendarse");
        btnAgendarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgendarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        lblTituloEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloEstado.setText("Estado:");
        jPanel1.add(lblTituloEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lblTituloUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloUsuario.setText("Usuario:");
        jPanel1.add(lblTituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        lblEstadoActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstadoActual.setText("Sin agendarse");
        jPanel1.add(lblEstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Info.", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("4.972.650-2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jButton2.setText("Agendarse");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Estado:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Usuario:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Sin agendarse");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 560, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarseActionPerformed
        String cedula=lblCedula.getText();
        Agendarse agendarse = new Agendarse(cedula);
    }//GEN-LAST:event_btnAgendarseActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarse;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEstadoActual;
    private javax.swing.JLabel lblTituloEstado;
    private javax.swing.JLabel lblTituloUsuario;
    // End of variables declaration//GEN-END:variables
}
