
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class EliminarReservasPorHotel {

    public EliminarReservasPorHotel() {
    }
    

    private ArrayList<Integer> habitacionesEliminadasNY(){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasNY";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este hotel " + e);
        }finally{
            return idsReservas; 
        } 
    }
    
    private void eliminarTodasNY(){
        Conexion con = new Conexion();
        
        ModificarReserva mr = new ModificarReserva();
        
        mr.actualizarDisponibilidadHabitacionesNY(habitacionesEliminadasNY());
        
        String query = "DELETE FROM reservasNY";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas del hotel Continental de NY");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en el hotel Continental de NY");
            }   
        }catch(SQLException e){
            System.out.println("Error al eliminar las reservas de NY " + e);
        }
    }
    
    private ArrayList<Integer> habitacionesEliminadasRoma(){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasRoma";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este hotel " + e);
        }finally{
            return idsReservas; 
        } 
    }
    
    private void eliminarTodasRoma(){
        Conexion con = new Conexion();
        
        ModificarReserva mr = new ModificarReserva();
        
        mr.actualizarDisponibilidadHabitacionesRoma(habitacionesEliminadasRoma());
        
        String query = "DELETE FROM reservasRoma";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas del hotel Continental de Roma");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en el hotel Continental de Roma");
            }   
        }catch(SQLException e){
            System.out.println("Error al eliminar las reservas de Roma " + e);
        }
    }
    
    private ArrayList<Integer> habitacionesEliminadasMarruecos(){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasMarruecos";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este hotel " + e);
        }finally{
            return idsReservas; 
        } 
    }
    
    private void eliminarTodasMarruecos(){
        Conexion con = new Conexion();
        
        ModificarReserva mr = new ModificarReserva();
        
        mr.actualizarDisponibilidadHabitacionesMarruecos(habitacionesEliminadasMarruecos());
        
        String query = "DELETE FROM reservasMarruecos";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas del hotel Continental de Marruecos");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en el hotel Continental de Marruecos");
            }   
        }catch(SQLException e){
            System.out.println("Error al eliminar las reservas de Marruecos " + e);
        }
    }
    
    private ArrayList<Integer> habitacionesEliminadasTokyo(){
        Conexion con = new Conexion();
        
        ArrayList<Integer> idsReservas = new ArrayList();
        
        String query = "SELECT idHab FROM reservasTokyo";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
            
        }catch(SQLException e){
            System.out.println("Error al verificar las habiotaciones de este hotel " + e);
        }finally{
            return idsReservas; 
        } 
    }
    
    private void eliminarTodasTokyo(){
        Conexion con = new Conexion();
        
        ModificarReserva mr = new ModificarReserva();
        
        mr.actualizarDisponibilidadHabitacionesTokyo(habitacionesEliminadasTokyo());
        
        String query = "DELETE FROM reservasTokyo";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            if(ps.executeUpdate() >= 1){
                JOptionPane.showMessageDialog(null, "Todas las reservas eliminadas del hotel Continental de Tokyo");
            }else{
                JOptionPane.showMessageDialog(null, "No hay reservas para eliminar en el hotel Continental de Tokyo");
            }   
        }catch(SQLException e){
            System.out.println("Error al eliminar las reservas de Tokyo " + e);
        }
    }
    
    public void eliminarTodasReservasClienteUnHotel(String hotel){
        
        if(hotel.equals("NY")){
            eliminarTodasNY();
        }
        if(hotel.equals("Roma")){
            eliminarTodasRoma();
        }
        if(hotel.equals("Marruecos")){
            eliminarTodasMarruecos();
        }
        if(hotel.equals("Tokyo")){
            eliminarTodasTokyo();
        }
    }
    
    public void eliminarTodasReservasClienteTodosHoteles(){
        eliminarTodasNY();
        eliminarTodasRoma();
        eliminarTodasMarruecos();
        eliminarTodasTokyo();
    }
    
    
}
