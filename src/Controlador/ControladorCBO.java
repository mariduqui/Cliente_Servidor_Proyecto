
package Controlador;

import Modelo.NacionalidadCodigo;
import javax.swing.JComboBox;

/**
 *
 * @author alede
 */
public class ControladorCBO {

    public ControladorCBO() {
    }
    
    public void llenarPaises(JComboBox cbo){
        NacionalidadCodigo nc = new NacionalidadCodigo();
        
        nc.llenarNacionalidad(cbo);
    }
    
    public void llenarCodigo(JComboBox cbo){
        NacionalidadCodigo nc = new NacionalidadCodigo();
        
        nc.llenarCodigoTel(cbo);
    }
}
