
package Controlador;

import Modelo.LogicaReserva;
import Modelo.Persona;
import com.toedter.calendar.JCalendar;
import java.util.Date;
import javax.swing.JOptionPane;

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
    
    public boolean reservaControlAuto(String hotel, Date fechaIng, Date fechaSal){
        boolean reservado = false;
        
        Date fechaActualDosMeses = new Date(System.currentTimeMillis());
        Date fechaActual = new Date(System.currentTimeMillis());
        
        fechaActualDosMeses.setMonth(fechaActualDosMeses.getMonth() + 02);

        if(fechaIng.after(fechaActualDosMeses)){
            JOptionPane.showMessageDialog(null, "Solo puede hacer reservas con menos de 2 meses.");
        }else if(fechaSal.before(fechaIng)){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de salida despues de su fecha de ingreso.");
        }else if(fechaIng.before(fechaActual) || fechaSal.before(fechaActual)){
            JOptionPane.showMessageDialog(null, "La fecha de ingreso o de salida debe ser despues de la fecha actual.");
        }
        else{
            Persona p = new Persona();
            LogicaReserva lr = new LogicaReserva();
            reservado = lr.reservarUsuario(hotel, manejarFecha(fechaIng), manejarFecha(fechaSal), p);
        }
        
        return reservado; 
    }
    
    public boolean reservaManual(String hotel, Date fechaIng, Date fechaSal, int numHab){
        boolean reservado = false;
        
        Date fechaActualDosMeses = new Date(System.currentTimeMillis());
        Date fechaActual = new Date(System.currentTimeMillis());
        
        fechaActualDosMeses.setMonth(fechaActualDosMeses.getMonth() + 02);

        if(fechaIng.after(fechaActualDosMeses)){
            JOptionPane.showMessageDialog(null, "Solo puede hacer reservas con menos de 2 meses.");
        }else if(fechaSal.before(fechaIng)){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de salida despues de su fecha de ingreso.");
        }else if(fechaIng.before(fechaActual) || fechaSal.before(fechaActual)){
            JOptionPane.showMessageDialog(null, "La fecha de ingreso o de salida debe ser despues de la fecha actual.");
        }
        else{
            Persona p = new Persona();
            LogicaReserva lr = new LogicaReserva();
            reservado = lr.reservaPorCoordenadas(hotel, manejarFecha(fechaIng), manejarFecha(fechaSal), p, numHab);
        }
        
        return reservado; 
    }
    
    
    
}
