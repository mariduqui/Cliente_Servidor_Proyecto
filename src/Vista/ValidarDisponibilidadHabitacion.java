
package Vista;

import Modelo.BuscarHabitacion;
import Modelo.Reloj;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class ValidarDisponibilidadHabitacion extends javax.swing.JFrame {
    private String hotel = "";
    
    public ValidarDisponibilidadHabitacion() {
        initComponents();
        
       this.setSize(1050, 475);
       this.setLocationRelativeTo(null);
        
        Reloj r = new Reloj();
        r.reloj(lblReloj);
        
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
        tblUser2.setModel(modelo);
        

        DefaultTableModel modeloR = new DefaultTableModel();
        modeloR.addColumn("Hotel");
        modeloR.addColumn("ID Reserva");
        modeloR.addColumn("ID Usuario");
        modeloR.addColumn("ID Habitación");
        modeloR.addColumn("Fecha Ingreso");
        modeloR.addColumn("Fecha Salida");
        tblReservas.setModel(modeloR);
        
        DefaultTableModel modeloH = new DefaultTableModel();
        modeloH.addColumn("Hotel");
        modeloH.addColumn("ID Habitación");
        modeloH.addColumn("Torre");
        modeloH.addColumn("Piso");
        modeloH.addColumn("Num. Hab");
        modeloH.addColumn("Disponible");
        tblHab.setModel(modeloH); 
        
        int width = 20; // specify desired width
        int height = 20; // specify desired height
        Image iconoAg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/volver.jpg"));
        btnVolver1.setIcon(new ImageIcon(iconoAg.getScaledInstance(btnVolver1.getWidth(), btnVolver1.getHeight(), Image.SCALE_SMOOTH)));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        lblReloj = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tblHabitacion = new javax.swing.JScrollPane();
        tblHab = new javax.swing.JTable();
        txtIDHab = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        btnBuscarUser = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        chkNY = new javax.swing.JCheckBox();
        chkRoma = new javax.swing.JCheckBox();
        chkMarruecos = new javax.swing.JCheckBox();
        chkTokyo = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUser2 = new javax.swing.JTable();

        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Buscar Habitación");

        tblHab.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHabitacion.setViewportView(tblHab);

        txtIDHab.setText("Ejemplo: 1101");
        txtIDHab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDHabFocusGained(evt);
            }
        });
        txtIDHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDHabActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Habitación");

        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        btnBuscarUser.setText("Buscar");
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });

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
        jScrollPane3.setViewportView(tblReservas);

        chkNY.setText("Hotel Continental NY");
        chkNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNYActionPerformed(evt);
            }
        });

        chkRoma.setText("Hotel Continental Roma");
        chkRoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRomaActionPerformed(evt);
            }
        });

        chkMarruecos.setText("Hotel Continental Marruecos");
        chkMarruecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMarruecosActionPerformed(evt);
            }
        });

        chkTokyo.setText("Hotel Continental Tokyo");
        chkTokyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTokyoActionPerformed(evt);
            }
        });

        tblUser2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblUser2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIDHab, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscarUser)))
                                    .addGap(18, 18, 18)
                                    .addComponent(chkNY)
                                    .addGap(22, 22, 22)
                                    .addComponent(chkRoma)
                                    .addGap(37, 37, 37)
                                    .addComponent(chkMarruecos)
                                    .addGap(42, 42, 42)
                                    .addComponent(chkTokyo)))
                            .addComponent(tblHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolver1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarUser)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chkNY)
                        .addComponent(chkRoma)
                        .addComponent(chkMarruecos)
                        .addComponent(chkTokyo)))
                .addGap(18, 18, 18)
                .addComponent(tblHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuAdmin ma = new MenuAdmin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
        BuscarHabitacion bh = new BuscarHabitacion();
        bh.buscarHabitacion(hotel, Integer.parseInt(txtIDHab.getText().toString()), tblHab);
        bh.buscarReservaHab(hotel, Integer.parseInt(txtIDHab.getText().toString()), tblReservas);
        bh.buscarUser(hotel, Integer.parseInt(txtIDHab.getText().toString()), tblUser2);
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void chkNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNYActionPerformed
        if(chkNY.isSelected()){
            hotel = "NY";
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
        }
    }//GEN-LAST:event_chkNYActionPerformed

    private void chkRomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRomaActionPerformed
        if(chkRoma.isSelected()){
            hotel = "Roma";
            chkNY.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
        }
    }//GEN-LAST:event_chkRomaActionPerformed

    private void chkMarruecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMarruecosActionPerformed
        if(chkMarruecos.isSelected()){
            hotel = "Marruecos";
            chkNY.setSelected(false);
            chkRoma.setSelected(false);
            chkTokyo.setSelected(false);
        }
    }//GEN-LAST:event_chkMarruecosActionPerformed

    private void chkTokyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTokyoActionPerformed
        if(chkTokyo.isSelected()){
            hotel = "Tokyo";
            chkNY.setSelected(false);
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
        }
    }//GEN-LAST:event_chkTokyoActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        MenuAdmin ma = new MenuAdmin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void txtIDHabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDHabFocusGained
        // TODO add your handling code here:
        txtIDHab.setText("");
        txtIDHab.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtIDHabFocusGained

    private void txtIDHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDHabActionPerformed

    
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
            java.util.logging.Logger.getLogger(ValidarDisponibilidadHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidarDisponibilidadHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidarDisponibilidadHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidarDisponibilidadHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidarDisponibilidadHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JCheckBox chkMarruecos;
    private javax.swing.JCheckBox chkNY;
    private javax.swing.JCheckBox chkRoma;
    private javax.swing.JCheckBox chkTokyo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTable tblHab;
    private javax.swing.JScrollPane tblHabitacion;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTable tblUser;
    private javax.swing.JTable tblUser2;
    private javax.swing.JTextField txtIDHab;
    // End of variables declaration//GEN-END:variables
}
