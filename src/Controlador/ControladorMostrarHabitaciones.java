
package Controlador;

import Modelo.ListarHabitaciones;
import javax.swing.JTable;

/**
 *
 * @author alede
 */
public class ControladorMostrarHabitaciones {

    public ControladorMostrarHabitaciones() {
    }
    
    
    public void listarHab(JTable tabla, String hotel){
        ListarHabitaciones lh = new ListarHabitaciones();
        
        if(hotel.equalsIgnoreCase("Todos")){
            lh.listarHabTodos(tabla);
        }else{
            lh.mostrarHabitacionesHotel(tabla, hotel);
        }
    }
}
