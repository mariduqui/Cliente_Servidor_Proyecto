
package Modelo;

/**
 *
 * @author alede
 */
public class Admin {
    private static String tipo;
    private static String hotel;

    public Admin(String tipo, String hotel) {
        this.tipo = tipo;
        this.hotel = hotel;
    }

    public String getTipo() {
        return tipo;
    }

    public String getHotel() {
        return hotel;
    }
    
}
