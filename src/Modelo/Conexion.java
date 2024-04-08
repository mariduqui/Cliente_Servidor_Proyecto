
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alede
 */
public class Conexion {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/hotel_clienteservidor", "alejandrodenver", "1234");
            System.out.println("Conecion exitosa");
        }catch(Exception e){
            System.out.println("Error de conexion" + e);
        }
        
        return cn;
    }
    
    
}
