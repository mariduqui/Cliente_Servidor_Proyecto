
package Modelo;

import java.sql.*;
import java.util.ArrayList;
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
        String queryUpdate = "";
        
        if(hotel.equals("NY")){       
            query = "DELETE FROM reservasNY "
                  + "WHERE idreserva = ?";
            
            queryUpdate = "UPDATE habitacionesNY "
                        + "SET disponible = true "
                        + "WHERE idHab = (SELECT idHab FROM reservasNY WHERE idreserva = ?)";
        }
        else if(hotel.equals("Roma")){       
            query = "DELETE FROM reservasRoma "
                  + "WHERE idreserva = ?";
            
            queryUpdate = "UPDATE habitacionesRoma "
                        + "SET disponible = true "
                        + "WHERE idHab = (SELECT idHab FROM reservasRoma WHERE idreserva = ?)";
        }
        else if(hotel.equals("Marruecos")){       
            query = "DELETE FROM reservasMarruecos "
                  + "WHERE idreserva = ?";
            
            queryUpdate = "UPDATE habitacionesMarruecos "
                        + "SET disponible = true "
                        + "WHERE idHab = (SELECT idHab FROM reservasMarruecos WHERE idreserva = ?)";
        }
        else if(hotel.equals("Tokyo")){       
            query = "DELETE FROM reservasTokyo "
                  + "WHERE idreserva = ?";
            
            queryUpdate = "UPDATE habitacionesTokyo "
                        + "SET disponible = true "
                        + "WHERE idHab = (SELECT idHab FROM reservasTokyo WHERE idreserva = ?)";
        }
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement psu = cn.prepareStatement(queryUpdate);
            psu.setInt(1, idRes);
            psu.executeUpdate();
             
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
    
    private ArrayList<Integer> habitacionesEliminadasNY(int idUsuario){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasNY WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este cliente " + e);
        }finally{
            return idsReservas; 
        }  
    }
    
    public void actualizarDisponibilidadHabitacionesNY(ArrayList<Integer> idsReservas){
        Conexion con = new Conexion();
        
        String query = "UPDATE habitacionesNY SET disponible = true WHERE idHab = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            
            for(int i : idsReservas){
                ps.setInt(1, i);
                ps.executeUpdate();
            }
            
            ps.close();
            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }
    }
    
    private void eliminarTodasReservasClienteNY(int idUsuario){
        Conexion con = new Conexion();
        

        String query = "DELETE FROM reservasNY WHERE idusuario = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas de manera satisfactoria en NY.");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en NY.");
            }
            
            ps.close();

            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }
    }
    
    private ArrayList<Integer> habitacionesEliminadasRoma(int idUsuario){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasRoma WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este cliente " + e);
        }finally{
            return idsReservas; 
        }  
    }
    
    public void actualizarDisponibilidadHabitacionesRoma(ArrayList<Integer> idsReservas){
        Conexion con = new Conexion();
        
        String query = "UPDATE habitacionesRoma SET disponible = true WHERE idHab = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            
            for(int i : idsReservas){
                ps.setInt(1, i);
                ps.executeUpdate();
            }
            
            ps.close();
            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al cambiar el estado de las habitaciones  " + ex);
        }
    }
    
    private void eliminarTodasReservasClienteRoma(int idUsuario){
        Conexion con = new Conexion();
        

        String query = "DELETE FROM reservasRoma WHERE idusuario = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas de manera satisfactoria en Roma.");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en Roma.");
            }
            
            ps.close();

            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }
    }
    
    private ArrayList<Integer> habitacionesEliminadasMarruecos(int idUsuario){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasMarruecos WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este cliente " + e);
        }finally{
            return idsReservas; 
        }  
    }
    
    public void actualizarDisponibilidadHabitacionesMarruecos(ArrayList<Integer> idsReservas){
        Conexion con = new Conexion();
        
        String query = "UPDATE habitacionesMarruecos SET disponible = true WHERE idHab = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            
            for(int i : idsReservas){
                ps.setInt(1, i);
                ps.executeUpdate();
            }
            
            ps.close();
            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al cambiar el estado de las habitaciones  " + ex);
        }
    }
    
    private void eliminarTodasReservasClienteMarruecos(int idUsuario){
        Conexion con = new Conexion();
        

        String query = "DELETE FROM reservasMarruecos WHERE idusuario = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas de manera satisfactoria en Marruecos.");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en Marruecos.");
            }
            
            ps.close();

            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }
    }
    
        private ArrayList<Integer> habitacionesEliminadasTokyo(int idUsuario){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasTokyo WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este cliente " + e);
        }finally{
            return idsReservas; 
        }  
    }
    
    public void actualizarDisponibilidadHabitacionesTokyo(ArrayList<Integer> idsReservas){
        Conexion con = new Conexion();
        
        String query = "UPDATE habitacionesTokyo SET disponible = true WHERE idHab = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            
            for(int i : idsReservas){
                ps.setInt(1, i);
                ps.executeUpdate();
            }
            
            ps.close();
            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al cambiar el estado de las habitaciones  " + ex);
        }
    }
    
    private void eliminarTodasReservasClienteTokyo(int idUsuario){
        Conexion con = new Conexion();
        

        String query = "DELETE FROM reservasTokyo WHERE idusuario = ?";
        
        try {
             Connection cn = con.conectar();
             
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idUsuario);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas de manera satisfactoria en Tokyo.");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en Tokyo.");
            }

            ps.close();

            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al reservar " + ex);
        }
    }
    
    public void eliminarTodasReservasClienteUnHotel(String hotel){
        Persona p = new Persona();
        
        if(hotel.equals("NY")){
            ArrayList<Integer> idsHabNY = habitacionesEliminadasNY(p.getId());
            if(idsHabNY.size() > 0){
                actualizarDisponibilidadHabitacionesNY(idsHabNY);
            }
            eliminarTodasReservasClienteNY(p.getId());
        }
        if(hotel.equals("Roma")){
            ArrayList<Integer> idsHabRoma = habitacionesEliminadasRoma(p.getId());
            if(idsHabRoma.size() > 0){
                actualizarDisponibilidadHabitacionesRoma(idsHabRoma);
            }
            eliminarTodasReservasClienteRoma(p.getId());
        }
        if(hotel.equals("Marruecos")){
            ArrayList<Integer> idsHabMarruecos = habitacionesEliminadasMarruecos(p.getId());
            if(idsHabMarruecos.size() > 0){
                actualizarDisponibilidadHabitacionesRoma(idsHabMarruecos);
            }
            
            eliminarTodasReservasClienteMarruecos(p.getId());
        }
        if(hotel.equals("Tokyo")){
            ArrayList<Integer> idsHabTokyo = habitacionesEliminadasTokyo(p.getId());
            if(idsHabTokyo.size() > 0){
                actualizarDisponibilidadHabitacionesRoma(idsHabTokyo);
            }
            
            eliminarTodasReservasClienteTokyo(p.getId());
        }
    }
    
    public void eliminarTodasReservasClienteTodosHoteles(){
        Persona p = new Persona();
        
        ArrayList<Integer> idsHabNY = habitacionesEliminadasNY(p.getId());
        if(idsHabNY.size() > 0){
            actualizarDisponibilidadHabitacionesNY(idsHabNY);
        }
        eliminarTodasReservasClienteNY(p.getId());
        
        ArrayList<Integer> idsHabRoma = habitacionesEliminadasRoma(p.getId());
        if(idsHabRoma.size() > 0){
            actualizarDisponibilidadHabitacionesRoma(idsHabRoma);
        }
        eliminarTodasReservasClienteRoma(p.getId());
        
        ArrayList<Integer> idsHabMarruecos = habitacionesEliminadasMarruecos(p.getId());
        if(idsHabMarruecos.size() > 0){
            actualizarDisponibilidadHabitacionesMarruecos(idsHabMarruecos);
        }
        eliminarTodasReservasClienteMarruecos(p.getId());
        
        ArrayList<Integer> idsHabTokyo = habitacionesEliminadasTokyo(p.getId());
        if(idsHabTokyo.size() > 0){
            actualizarDisponibilidadHabitacionesTokyo(idsHabTokyo);
        }
        eliminarTodasReservasClienteTokyo(p.getId());
        
    }
} 
