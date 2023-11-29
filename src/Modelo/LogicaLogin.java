
package Modelo;

import java.sql.*;

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
            if(tipo.equalsIgnoreCase("Admin")){
                query = "SELECT * FROM admin WHERE username = ? AND contrasena = ?"; 
            }
            
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setString(1, user);
            statement.setString(2, pass);
            
            ResultSet set = statement.executeQuery();
            
            if(set.next() && tipo.equalsIgnoreCase("Usuario")){
                existe = true;
                int id = set.getInt(1);
                Persona p = new Persona(set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6), set.getString(7), set.getString(8), set.getString(9), set.getString(10));
                
                String limpiarActualmente = "DELETE FROM loggeado";
                PreparedStatement ps = cn.prepareStatement(limpiarActualmente);
                ps.executeUpdate();
                
                String actualmente = "INSERT INTO loggeado(id) VALUES(?)";
                PreparedStatement psa = cn.prepareStatement(actualmente);
                psa.setInt(1, id);
                psa.executeUpdate();
            }
            if(set.next() && tipo.equalsIgnoreCase("Admin")){
                existe = true;
                //Admin a = new Admin(set.getString(2), set.getString(4));
            }

            cn.close();
        }catch(SQLException e){
            System.out.println("Error al procesar la solicitud en la base de datos: " + e);
        }finally{
            return existe; 
        }
    }
    
    
}
