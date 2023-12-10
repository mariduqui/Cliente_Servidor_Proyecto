
package Controlador;

import Modelo.ModificarReserva;

/**
 *
 * @author alede
 */
public class ControladorEliminarReservaAdmin {
    private ModificarReserva mr = new ModificarReserva();
    
    public ControladorEliminarReservaAdmin() {
    }
    
    public void eliminarReservaPersona(String hotel, int idRes, String tipo){
        if(tipo.equals("Una")){
            mr.eliminarReserva(hotel, idRes);
        }if(tipo.equals("Todas un hotel")){
            mr.eliminarTodasReservasClienteUnHotel(hotel);
        }if(tipo.equals("Todas")){
            mr.eliminarTodasReservasClienteTodosHoteles();
        }
    }
}
