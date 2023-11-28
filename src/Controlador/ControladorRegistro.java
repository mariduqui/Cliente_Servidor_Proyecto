
package Controlador;

import Modelo.LogicaRegistro;
import Modelo.VerificarDatosRegistro;

/**
 *
 * @author alede
 */
public class ControladorRegistro {

    public ControladorRegistro() {
    }
    
    public void verificarDatosPreRegistro(String user, String pass1, String pass2,String nombre, String apellido1, String apellido2, String tipoID, String identificacion, String nacionalidad, String codigo, String telefono, String correo){
        VerificarDatosRegistro vdr = new VerificarDatosRegistro();
        
        if(vdr.verificarCedula(tipoID, identificacion) && vdr.verificarTelefono(telefono, codigo) && vdr.verificarEmail(correo) && vdr.verificarContraseña(pass1, pass2)){
            registrarUser(user, pass1, nombre, apellido1, apellido2, identificacion, nacionalidad, telefono, correo);
        }
    }
     
    private void registrarUser(String user, String pass, String nombre, String apellido1, String apellido2, String identificacion, String nacionalidad, String telefono, String correo){
        LogicaRegistro lr = new LogicaRegistro();
        
        lr.registrarUsuario(user, pass, nombre, apellido1, apellido2, identificacion, nacionalidad, telefono, correo);
    }
}
