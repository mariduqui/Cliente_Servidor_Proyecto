
package Vista;

import Controlador.ControladorCBO;
import Controlador.ControladorRegistro;
import Modelo.Reloj;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author alede
 */
public class RegistroClientesAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public RegistroClientesAdmin() {
        initComponents();
        this.setSize(650, 650);
        this.setLocationRelativeTo(null);
        
        ControladorCBO conCBO = new ControladorCBO();
        conCBO.llenarPaises(cboNacionalidad);
        conCBO.llenarCodigo(cboCodigo);
        
        Image iconoAg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/volver.jpg"));
        btnVolver.setIcon(new ImageIcon(iconoAg.getScaledInstance(btnVolver.getWidth(), btnVolver.getHeight(), Image.SCALE_SMOOTH)));
        
        Reloj r = new Reloj();
        r.reloj(lblReloj);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPass2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        lblApellido1 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        lblApellido2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTipoID = new javax.swing.JLabel();
        cboTipoID = new javax.swing.JComboBox<>();
        lblTelefono = new javax.swing.JLabel();
        cboCodigo = new javax.swing.JComboBox<>();
        lblCodigo = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        cboNacionalidad = new javax.swing.JComboBox<>();
        lblIdentificacion = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtPass1 = new javax.swing.JPasswordField();
        txtPass2 = new javax.swing.JPasswordField();
        lblReloj = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 153, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registrar Usuario ");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 350, 40));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, 30));

        lblUser.setText("Usuario:");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblPassword.setText("Contraseña:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblPass2.setText("Repetir Contraseña:");
        getContentPane().add(lblPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, 30));

        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));
        getContentPane().add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 240, 30));

        lblApellido1.setText("Primer Apellido:");
        getContentPane().add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        getContentPane().add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 240, 30));

        lblApellido2.setText("Segundo Apellido:");
        getContentPane().add(lblApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 240, 30));

        lblEmail.setText("Email:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 240, 30));

        lblTipoID.setText("Tipo de Identificación:");
        getContentPane().add(lblTipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        cboTipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula Nacional", "DIMEX", "Pasaporte" }));
        getContentPane().add(cboTipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 240, -1));

        lblTelefono.setText("Número Telefonico:");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        cboCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(cboCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 130, -1));

        lblCodigo.setText("Código de País");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        lblNacionalidad.setText("Nacionalidad:");
        getContentPane().add(lblNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        getContentPane().add(cboNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 240, -1));

        lblIdentificacion.setText("Identificación:");
        getContentPane().add(lblIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 240, 30));

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 160, 40));

        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 30));
        getContentPane().add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, 30));
        getContentPane().add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 30));
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        ControladorRegistro cr  = new ControladorRegistro();
        
        cr.verificarDatosPreRegistro(txtUser.getText(), txtPass1.getText(), txtPass2.getText(),txtNombre.getText() , txtApellido1.getText(), txtApellido2.getText(), cboTipoID.getSelectedItem().toString(), txtID.getText(), cboNacionalidad.getSelectedItem().toString(), cboCodigo.getSelectedItem().toString(), txtTelefono.getText(), txtEmail.getText());
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        
        ReservarAdmin ra = new ReservarAdmin();
        ra.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClientesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboCodigo;
    private javax.swing.JComboBox<String> cboNacionalidad;
    private javax.swing.JComboBox<String> cboTipoID;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoID;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
