
package Vista;

/**
 *
 * @author alede
 */
public class MenuAdmin extends javax.swing.JFrame {

   
    public MenuAdmin() {
        initComponents();
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        cboOpcion = new javax.swing.JComboBox<>();
        btnIr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Bienvenido a los Hoteles Continental");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 530, 90));

        cboOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Listar todos los hoteles de la cadena ", "2 - Listar todas las habitaciones disponibles por hotel ", "3 - Registrar reservación a una persona ", "4 - Eliminar reservación de una persona ", "5 - Eliminar todas las reservaciones por hotel  ", "6 - Buscar persona por número de cédula/pasaporte ", "7 - Validar disponibilidad de una habitación en un hotel ", " " }));
        getContentPane().add(cboOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 350, -1));

        btnIr.setText("IR");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });
        getContentPane().add(btnIr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        /*1 - Listar todos los hoteles de la cadena 
        6 - Eliminar todas las reservaciones por hotel  
        7 - Buscar persona por número de cédula/pasaporte 
        8 - Validar disponibilidad de una habitación en un hotel 
        9 - Salir*/
        
        if(cboOpcion.getSelectedItem().toString().contains("2 - Listar todas las habitaciones disponibles por hotel")){
            ListarHabitacionesDisponibles lhd = new ListarHabitacionesDisponibles();
            this.setVisible(false);
            lhd.setVisible(true);
        }if(cboOpcion.getSelectedItem().toString().contains("3 - Registrar reservación a una persona")){
            ReservarAdmin ra = new ReservarAdmin();
            this.setVisible(false);
            ra.setVisible(true);
        }if(cboOpcion.getSelectedItem().toString().contains("4 - Eliminar reservación de una persona")){
            EliminarReservasPersonaAdmin erpa = new EliminarReservasPersonaAdmin();
            this.setVisible(false);
            erpa.setVisible(true);
        }if(cboOpcion.getSelectedItem().toString().contains("5 - Eliminar todas las reservaciones por hotel")){
            EliminarReservasHotel erh = new EliminarReservasHotel();
            this.setVisible(false);
            erh.setVisible(true);
        }
        
        //EliminarReservasHotel
    }//GEN-LAST:event_btnIrActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIr;
    private javax.swing.JComboBox<String> cboOpcion;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}
