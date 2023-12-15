
package Modelo;

import javax.swing.JTable;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class BuscarHabitacion {

    public BuscarHabitacion() {
    }
    
    public void buscarHabitacion(String hotel, int idHab, JTable tabla){
        String query = "";
        Conexion con = new Conexion();
        
        if(hotel.equals("NY")){
            query = "SELECT * FROM habitacionesNY WHERE idHab = ?";
        }else if(hotel.equals("Roma")){
            query = "SELECT * FROM habitacionesRoma WHERE idHab = ?";
        }else if(hotel.equals("Marruecos")){
            query = "SELECT * FROM habitacionesMarruecos WHERE idHab = ?";
        }else if(hotel.equals("Tokyo")){
            query = "SELECT * FROM habitacionesTokyo WHERE idHab = ?";
        }
        
        DefaultTableModel modeloH = new DefaultTableModel();
        modeloH.addColumn("Hotel");
        modeloH.addColumn("ID Habitación");
        modeloH.addColumn("Torre");
        modeloH.addColumn("Piso");
        modeloH.addColumn("Num. Hab");
        modeloH.addColumn("Disponible");
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idHab);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 Object[] lista = {hotel, rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getBoolean(5)};
                 modeloH.addRow(lista);
            }
        }catch(SQLException e){
            System.out.println("Error al buscar la habitación " + e);
        }finally{
            tabla.setModel(modeloH);
        }
    }
    
    public void buscarReservaHab(String hotel, int idHab, JTable tabla){
        String query = "";
        Conexion con = new Conexion();
        
        if(hotel.equals("NY")){
            query = "SELECT * FROM reservasNY WHERE idHab = ?";
        }else if(hotel.equals("Roma")){
            query = "SELECT * FROM reservasRoma WHERE idHab = ?";
        }else if(hotel.equals("Marruecos")){
            query = "SELECT * FROM reservasMarruecos WHERE idHab = ?";
        }else if(hotel.equals("Tokyo")){
            query = "SELECT * FROM reservasTokyo WHERE idHab = ?";
        }
        
        DefaultTableModel modeloR = new DefaultTableModel();
        modeloR.addColumn("Hotel");
        modeloR.addColumn("ID Reserva");
        modeloR.addColumn("ID Usuario");
        modeloR.addColumn("ID Habitación");
        modeloR.addColumn("Fecha Ingreso");
        modeloR.addColumn("Fecha Salida");
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idHab);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 Object[] lista = {hotel, rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4), rs.getDate(5)};
                 modeloR.addRow(lista);
            }
        }catch(SQLException e){
            System.out.println("Error al buscar la reservación " + e);
        }finally{
            tabla.setModel(modeloR);
        }
    }
    
    public void buscarUser(String hotel, int idHab, JTable tabla){
        String query = "";
        Conexion con = new Conexion();
        
        if(hotel.equals("NY")){
            query = "SELECT * FROM usuarios WHERE id = (SELECT idusuario FROM reservasNY WHERE idHab = ?)";
        }else if(hotel.equals("Roma")){
            query = "SELECT * FROM usuarios WHERE id = (SELECT idusuario FROM reservasRoma WHERE idHab = ?)";
        }else if(hotel.equals("Marruecos")){
            query = "SELECT * FROM usuarios WHERE id = (SELECT idusuario FROM reservasMarruecos WHERE idHab = ?)";
        }else if(hotel.equals("Tokyo")){
            query = "SELECT * FROM usuarios WHERE id = (SELECT idusuario FROM reservasTokyo WHERE idHab = ?)";
        }
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido 1");
        modelo.addColumn("Apellido 2");
        modelo.addColumn("Identificación");
        modelo.addColumn("Nacionalidad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, idHab);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 Object[] lista = {rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)};
                 modelo.addRow(lista);
            }
        }catch(SQLException e){
            System.out.println("Error al buscar la persona " + e);
        }finally{
            tabla.setModel(modelo);
        }
    }
}
