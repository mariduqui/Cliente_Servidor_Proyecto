
package Vista;

import Controlador.ControladorBuscarUser;
import Controlador.ControladorEliminarReservaAdmin;
import Controlador.ControladorMostrarReservas;
import Modelo.MostrarReservasUser;
import Modelo.Reloj;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class EliminarReservasPersonaAdmin extends javax.swing.JFrame {
    private String hotel = "";
    private String eliminar = "Una";
    private int idRes = 0;
    
    public EliminarReservasPersonaAdmin() {
        initComponents();
        
        this.setSize(1075, 475);
        this.setLocationRelativeTo(null);

        Image iconoAg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/volver.jpg"));
        btnVolver.setIcon(new ImageIcon(iconoAg.getScaledInstance(btnVolver.getWidth(), btnVolver.getHeight(), Image.SCALE_SMOOTH)));
        
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
        
        btnEliminarUna.setSelected(true);
        
        DefaultTableModel modeloR = new DefaultTableModel();
        modeloR.addColumn("Hotel");
        modeloR.addColumn("ID Reserva");
        modeloR.addColumn("Fecha Ingreso");
        modeloR.addColumn("Fecha Salida");
        tblReservas.setModel(modeloR);   
        
        Reloj r = new Reloj();
        r.reloj(lblReloj2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chkNY = new javax.swing.JCheckBox();
        chkRoma = new javax.swing.JCheckBox();
        chkMarruecos = new javax.swing.JCheckBox();
        chkTokyo = new javax.swing.JCheckBox();
        btnEliminarUna = new javax.swing.JRadioButton();
        btnEliminarTodasUnHotel = new javax.swing.JRadioButton();
        btnEliminarTodas = new javax.swing.JRadioButton();
        btnEliminar = new javax.swing.JButton();
        lblIDReserva = new javax.swing.JLabel();
        cboIDRes = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnBuscarUser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        lblReloj = new javax.swing.JLabel();
        lblReloj2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Eliminar Reservas de Cliente");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Identificación del Cliente:");

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

        btnEliminarUna.setText("Eliminar una reserva en un hotel");
        btnEliminarUna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUnaActionPerformed(evt);
            }
        });

        btnEliminarTodasUnHotel.setText("Eliminar todas las reservas en un hotel");
        btnEliminarTodasUnHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodasUnHotelActionPerformed(evt);
            }
        });

        btnEliminarTodas.setText("Eliminar todas las reservas en todos los hoteles");
        btnEliminarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodasActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblIDReserva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDReserva.setText("ID Reserva");

        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscarUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        jScrollPane2.setViewportView(tblReservas);

        lblReloj.setText("reloj");

        lblReloj2.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Elija el hotel en el que desea eliminar la reserva:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(246, 246, 246)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblReloj2)
                            .addGap(19, 19, 19))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnEliminarUna)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                    .addComponent(btnEliminarTodasUnHotel)
                                    .addGap(141, 141, 141)
                                    .addComponent(btnEliminarTodas))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(chkNY)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(chkRoma)
                                            .addGap(26, 26, 26)))
                                    .addGap(112, 112, 112)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chkMarruecos)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblIDReserva)
                                            .addGap(18, 18, 18)
                                            .addComponent(cboIDRes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(103, 103, 103)
                                            .addComponent(chkTokyo))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(71, 71, 71)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25))))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscarUser))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblReloj)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblReloj2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscarUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarUna)
                    .addComponent(btnEliminarTodasUnHotel)
                    .addComponent(btnEliminarTodas))
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkNY)
                        .addComponent(chkRoma))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkMarruecos)
                        .addComponent(chkTokyo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboIDRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(lblIDReserva))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 207, Short.MAX_VALUE)
                    .addComponent(lblReloj)
                    .addGap(0, 208, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNYActionPerformed
        if(chkNY.isSelected()){
            hotel = "NY";
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
        }

        MostrarReservasUser mru = new MostrarReservasUser();
        mru.listarReservasCBO(cboIDRes, hotel);
    }//GEN-LAST:event_chkNYActionPerformed

    private void chkRomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRomaActionPerformed
        if(chkRoma.isSelected()){
            hotel = "Roma";
            chkNY.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
        }

        MostrarReservasUser mru = new MostrarReservasUser();
        mru.listarReservasCBO(cboIDRes, hotel);
    }//GEN-LAST:event_chkRomaActionPerformed

    private void chkMarruecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMarruecosActionPerformed
        if(chkMarruecos.isSelected()){
            hotel = "Marruecos";
            chkNY.setSelected(false);
            chkRoma.setSelected(false);
            chkTokyo.setSelected(false);
        }

        MostrarReservasUser mru = new MostrarReservasUser();
        mru.listarReservasCBO(cboIDRes, hotel);
    }//GEN-LAST:event_chkMarruecosActionPerformed

    private void chkTokyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTokyoActionPerformed
        if(chkTokyo.isSelected()){
            hotel = "Tokyo";
            chkNY.setSelected(false);
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
        }

        MostrarReservasUser mru = new MostrarReservasUser();
        mru.listarReservasCBO(cboIDRes, hotel);
    }//GEN-LAST:event_chkTokyoActionPerformed

    private void btnEliminarTodasUnHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodasUnHotelActionPerformed
        if(btnEliminarTodasUnHotel.isSelected()){
            btnEliminarUna.setSelected(false);
            btnEliminarTodas.setSelected(false);
            eliminar = "Todas un hotel";
            
            chkNY.setVisible(true);
            chkRoma.setVisible(true);
            chkMarruecos.setVisible(true);
            chkTokyo.setVisible(true);
            
            lblIDReserva.setVisible(false);
            cboIDRes.setVisible(false);
        }
        
    }//GEN-LAST:event_btnEliminarTodasUnHotelActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuAdmin ma = new MenuAdmin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
        ControladorBuscarUser cbu = new ControladorBuscarUser();
        cbu.buscarUser(tblUser, txtID.getText());
        
        ControladorMostrarReservas cmr  = new  ControladorMostrarReservas();
        cmr.MostrarReservasUser(tblReservas);
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void btnEliminarUnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUnaActionPerformed
        if(btnEliminarUna.isSelected()){
            btnEliminarTodasUnHotel.setSelected(false);
            btnEliminarTodas.setSelected(false);
            eliminar = "Una";
            
            chkNY.setVisible(true);
            chkRoma.setVisible(true);
            chkMarruecos.setVisible(true);
            chkTokyo.setVisible(true);
            
            cboIDRes.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarUnaActionPerformed

    private void btnEliminarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodasActionPerformed
        if(btnEliminarTodas.isSelected()){
            btnEliminarTodasUnHotel.setSelected(false);
            btnEliminarUna.setSelected(false);
            eliminar = "Todas";
            
            chkNY.setVisible(false);
            chkRoma.setVisible(false);
            chkMarruecos.setVisible(false);
            chkTokyo.setVisible(false);
            
            lblIDReserva.setVisible(false);
            cboIDRes.setVisible(false);
        }
    }//GEN-LAST:event_btnEliminarTodasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(btnEliminarUna.isSelected()){
            idRes = Integer.parseInt(cboIDRes.getSelectedItem().toString());
        }
        
        ControladorEliminarReservaAdmin cera = new ControladorEliminarReservaAdmin();
        cera.eliminarReservaPersona(hotel, idRes, eliminar);
        
        ControladorMostrarReservas cmr  = new  ControladorMostrarReservas();
        cmr.MostrarReservasUser(tblReservas);
        
        MostrarReservasUser mru = new MostrarReservasUser();
        mru.listarReservasCBO(cboIDRes, hotel);
    }//GEN-LAST:event_btnEliminarActionPerformed

   
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
            java.util.logging.Logger.getLogger(EliminarReservasPersonaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarReservasPersonaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarReservasPersonaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarReservasPersonaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarReservasPersonaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JRadioButton btnEliminarTodas;
    private javax.swing.JRadioButton btnEliminarTodasUnHotel;
    private javax.swing.JRadioButton btnEliminarUna;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboIDRes;
    private javax.swing.JCheckBox chkMarruecos;
    private javax.swing.JCheckBox chkNY;
    private javax.swing.JCheckBox chkRoma;
    private javax.swing.JCheckBox chkTokyo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIDReserva;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblReloj2;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
