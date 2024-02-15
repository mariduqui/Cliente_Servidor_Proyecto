
package Vista;

import Controlador.ControladorEliminarReservasPorHotel;
import Modelo.Reloj;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class EliminarReservasHotel extends javax.swing.JFrame {
    private String hotel;
    
    public EliminarReservasHotel() {
        initComponents();
        
        this.setSize(950, 350);
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
        btnNY = new javax.swing.JButton();
        lblRoma1 = new javax.swing.JLabel();
        lblNY1 = new javax.swing.JLabel();
        btnRoma = new javax.swing.JButton();
        btnMarruecos = new javax.swing.JButton();
        lblMarruecos1 = new javax.swing.JLabel();
        btnTokyo = new javax.swing.JButton();
        lblTokyo1 = new javax.swing.JLabel();
        lblHotel = new javax.swing.JLabel();
        chkTodos = new javax.swing.JCheckBox();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Eliminar Reservas por Hotel");

        btnNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNYActionPerformed(evt);
            }
        });

        lblRoma1.setText("Hotel Continental Roma");

        lblNY1.setText("Hotel Continental NY");

        btnRoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomaActionPerformed(evt);
            }
        });

        btnMarruecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarruecosActionPerformed(evt);
            }
        });

        lblMarruecos1.setText("Hotel Continental Marruecos");

        btnTokyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokyoActionPerformed(evt);
            }
        });

        lblTokyo1.setText("Hotel Continental Tokyo");

        lblHotel.setText("Eliminar en el Hotel Continental de:");

        chkTodos.setText("Eliminar en todos");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblReloj.setText("reloj");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNY, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNY1))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRoma, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRoma1))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMarruecos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMarruecos1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHotel)
                                .addGap(181, 181, 181)
                                .addComponent(chkTodos)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTokyo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTokyo1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblReloj)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReloj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRoma1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRoma, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNY1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNY, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarruecos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMarruecos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTokyo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTokyo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHotel)
                    .addComponent(chkTodos)
                    .addComponent(btnEliminar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNYActionPerformed
        hotel = "NY";
        lblHotel.setText("Eliminar todas la reservas en el hotel Continental de " + hotel);
    }//GEN-LAST:event_btnNYActionPerformed

    private void btnRomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomaActionPerformed
        hotel = "Roma";
        lblHotel.setText("Eliminar todas la reservas en el hotel Continental de " + hotel);
    }//GEN-LAST:event_btnRomaActionPerformed

    private void btnMarruecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarruecosActionPerformed
        hotel = "Marruecos";
        lblHotel.setText("Eliminar todas la reservas en el hotel Continental de " + hotel);
    }//GEN-LAST:event_btnMarruecosActionPerformed

    private void btnTokyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokyoActionPerformed
        hotel = "Tokyo";
        lblHotel.setText("Eliminar todas la reservas en el hotel Continental de " + hotel);
    }//GEN-LAST:event_btnTokyoActionPerformed

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed
        if(chkTodos.isSelected()){
            hotel = "Todos";
            lblHotel.setText("Eliminar todas la reservas en todos los hoteles.");
        }
    }//GEN-LAST:event_chkTodosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuAdmin ma = new MenuAdmin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ControladorEliminarReservasPorHotel cerph = new ControladorEliminarReservasPorHotel();
        if(!hotel.equals("")){
            cerph.eliminarReservas(hotel);
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un hotel o todos.");
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarReservasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarReservasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarReservasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarReservasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarReservasHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMarruecos;
    private javax.swing.JButton btnNY;
    private javax.swing.JButton btnRoma;
    private javax.swing.JButton btnTokyo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblHotel;
    private javax.swing.JLabel lblMarruecos1;
    private javax.swing.JLabel lblNY1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblRoma1;
    private javax.swing.JLabel lblTokyo1;
    // End of variables declaration//GEN-END:variables
}
