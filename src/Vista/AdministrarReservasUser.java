/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorModificarReserva;
import Controlador.ControladorMostrarReservas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTable;

/**
 *
 * @author alede
 */
public class AdministrarReservasUser extends javax.swing.JFrame {
    
    String hotel = "";

    public AdministrarReservasUser() {
        initComponents();
        
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);

        ControladorMostrarReservas cmr  = new  ControladorMostrarReservas();
        cmr.MostrarReservasUser(tblReservas);

        Image iconoAg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/volver.jpg"));
        btnVolver.setIcon(new ImageIcon(iconoAg.getScaledInstance(btnVolver.getWidth(), btnVolver.getHeight(), Image.SCALE_SMOOTH)));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        chkTokyo = new javax.swing.JCheckBox();
        chkNY = new javax.swing.JCheckBox();
        chkRoma = new javax.swing.JCheckBox();
        chkMarruecos = new javax.swing.JCheckBox();
        fechaSal = new com.toedter.calendar.JDateChooser();
        fechaIng = new com.toedter.calendar.JDateChooser();
        txtIdReserva = new javax.swing.JTextField();
        btnEliminarReserva = new javax.swing.JButton();
        btnModFecha1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Modificar una Reserva");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 350, 40));

        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblReservas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 720, 150));
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 20));

        chkTokyo.setText("Hotel Continental Tokyo");
        getContentPane().add(chkTokyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        chkNY.setText("Hotel Continental NY");
        chkNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNYActionPerformed(evt);
            }
        });
        getContentPane().add(chkNY, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        chkRoma.setText("Hotel Continental Roma");
        getContentPane().add(chkRoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        chkMarruecos.setText("Hotel Continental Marruecos");
        getContentPane().add(chkMarruecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));
        getContentPane().add(fechaSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 160, -1));
        getContentPane().add(fechaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 160, -1));
        getContentPane().add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 140, -1));

        btnEliminarReserva.setText("Eliminar Reserva");
        getContentPane().add(btnEliminarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 130, -1));

        btnModFecha1.setText("Modificar Fecha");
        btnModFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModFecha1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnModFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 130, -1));

        jLabel1.setText("ID Reserva");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel2.setText("Fecha Ingreso Modificada");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel3.setText("Fecha Salida Modificada");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModFecha1ActionPerformed
        ControladorModificarReserva cmr = new ControladorModificarReserva();
        cmr.modFechaUser(hotel, Integer.parseInt(txtIdReserva.getText()), fechaIng.getDate(), fechaSal.getDate());
        
        ControladorMostrarReservas cmru  = new  ControladorMostrarReservas();
        cmru.MostrarReservasUser(tblReservas);
        
    }//GEN-LAST:event_btnModFecha1ActionPerformed

    private void chkNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNYActionPerformed
        if(chkNY.isSelected()){
            hotel = "NY";
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
        }
    }//GEN-LAST:event_chkNYActionPerformed


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
            java.util.logging.Logger.getLogger(AdministrarReservasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarReservasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarReservasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarReservasUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarReservasUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarReserva;
    private javax.swing.JButton btnModFecha1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkMarruecos;
    private javax.swing.JCheckBox chkNY;
    private javax.swing.JCheckBox chkRoma;
    private javax.swing.JCheckBox chkTokyo;
    private com.toedter.calendar.JDateChooser fechaIng;
    private com.toedter.calendar.JDateChooser fechaSal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTextField txtIdReserva;
    // End of variables declaration//GEN-END:variables
}
