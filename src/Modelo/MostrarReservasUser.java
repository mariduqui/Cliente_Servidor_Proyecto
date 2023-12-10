
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class MostrarReservasUser {

    public MostrarReservasUser() {
    }
    
    public void  mostrarReservasUser(JTable tabla){
        Persona p = new Persona();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Hotel");
        modelo.addColumn("ID Reserva");
        modelo.addColumn("Fecha Ingreso");
        modelo.addColumn("Fecha Salida");
        
        Conexion con = new Conexion();
        
        String queryNY = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasNY WHERE idusuario = ?";
        String queryRoma = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasRoma WHERE idusuario = ?";
        String queryMarruecos = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasMarruecos WHERE idusuario = ?";
        String queryTokyo = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasTokyo WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement statementNY = cn.prepareStatement(queryNY);
            statementNY.setInt(1, p.getId());
            ResultSet setNY = statementNY.executeQuery();
            
            while(setNY.next()){
                Object[] lista = {"NY", setNY.getInt(1), setNY.getDate(2), setNY.getDate(3)};
                modelo.addRow(lista);
            }
            statementNY.close();
            setNY.close();
            
            PreparedStatement statementRoma = cn.prepareStatement(queryRoma);
            statementRoma.setInt(1, p.getId());
            ResultSet setRoma = statementRoma.executeQuery();
            
            while(setRoma.next()){
                Object[] lista = {"Roma", setRoma.getInt(1), setRoma.getDate(2), setRoma.getDate(3)};
                modelo.addRow(lista);
            }
            statementRoma.close();
            setRoma.close();
            
            PreparedStatement statementMarruecos = cn.prepareStatement(queryMarruecos);
            statementMarruecos.setInt(1, p.getId());
            ResultSet setMarruecos = statementMarruecos.executeQuery();
            
            while(setMarruecos.next()){
                Object[] lista = {"Marruecos", setMarruecos.getInt(1), setMarruecos.getDate(2), setMarruecos.getDate(3)};
                modelo.addRow(lista);
            }
            statementMarruecos.close();
            setMarruecos.close();
            
            PreparedStatement statementTokyo = cn.prepareStatement(queryTokyo);
            statementTokyo.setInt(1, p.getId());
            ResultSet setTokyo = statementTokyo.executeQuery();
            
            while(setTokyo.next()){
                Object[] lista = {"Tokyo", setTokyo.getInt(1), setTokyo.getDate(2), setTokyo.getDate(3)};
                modelo.addRow(lista);
            }
            statementMarruecos.close();
            setMarruecos.close();

            cn.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            tabla.setModel(modelo); 
        }
    }
    
    private ArrayList<Integer> reservasNY(){
        Persona p = new Persona();
        ArrayList<Integer> idsReservas = new ArrayList();
        
        Conexion con = new Conexion();
        
        String query = "SELECT idreserva FROM reservasNY WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, p.getId());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
        }catch(SQLException e){
            System.out.println("Error al recuperar las reservas " + e);
        }
        
        return idsReservas; 
    }
    
    private ArrayList<Integer> reservasRoma(){
        Persona p = new Persona();
        ArrayList<Integer> idsReservas = new ArrayList();
        
        Conexion con = new Conexion();
        
        String query = "SELECT idreserva FROM reservasRoma WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, p.getId());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
        }catch(SQLException e){
            System.out.println("Error al recuperar las reservas " + e);
        }
        
        return idsReservas; 
    }
    
    private ArrayList<Integer> reservasMarruecos(){
        Persona p = new Persona();
        ArrayList<Integer> idsReservas = new ArrayList();
        
        Conexion con = new Conexion();
        
        String query = "SELECT idreserva FROM reservasMarruecos WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, p.getId());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
        }catch(SQLException e){
            System.out.println("Error al recuperar las reservas " + e);
        }
        
        return idsReservas; 
    }
    
    private ArrayList<Integer> reservasTokyo(){
        Persona p = new Persona();
        ArrayList<Integer> idsReservas = new ArrayList();
        
        Conexion con = new Conexion();
        
        String query = "SELECT idreserva FROM reservasTokyo WHERE idusuario = ?";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, p.getId());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idsReservas.add(rs.getInt(1));
            }
        }catch(SQLException e){
            System.out.println("Error al recuperar las reservas " + e);
        }
        
        return idsReservas; 
    }
    
    public void listarReservasCBO(JComboBox cbo, String hotel){
        ArrayList<Integer> idsReservas = new ArrayList();
        
        
        if(hotel.equals("NY")){
           for(int i : reservasNY()){
               idsReservas.add(i);
           } 
        }
        
        if(hotel.equals("Roma")){
           for(int i : reservasRoma()){
               idsReservas.add(i);
           } 
        }
        
        if(hotel.equals("Marruecos")){
           for(int i : reservasMarruecos()){
               idsReservas.add(i);
           } 
        }
        
        if(hotel.equals("Tokyo")){
           for(int i : reservasTokyo()){
               idsReservas.add(i);
           } 
        }
        
        DefaultComboBoxModel dcbom = new DefaultComboBoxModel(idsReservas.toArray());
        cbo.setModel(dcbom);
    }
}
