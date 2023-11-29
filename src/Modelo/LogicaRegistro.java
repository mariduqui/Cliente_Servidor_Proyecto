
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
        

        String query = "INSERT INTO usuarios(username, contrasena, nombre, apellido1, apellido2, identificacion, nacionalidad, telefono, correo)"
                     + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            Connection cn = con.conectar();
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
            System.out.println("Error  al  insertar los datos " + e); 
            if(e.toString().contains("Duplicate entry") && e.toString().contains("key 'username'")){
                JOptionPane.showMessageDialog(null, "El usuario ya existe, cree un usuario nuevo  o incie sesión");
            }
            if(e.toString().contains("Duplicate entry") && e.toString().contains("key 'correo'")){
                JOptionPane.showMessageDialog(null, "El correo ya está en  uso conn otro usuario. Inicie sesión o use otro correo.");
            }
            if(e.toString().contains("Data truncation: Data too long for column 'contrasena'")){
                JOptionPane.showMessageDialog(null, "La contraseña debe de tener menos de 25 caracteres");
            }
        }
    }
}
