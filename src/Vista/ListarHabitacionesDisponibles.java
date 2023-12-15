
package Vista;

import Controlador.ControladorMostrarHabitaciones;
import Modelo.Conexion;
import Modelo.ListarHabitaciones;
import Modelo.Reloj;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class ListarHabitacionesDisponibles extends javax.swing.JFrame {
    
    private String hotel;
    
    public ListarHabitacionesDisponibles() {
        initComponents();
        this.setSize(850, 525);
        this.setLocationRelativeTo(null);
        
        Image iconoAg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/volver.jpg"));
        btnVolver.setIcon(new ImageIcon(iconoAg.getScaledInstance(btnVolver.getWidth(), btnVolver.getHeight(), Image.SCALE_SMOOTH)));
        
        ListarHabitaciones lh = new ListarHabitaciones();
        
        lh.listarHabTodos(tblHab);
        
        Reloj r = new Reloj();
        r.reloj(lblReloj);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHab = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        chkNY = new javax.swing.JCheckBox();
        chkRoma = new javax.swing.JCheckBox();
        chkMarruecos = new javax.swing.JCheckBox();
        chkTodos = new javax.swing.JCheckBox();
        btnVolver = new javax.swing.JButton();
        chkTokyo = new javax.swing.JCheckBox();
        btnListar = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tblHab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 770, 290));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Habitaciones por Hotel");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 530, 90));

        chkNY.setText("Hotel Continental NY");
        chkNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNYActionPerformed(evt);
            }
        });
        getContentPane().add(chkNY, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        chkRoma.setText("Hotel Continental Roma");
        chkRoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRomaActionPerformed(evt);
            }
        });
        getContentPane().add(chkRoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        chkMarruecos.setText("Hotel Continental Marruecos");
        chkMarruecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMarruecosActionPerformed(evt);
            }
        });
        getContentPane().add(chkMarruecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        chkTodos.setText("Todos los Hoteles");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });
        getContentPane().add(chkTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        chkTokyo.setText("Hotel Continental Tokyo");
        chkTokyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTokyoActionPerformed(evt);
            }
        });
        getContentPane().add(chkTokyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        lblReloj.setText("reloj");
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNYActionPerformed
        if(chkNY.isSelected()){
            hotel = "NY";
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
            chkTodos.setSelected(false);
        }
    }//GEN-LAST:event_chkNYActionPerformed

    private void chkRomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRomaActionPerformed
        if(chkRoma.isSelected()){
            hotel = "Roma";
            chkNY.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
            chkTodos.setSelected(false);
        }
    }//GEN-LAST:event_chkRomaActionPerformed

    private void chkMarruecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMarruecosActionPerformed
        if(chkMarruecos.isSelected()){
            hotel = "Marruecos";
            chkNY.setSelected(false);
            chkRoma.setSelected(false);
            chkTokyo.setSelected(false);
            chkTodos.setSelected(false);
        }
    }//GEN-LAST:event_chkMarruecosActionPerformed

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed
        if(chkTodos.isSelected()){
            hotel = "Todos";
            chkNY.setSelected(false);
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTokyo.setSelected(false);
        }
    }//GEN-LAST:event_chkTodosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuAdmin ma = new MenuAdmin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void chkTokyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTokyoActionPerformed
        if(chkTokyo.isSelected()){
            hotel = "Tokyo";
            chkNY.setSelected(false);
            chkRoma.setSelected(false);
            chkMarruecos.setSelected(false);
            chkTodos.setSelected(false);
        }
    }//GEN-LAST:event_chkTokyoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        ControladorMostrarHabitaciones cmh = new ControladorMostrarHabitaciones();
        cmh.listarHab(tblHab, hotel);
    }//GEN-LAST:event_btnListarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ListarHabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarHabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarHabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarHabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarHabitacionesDisponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkMarruecos;
    private javax.swing.JCheckBox chkNY;
    private javax.swing.JCheckBox chkRoma;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JCheckBox chkTokyo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTable tblHab;
    // End of variables declaration//GEN-END:variables
}
