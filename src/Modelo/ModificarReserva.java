
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class ModificarReserva {

    public ModificarReserva() {
    }
    
    public void modFechaUser(String hotel, int idRes,java.sql.Date fechaIng, java.sql.Date fechaSal){
        Conexion con = new Conexion();
        

        String query = "";
        
        if(hotel.equals("NY")){       
            query = "UPDATE reservasNY "
                        + "SET fechaIngreso = ?, fechaSalida  = ? "
                        + "WHERE idreserva = ?";
        } 
        
         try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setDate(1, fechaIng);
            ps.setDate(2, fechaSal);
            ps.setInt(3, idRes);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Reserva actualizada de manera satisfactoria.");
        
            ps.close();

            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }
    }
}
