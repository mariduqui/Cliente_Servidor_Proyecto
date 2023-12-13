
package Controlador;

import Modelo.EliminarReservasPorHotel;

/**
 *
 * @author alede
 */
public class ControladorEliminarReservasPorHotel {

    public ControladorEliminarReservasPorHotel() {
    }
    
    public void eliminarReservas(String hotel){
        EliminarReservasPorHotel erph = new EliminarReservasPorHotel();
        
        if(hotel.equalsIgnoreCase("Todos")){
            erph.eliminarTodasReservasClienteTodosHoteles();
        }else{
            erph.eliminarTodasReservasClienteUnHotel(hotel);
        }
    }
}
