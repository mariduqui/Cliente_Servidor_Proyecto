/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorBuscarUser;
import Controlador.ControladorReserva;
import Modelo.Reloj;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class ReservarAdmin extends javax.swing.JFrame {
    private String hotel;
    
    public ReservarAdmin() {
        initComponents();
        this.setSize(950, 615);
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
        
        chkReservaAuto.setSelected(true);
        
        lblNumHab.setVisible(false);
        txtIDHab.setVisible(false);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido 1");
        modelo.addColumn("Apellido 2");
        modelo.addColumn("Identificación");
        modelo.addColumn("Nacionalidad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        
        tblUser.setModel(modelo);
        
        Reloj r = new Reloj();
        r.reloj(lblReloj);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNY = new javax.swing.JButton();
        lblRoma1 = new javax.swing.JLabel();
        lblNY1 = new javax.swing.JLabel();
        btnRoma = new javax.swing.JButton();
        btnMarruecos = new javax.swing.JButton();
        lblMarruecos1 = new javax.swing.JLabel();
        btnTokyo = new javax.swing.JButton();
        lblTokyo1 = new javax.swing.JLabel();
        lblHotel = new javax.swing.JLabel();
        lblIngreso1 = new javax.swing.JLabel();
        fechaIng = new com.toedter.calendar.JDateChooser();
        lblSalida = new javax.swing.JLabel();
        fechaSal = new com.toedter.calendar.JDateChooser();
        btnReservar = new javax.swing.JButton();
        chkReservaAuto = new javax.swing.JCheckBox();
        txtID = new javax.swing.JTextField();
        lblHotel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtIDHab = new javax.swing.JTextField();
        lblNumHab = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reservar una Habitación");

        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione las fechas de la reserva.");

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

        lblHotel.setText("Reservar en el Hotel Continental de:");

        lblIngreso1.setText("Fecha Ingreso:");

        lblSalida.setText("Fecha Salida:");

        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        chkReservaAuto.setText("Reserva Automática");
        chkReservaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReservaAutoActionPerformed(evt);
            }
        });

        lblHotel1.setText("Buscar Cliente por Identificacion:");

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUser);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNumHab.setText("ID de Habitación Deseada:");

        btnRegistrar.setText("Registrar Cliente");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkReservaAuto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIngreso1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaSal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalida)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblHotel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumHab)
                    .addComponent(txtIDHab, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHotel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(lblMarruecos1))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTokyo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTokyo1)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHotel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIngreso1)
                                .addGap(4, 4, 4)
                                .addComponent(fechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNumHab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHotel)
                    .addComponent(chkReservaAuto))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuAdmin ma = new MenuAdmin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNYActionPerformed
        hotel = "NY";
        lblHotel.setText("Reservar en el Hotel Continental de: " + hotel);
    }//GEN-LAST:event_btnNYActionPerformed

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

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        ControladorReserva  cr = new ControladorReserva();
        
        if(chkReservaAuto.isSelected()){
            if(cr.reservaControlAuto(hotel, fechaIng.getDate(), fechaSal.getDate())){
                hotel = "";
                chkReservaAuto.setSelected(true);
                lblNumHab.setVisible(false);
                txtIDHab.setVisible(false);
                
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("ID Usuario");
                modelo.addColumn("Usuario");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido 1");
                modelo.addColumn("Apellido 2");
                modelo.addColumn("Identificación");
                modelo.addColumn("Nacionalidad");
                modelo.addColumn("Telefono");
                modelo.addColumn("Correo");

                tblUser.setModel(modelo);
                
                txtID.setText("");
                txtIDHab.setText("");
                fechaIng.setDate(null);
                fechaSal.setDate(null);
            }
        }else{
            if(txtIDHab.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un numero de habitación o hacer una reserva automatica.");
                return;  
            }
            
            if(cr.reservaManual(hotel, fechaIng.getDate(), fechaSal.getDate(), Integer.parseInt(txtIDHab.getText()))){
                hotel = "";
                chkReservaAuto.setSelected(true);
                lblNumHab.setVisible(false);
                txtIDHab.setVisible(false);
                
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("ID Usuario");
                modelo.addColumn("Usuario");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido 1");
                modelo.addColumn("Apellido 2");
                modelo.addColumn("Identificación");
                modelo.addColumn("Nacionalidad");
                modelo.addColumn("Telefono");
                modelo.addColumn("Correo");

                tblUser.setModel(modelo);
                
                txtID.setText("");
                txtIDHab.setText("");
                fechaIng.setDate(null);
                fechaSal.setDate(null);
            }
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ControladorBuscarUser cbu = new ControladorBuscarUser();
        cbu.buscarUser(tblUser, txtID.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistroClientesAdmin rca = new RegistroClientesAdmin();
        
        this.setVisible(false);
        rca.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void chkReservaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReservaAutoActionPerformed
        if(chkReservaAuto.isSelected()){
            lblNumHab.setVisible(false);
            txtIDHab.setVisible(false);
        }
        else if(!(chkReservaAuto.isSelected())){
            lblNumHab.setVisible(true);
            txtIDHab.setVisible(true);
        }
        
        
    }//GEN-LAST:event_chkReservaAutoActionPerformed

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
            java.util.logging.Logger.getLogger(ReservarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMarruecos;
    private javax.swing.JButton btnNY;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnRoma;
    private javax.swing.JButton btnTokyo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkReservaAuto;
    private com.toedter.calendar.JDateChooser fechaIng;
    private com.toedter.calendar.JDateChooser fechaSal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHotel;
    private javax.swing.JLabel lblHotel1;
    private javax.swing.JLabel lblIngreso1;
    private javax.swing.JLabel lblMarruecos1;
    private javax.swing.JLabel lblNY1;
    private javax.swing.JLabel lblNumHab;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblRoma1;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTokyo1;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDHab;
    // End of variables declaration//GEN-END:variables
}
