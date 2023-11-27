
package Modelo;

/**
 *
 * @author alede
 */
public class Admin {
    private String user;
    private String tipo;

    public Admin() {
    }

    public Admin(String user, String tipo) {
        this.user = user;
        this.tipo = tipo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      
}
