
package Modelo;

import java.sql.*;
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
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Hotel");
        modelo.addColumn("ID Reserva");
        modelo.addColumn("Fecha Ingreso");
        modelo.addColumn("Fecha Salida");
        
        Conexion con = new Conexion();
        
        String queryNY = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasNY WHERE idusuario = (SELECT id FROM loggeado)";
        String queryRoma = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasRoma WHERE idusuario = (SELECT id FROM loggeado)";
        String queryMarruecos = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasMarruecos WHERE idusuario = (SELECT id FROM loggeado)";
        String queryTokyo = "SELECT idreserva, fechaIngreso, fechaSalida FROM reservasTokyo WHERE idusuario = (SELECT id FROM loggeado)";
        
        try{
            Connection cn = con.conectar();
            
            PreparedStatement statementNY = cn.prepareStatement(queryNY);
            ResultSet setNY = statementNY.executeQuery();
            
            while(setNY.next()){
                Object[] lista = {"NY", setNY.getInt(1), setNY.getDate(2), setNY.getDate(3)};
                modelo.addRow(lista);
            }
            statementNY.close();
            setNY.close();
            
            PreparedStatement statementRoma = cn.prepareStatement(queryRoma);
            ResultSet setRoma = statementRoma.executeQuery();
            
            while(setRoma.next()){
                Object[] lista = {"Roma", setRoma.getInt(1), setRoma.getDate(2), setRoma.getDate(3)};
                modelo.addRow(lista);
            }
            statementRoma.close();
            setRoma.close();
            
            PreparedStatement statementMarruecos = cn.prepareStatement(queryMarruecos);
            ResultSet setMarruecos = statementMarruecos.executeQuery();
            
            while(setMarruecos.next()){
                Object[] lista = {"Marruecos", setMarruecos.getInt(1), setMarruecos.getDate(2), setMarruecos.getDate(3)};
                modelo.addRow(lista);
            }
            statementMarruecos.close();
            setMarruecos.close();
            
            PreparedStatement statementTokyo = cn.prepareStatement(queryTokyo);
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
}
