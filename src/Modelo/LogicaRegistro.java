
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class LogicaRegistro {

    public LogicaRegistro() {
    }
    
    
    public void registrarUsuario(String user, String pass, String nombre, String apellido1, String apellido2, String identificacion, String nacionalidad, String telefono, String correo){
        
        Conexion con = new Conexion();
        Connection cn = con.conectar();

        String query = "INSERT INTO usuarios(username, contrasena, nombre, apellido1, apellido2, identificacion, nacionalidad, telefono, correo)"
                     + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, nombre);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.setString(6, identificacion);
            ps.setString(7, nacionalidad);
            ps.setString(8, telefono);
            ps.setString(9, correo);
            
            ps.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Datos Guardados Satisfactoriamente");
        
            ps.close();
            
            cn.close();
            
        }catch(SQLException e){
            
        }
    }
}
