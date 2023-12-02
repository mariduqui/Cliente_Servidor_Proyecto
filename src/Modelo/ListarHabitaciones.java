
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alede
 */
public class ListarHabitaciones {

    public ListarHabitaciones() {
    }
    
    public void listarHabTodos(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Hotel");
        modelo.addColumn("ID Habitación");
        modelo.addColumn("Torre");
        modelo.addColumn("Piso");
        modelo.addColumn("Numero");
        modelo.addColumn("Disponible");
        
        Conexion con = new Conexion();
        
        String queryNY = "SELECT * FROM habitacionesNY";
        String queryRoma = "SELECT * FROM habitacionesRoma";
        String queryMarruecos = "SELECT * FROM habitacionesMarruecos";
        String queryTokyo = "SELECT * FROM habitacionesTokyo";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement statementNY = cn.prepareStatement(queryNY);
            
            ResultSet setNY = statementNY.executeQuery();
            
            while(setNY.next()){
                Object[] lista = {"NY", setNY.getInt(1), setNY.getInt(2), setNY.getInt(3), setNY.getInt(4), setNY.getBoolean(5)};
                modelo.addRow(lista);
            }
            statementNY.close();
            setNY.close();
            
            PreparedStatement statementRoma = cn.prepareStatement(queryRoma);
            ResultSet setRoma = statementRoma.executeQuery();
            
            while(setRoma.next()){
                Object[] lista = {"Roma", setRoma.getInt(1), setRoma.getInt(2), setRoma.getInt(3), setRoma.getInt(4), setRoma.getBoolean(5)};
                modelo.addRow(lista);
            }
            statementRoma.close();
            setRoma.close();
            
            PreparedStatement statementMarruecos = cn.prepareStatement(queryMarruecos);
            ResultSet setMarruecos = statementMarruecos.executeQuery();
            
            while(setMarruecos.next()){
                Object[] lista = {"Marruecos", setMarruecos.getInt(1), setMarruecos.getInt(2), setMarruecos.getInt(3), setMarruecos.getInt(4), setMarruecos.getBoolean(5)};
                modelo.addRow(lista);
            }
            statementMarruecos.close();
            setMarruecos.close();
            
            PreparedStatement statementTokyo = cn.prepareStatement(queryTokyo);
            ResultSet setTokyo = statementTokyo.executeQuery();
            
            while(setTokyo.next()){
                Object[] lista = {"Tokyo", setTokyo.getInt(1), setTokyo.getInt(2), setTokyo.getInt(3), setTokyo.getInt(4), setTokyo.getBoolean(5)};
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
    
    public void mostrarHabitacionesHotel(JTable tabla, String hotel){
        Conexion con = new Conexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Hotel");
        modelo.addColumn("ID Habitación");
        modelo.addColumn("Torre");
        modelo.addColumn("Piso");
        modelo.addColumn("Numero");
        modelo.addColumn("Disponible");
        

        String queryHotel = "";
        
        if(hotel.equals("NY")){
            queryHotel = "SELECT * FROM habitacionesNY";
        } 
        else if(hotel.equals("Roma")){
            queryHotel = "SELECT * FROM habitacionesRoma";
        }
        else if(hotel.equals("Marruecos")){
            queryHotel = "SELECT * FROM habitacionesMarruecos";
        }
        else if(hotel.equals("Tokyo")){
            queryHotel = "SELECT * FROM habitacionesTokyo";
        }
        

        try {
            Connection cn = con.conectar();
            PreparedStatement ps = cn.prepareStatement(queryHotel);

            ResultSet set = ps.executeQuery();
            
            while(set.next()){
                Object[] lista = {hotel, set.getInt(1), set.getInt(2), set.getInt(3), set.getInt(4), set.getBoolean(5)};
                modelo.addRow(lista);
            }
            
            tabla.setModel(modelo);
        
            ps.close();
            
            cn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al mostrar reservas " + ex);
        }
    }
}
