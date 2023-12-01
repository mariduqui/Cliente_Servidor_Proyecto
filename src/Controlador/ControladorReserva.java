
package Controlador;

import Modelo.LogicaReserva;
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
    
    public void reservaUsuario(String hotel, Date fechaIng, Date fechaSal){
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
            LogicaReserva lr = new LogicaReserva();
            lr.reservarUsuario(hotel, manejarFecha(fechaIng), manejarFecha(fechaSal));
        } 
    }
}
