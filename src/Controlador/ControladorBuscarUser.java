
package Controlador;

import Modelo.BuscarUsuario;
import javax.swing.JTable;

/**
 *
 * @author alede
 */
public class ControladorBuscarUser {

    public ControladorBuscarUser() {
    }
    
    public void buscarUser(JTable tabla, String identificacion){
        BuscarUsuario bu = new BuscarUsuario();
        bu.buscarUsuarioID(tabla, identificacion);
    }
}
