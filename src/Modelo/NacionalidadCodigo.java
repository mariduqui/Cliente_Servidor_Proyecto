
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
/**
 *
 * @author alede
 */
public class NacionalidadCodigo {
    private Conexion con = new Conexion();

    public NacionalidadCodigo() {
    }
    
    public void llenarNacionalidad(JComboBox cbo){
        Connection cn = con.conectar();
        ArrayList<String> paises = new ArrayList();

        
        try{
        String query = "SELECT nicename FROM country";
        
        PreparedStatement ps = cn.prepareStatement(query);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            paises.add(rs.getString(1));
        }
        
        DefaultComboBoxModel comboPaises = new DefaultComboBoxModel(paises.toArray());
        cbo.setModel(comboPaises);
        
        }catch(SQLException e){
            System.out.println("Error al realizar la consulta " + e);
        }  
    }
    
    public void llenarCodigoTel(JComboBox cbo){
        Connection cn = con.conectar();
        ArrayList<String> codigo = new ArrayList();
        
        try{
        String query = "SELECT DISTINCT phonecode FROM country ORDER BY phonecode ASC";
        
        PreparedStatement ps = cn.prepareStatement(query);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            codigo.add("+" + rs.getString(1));
        }
        
        DefaultComboBoxModel comboPaises = new DefaultComboBoxModel(codigo.toArray());
        cbo.setModel(comboPaises);
        
        }catch(SQLException e){
            System.out.println("Error al realizar la consulta " + e);
        }
    }
    
}
