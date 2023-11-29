
package Controlador;

import Modelo.LogicaReserva;
import com.toedter.calendar.JCalendar;
import java.util.Date;

/**
 *
 * @author alede
 */
public class ControladorReserva {

    public ControladorReserva() {
    }
    
    public java.sql.Date manejarFecha(Date date){

        long d = date.getTime();
        
        java.sql.Date fecha = new java.sql.Date(d);
        
        return fecha;
    }
    
    public void reservaUsuario(String hotel, Date fechaIng, Date fechaSal){
        LogicaReserva lr = new LogicaReserva();
        lr.reservarUsuario(hotel, manejarFecha(fechaIng), manejarFecha(fechaSal));
    }
}
