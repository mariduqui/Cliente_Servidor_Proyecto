
package Controlador;

import Modelo.LogicaLogin;

/**
 *
 * @author alede
 */
public class ControladorLogin {

    public ControladorLogin() {
    }
    
    public boolean login(String user, String pass, String tipo){
        LogicaLogin ll = new LogicaLogin();
        
        return ll.login(user, pass, tipo);
    }
}
