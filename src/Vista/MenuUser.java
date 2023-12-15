
package Vista;

import Modelo.Reloj;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alede
 */
public class MenuUser extends javax.swing.JFrame {

    
    public MenuUser() {
        initComponents();
        
        this.setSize(550, 500);
        this.setLocationRelativeTo(null);
        
        Image interiorHotel = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/InteriorHotel.jpg"));
        frameFoto.setIcon(new ImageIcon(interiorHotel.getScaledInstance(frameFoto.getWidth(), frameFoto.getHeight(), Image.SCALE_SMOOTH)));
        
        Reloj r = new Reloj();
        r.reloj(lblReloj);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModReserva = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        frameFoto = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModReserva.setText("Modificar Reserva");
        btnModReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 150, 60));

        jButton2.setText("Reservar Habitación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 150, 60));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Bienvenido a los Hoteles Continental");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 90));
        getContentPane().add(frameFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 430, 250));
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ReservarHabitacionUser rhu = new ReservarHabitacionUser();
        this.setVisible(false);
        rhu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModReservaActionPerformed
        AdministrarReservasUser aru = new AdministrarReservasUser();
        this.setVisible(false);
        aru.setVisible(true);
    }//GEN-LAST:event_btnModReservaActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModReserva;
    private javax.swing.JButton frameFoto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblReloj;
    // End of variables declaration//GEN-END:variables
}
