
package Controlador;

import Modelo.ModificarReserva;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class ControladorModificarReserva {

    public ControladorModificarReserva() {
    }
    
    public void modFechaUser(String hotel, int idRes, Date fechaIng, Date fechaSal){
        Date fechaActualDosMeses = new Date(System.currentTimeMillis());
        Date fechaActual = new Date(System.currentTimeMillis());
        
        fechaActualDosMeses.setMonth(fechaActualDosMeses.getMonth() + 02);

        if(fechaIng.after(fechaActualDosMeses)){
            JOptionPane.showMessageDialog(null, "Solo puede hacer reservas con menos de 2 meses.");
        }else if(fechaSal.before(fechaIng)){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de salida despues de su fecha de ingreso.");
        }else if(fechaIng.before(fechaActual) || fechaSal.before(fechaActual)){
            JOptionPane.showMessageDialog(null, "La fecha de ingreso o de salida debe ser despues de la fecha actual.");
        }else{
            ControladorReserva cr = new ControladorReserva();
            ModificarReserva mr = new  ModificarReserva();

            mr.modFechaUser(hotel, idRes, cr.manejarFecha(fechaIng), cr.manejarFecha(fechaSal));            
        }
    }
    
    public void elimarReservaUser(String hotel, int idRes){
        ModificarReserva mr = new  ModificarReserva();
        
        mr.eliminarReserva(hotel, idRes);
    }  
}
