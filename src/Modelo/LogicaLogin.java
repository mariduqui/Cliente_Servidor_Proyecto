
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class LogicaLogin {
    Conexion con = new Conexion();
    private Connection cn = con.conectar();
    
    public boolean login(String user, String pass, String tipo){
        boolean existe = false;
        String query = "";
        
        try{
            if(tipo.equalsIgnoreCase("Usuario")){
                query = "SELECT * FROM usuarios WHERE username = ? AND contrasena = ?"; 
            }
            else if(tipo.equalsIgnoreCase("Admin")){
                query = "SELECT * FROM admins WHERE username = ? AND contrasena = ?"; 
            }
            
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setString(1, user);
            statement.setString(2, pass);
            
            ResultSet set = statement.executeQuery();

            if(tipo.equalsIgnoreCase("Usuario") && set.next()){
                existe = true;
                int id = set.getInt(1);
                Persona p = new Persona(id, set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6), set.getString(7), set.getString(8), set.getString(9), set.getString(10)); 
                return existe;
            }
  
            if(tipo.equalsIgnoreCase("Admin") && set.next()){
                existe = true;
                Admin a = new Admin(set.getString(4), set.getString(5));
                return existe;
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña no encontrado");
            }

            cn.close();
        }catch(SQLException e){
            System.out.println("Error al procesar la solicitud en la base de datos: " + e);
        }finally{
            return existe; 
        }
    }
    
    
}
