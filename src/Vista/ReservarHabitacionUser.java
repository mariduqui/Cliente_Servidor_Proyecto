
package Vista;

import Controlador.ControladorReserva;
import Modelo.Reloj;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author alede
 */
public class ReservarHabitacionUser extends javax.swing.JFrame {
    private String hotel = "";
    
    public ReservarHabitacionUser() {
        initComponents();
        
        this.setSize(575, 650);
        this.setLocationRelativeTo(null);
        
        Image iconoNY = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/continentalNY.jpeg"));
        btnNY.setIcon(new ImageIcon(iconoNY.getScaledInstance(btnNY.getWidth(), btnNY.getHeight(), Image.SCALE_SMOOTH)));
        
        Image iconoRoma = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/continentalRoma.jpg"));
        btnRoma.setIcon(new ImageIcon(iconoRoma.getScaledInstance(btnRoma.getWidth(), btnRoma.getHeight(), Image.SCALE_SMOOTH)));
        
        Image iconoMarruecos = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/continentalMarruecos.jpg"));
        btnMarruecos.setIcon(new ImageIcon(iconoMarruecos.getScaledInstance(btnMarruecos.getWidth(), btnMarruecos.getHeight(), Image.SCALE_SMOOTH)));
        
        Image iconoTokyo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/continentalTokyo.jpg"));
        btnTokyo.setIcon(new ImageIcon(iconoTokyo.getScaledInstance(btnTokyo.getWidth(), btnTokyo.getHeight(), Image.SCALE_SMOOTH)));
        
        Image iconoAg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/volver.jpg"));
        btnVolver.setIcon(new ImageIcon(iconoAg.getScaledInstance(btnVolver.getWidth(), btnVolver.getHeight(), Image.SCALE_SMOOTH)));
        
        Reloj r = new Reloj();
        r.reloj(lblReloj);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        btnTokyo = new javax.swing.JButton();
        btnNY = new javax.swing.JButton();
        btnRoma = new javax.swing.JButton();
        btnMarruecos = new javax.swing.JButton();
        fechaSalida = new com.toedter.calendar.JDateChooser();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        lblSalida = new javax.swing.JLabel();
        lblNY1 = new javax.swing.JLabel();
        lblRoma1 = new javax.swing.JLabel();
        lblMarruecos1 = new javax.swing.JLabel();
        lblTokyo1 = new javax.swing.JLabel();
        lblIngreso1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblHotel = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reservar una Habitación");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 350, 40));

        btnTokyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokyoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTokyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 190, 110));

        btnNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNYActionPerformed(evt);
            }
        });
        getContentPane().add(btnNY, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, 110));

        btnRoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 190, 110));

        btnMarruecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarruecosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarruecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 190, 110));
        getContentPane().add(fechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 150, -1));
        getContentPane().add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 150, -1));

        lblSalida.setText("Fecha Salida:");
        getContentPane().add(lblSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        lblNY1.setText("Hotel Continental NY");
        getContentPane().add(lblNY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lblRoma1.setText("Hotel Continental Roma");
        getContentPane().add(lblRoma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        lblMarruecos1.setText("Hotel Continental Marruecos");
        getContentPane().add(lblMarruecos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        lblTokyo1.setText("Hotel Continental Tokyo");
        getContentPane().add(lblTokyo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        lblIngreso1.setText("Fecha Ingreso:");
        getContentPane().add(lblIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione las fechas de su reserva, una vez las tenga haga click sobre el hotel.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 540, 70));

        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 120, 40));

        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 30));

        lblHotel.setText("Reservar en el Hotel Continental de:");
        getContentPane().add(lblHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNYActionPerformed
        hotel = "NY";
        lblHotel.setText("Reservar en el Hotel Continental de: " + hotel);
    }//GEN-LAST:event_btnNYActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControladorReserva cr  = new  ControladorReserva();
        cr.reservaControlAuto(hotel, fechaIngreso.getDate(), fechaSalida.getDate());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomaActionPerformed
        hotel = "Roma";
        lblHotel.setText("Reservar en el Hotel Continental de: " + hotel);
    }//GEN-LAST:event_btnRomaActionPerformed

    private void btnMarruecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarruecosActionPerformed
        hotel = "Marruecos";
        lblHotel.setText("Reservar en el Hotel Continental de: " + hotel);
    }//GEN-LAST:event_btnMarruecosActionPerformed

    private void btnTokyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokyoActionPerformed
        hotel = "Tokyo";
        lblHotel.setText("Reservar en el Hotel Continental de: " + hotel);
    }//GEN-LAST:event_btnTokyoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        
        MenuUser mu = new MenuUser();
        mu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ReservarHabitacionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarHabitacionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarHabitacionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarHabitacionUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarHabitacionUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarruecos;
    private javax.swing.JButton btnNY;
    private javax.swing.JButton btnRoma;
    private javax.swing.JButton btnTokyo;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblHotel;
    private javax.swing.JLabel lblIngreso1;
    private javax.swing.JLabel lblMarruecos1;
    private javax.swing.JLabel lblNY1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblRoma1;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTokyo1;
    // End of variables declaration//GEN-END:variables
}
