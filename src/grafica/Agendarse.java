
package grafica;

import java.util.Date;
import logica.Sistema;

public class Agendarse extends javax.swing.JFrame {

    /**
     * Creates new form Agendarse
     */
    public Agendarse() {
        initComponents();
        this.setLocationRelativeTo(null);
        dispose();
        
    }

    public Agendarse(String cedula) {
        
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
        btnAceptar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblBarrio = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jcbBarrio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 360));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agendarse", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 360));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 45, -1, -1));

        lblBarrio.setText("Barrio:");
        jPanel1.add(lblBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 165, -1, -1));

        lblApellido.setText("Apellido:");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 85, -1, -1));

        lblFechaNacimiento.setText("Fecha Nacimiento:");
        jPanel1.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 310, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 310, -1));

        jcbBarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguada", "Buceo", "Carrasco", "Centro", "Cerro", "Ciudad Vieja", "La Blanqueada", "La Teja", "Las Acacias", "Malvin", "Nuevo Paris", "Parque Battle", "Parque Rodo", "Paso Molino", "Tres Cruces" }));
        jcbBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBarrioActionPerformed(evt);
            }
        });
        jPanel1.add(jcbBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbBarrioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
     
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        Date fechaNacimiento=jdcFechaNacimiento.getDate();
        String barrio=null;
        int iteradorBarrio=jcbBarrio.getSelectedIndex();
        
        switch(iteradorBarrio){
            case 0: barrio="Aguada"; break;
            case 1: barrio="Buceo"; break;
            case 2: barrio="Carrasco"; break;
            case 3: barrio="Centro"; break;
            case 4: barrio="Cerro"; break;
            case 5: barrio="Ciudad Vieja"; break;
            case 6: barrio="La Blanqueada"; break;
            case 7: barrio="La Teja"; break;
            case 8: barrio="Las Acacias"; break;
            case 9: barrio="Malvin"; break;
            case 10: barrio="Nuevo Paris"; break;
            case 11: barrio="Parque Battle"; break;
            case 12: barrio="Parque Rodo"; break;
            case 13: barrio="Paso Molino"; break;
            case 14: barrio="Tres Cruces"; break;
        }
        
        Sistema.getInstance().agendarse(nombre, apellido, fechaNacimiento, barrio);
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Agendarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbBarrio;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBarrio;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
