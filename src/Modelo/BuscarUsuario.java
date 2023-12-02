
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class BuscarUsuario {

    public BuscarUsuario() {
    }
    
    public void buscarUsuarioID(JTable tabla, String identificacion){
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
        
        String query = "SELECT * FROM usuarios WHERE identificacion = ?";
        
        Conexion con = new Conexion();
        
        try {
            Connection cn = con.conectar();
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, identificacion);

            ResultSet set = ps.executeQuery();
            
            if(set.next()){
                Object[] lista = {set.getInt(1), set.getString(2), set.getString(4), set.getString(5), set.getString(6), set.getString(7), set.getString(8), set.getString(9), set.getString(10)};
                modelo.addRow(lista);
                tabla.setModel(modelo);
                Persona p = new Persona(set.getInt(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6), set.getString(7), set.getString(8), set.getString(9), set.getString(10));
            }else{
                JOptionPane.showMessageDialog(null, "El usuario no está registrado. Para poder reservar debe registrarlo primero.");
            }
            
            ps.close();
            
            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al mostrar el usuario " + ex);
        }
    }
}
