
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class LogicaReserva {

    public LogicaReserva() {
    }
    
    public void reservarUsuario(String hotel, java.sql.Date fechaIng, java.sql.Date fechaSal){
        Conexion con = new Conexion();
        Connection cn = con.conectar();

        String queryHotel = "";
        String queryUpdate = "";
        
        if(hotel.equals("NY")){
            queryHotel = "INSERT INTO reservasNY(idusuario, idHab, fechaIngreso, fechaSalida) "
                    + "SELECT ?, h.idHab, ?, ?  "
                    + "FROM habitacionesNY h "
                    + "WHERE h.disponible = true "
                    + "LIMIT 1";
            
            queryUpdate = "UPDATE habitacionesNY "
                        + "SET disponible = false "
                        + "WHERE idHab = (SELECT idHab FROM reservasNY ORDER BY idreserva DESC LIMIT 1)";
        } 
        else if(hotel.equals("Roma")){
            queryHotel = "INSERT INTO reservasRoma(idusuario, idHab, fechaIngreso, fechaSalida) "
                    + "SELECT ?, h.idHab, ?, ?  "
                    + "FROM habitacionesRoma h "
                    + "WHERE h.disponible = true "
                    + "LIMIT 1";
            
            queryUpdate = "UPDATE habitacionesRoma "
                        + "SET disponible = false "
                        + "WHERE idHab = (SELECT idHab FROM reservasRoma ORDER BY idreserva DESC LIMIT 1)";
        }
        else if(hotel.equals("Marruecos")){
            queryHotel = "INSERT INTO reservasMarruecos(idusuario, idHab, fechaIngreso, fechaSalida) "
                    + "SELECT ?, h.idHab, ?, ?  "
                    + "FROM habitacionesMarruecos h "
                    + "WHERE h.disponible = true "
                    + "LIMIT 1";
            
            queryUpdate = "UPDATE habitacionesMarruecos "
                        + "SET disponible = false "
                        + "WHERE idHab = (SELECT idHab FROM reservasMarruecos ORDER BY idreserva DESC LIMIT 1)";
        }
        else if(hotel.equals("Tokyo")){
            queryHotel = "INSERT INTO reservasTokyo(idusuario, idHab, fechaIngreso, fechaSalida) "
                    + "SELECT ?, h.idHab, ?, ?  "
                    + "FROM habitacionesTokyo h "
                    + "WHERE h.disponible = true "
                    + "LIMIT 1";
            
            queryUpdate = "UPDATE habitacionesTokyo "
                        + "SET disponible = false "
                        + "WHERE idHab = (SELECT idHab FROM reservasTokyo ORDER BY idreserva DESC LIMIT 1)";
        }
        

        try {
            Persona p = new Persona();
            PreparedStatement ps = cn.prepareStatement(queryHotel);
            ps.setInt(1, p.getId());
            ps.setDate(2, fechaIng);
            ps.setDate(3, fechaSal);
            ps.executeUpdate();
            
            PreparedStatement psu = cn.prepareStatement(queryUpdate);
            psu.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Reserva realizada de manera satisfactoria.");
        
            ps.close();
            psu.close();
            
            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }

    }
}