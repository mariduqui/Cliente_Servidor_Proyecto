
package Controlador;

import Modelo.MostrarReservasUser;
import javax.swing.JTable;

/**
 *
 * @author alede
 */
public class ControladorMostrarReservas {

    public ControladorMostrarReservas() {
    }
    
    public void MostrarReservasUser(JTable tabla){
        MostrarReservasUser mru = new MostrarReservasUser();
        mru.mostrarReservasUser(tabla);
    }
}
