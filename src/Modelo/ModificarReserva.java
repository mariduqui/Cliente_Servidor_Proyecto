
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
        else if(hotel.equals("Roma")){       
            query = "UPDATE reservasRoma "
                        + "SET fechaIngreso = ?, fechaSalida  = ? "
                        + "WHERE idreserva = ?";
        }
        else if(hotel.equals("Marruecos")){       
            query = "UPDATE reservasMarruecos "
                        + "SET fechaIngreso = ?, fechaSalida  = ? "
                        + "WHERE idreserva = ?";
        }
        else if(hotel.equals("Tokyo")){       
            query = "UPDATE reservasTokyo "
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
    
    public void eliminarReserva(String hotel, int idRes){
        Conexion con = new Conexion();
        

        String query = "";
        
        if(hotel.equals("NY")){       
            query = "DELETE FROM reservasNY "
                  + "WHERE idreserva = ?";
        }
        else if(hotel.equals("Roma")){       
            query = "DELETE FROM reservasRoma "
                  + "WHERE idreserva = ?";
        }
        else if(hotel.equals("Marruecos")){       
            query = "DELETE FROM reservasMarruecos "
                  + "WHERE idreserva = ?";
        }
        else if(hotel.equals("Tokyo")){       
            query = "DELETE FROM reservasTokyo "
                  + "WHERE idreserva = ?";
        }
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idRes);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Reserva eliminada de manera satisfactoria.");
        
            ps.close();

            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }   
    }
}
