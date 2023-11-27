
package Controlador;

import Modelo.LogicaRegistro;

/**
 *
 * @author alede
 */
public class ControladorRegistro {

    public ControladorRegistro() {
    }
     
    public void registrarUser(String user, String pass, String nombre, String apellido1, String apellido2, String identificacion, String nacionalidad, String telefono, String correo){
        LogicaRegistro lr = new LogicaRegistro();
        
        lr.registrarUsuario(user, pass, nombre, apellido1, apellido2, identificacion, nacionalidad, telefono, correo);
    }
}
