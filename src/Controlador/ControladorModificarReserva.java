
package Controlador;

import Modelo.ModificarReserva;
import java.util.Date;

/**
 *
 * @author alede
 */
public class ControladorModificarReserva {

    public ControladorModificarReserva() {
    }
    
    public void modFechaUser(String hotel, int idRes, Date fechaIng, Date fechaSal){
        ControladorReserva cr = new ControladorReserva();
        ModificarReserva mr = new  ModificarReserva();
        
        mr.modFechaUser(hotel, idRes, cr.manejarFecha(fechaIng), cr.manejarFecha(fechaSal));
    }
    
    public void elimarReservaUser(String hotel, int idRes){
        ModificarReserva mr = new  ModificarReserva();
        
        mr.eliminarReserva(hotel, idRes);
    }
    
}
