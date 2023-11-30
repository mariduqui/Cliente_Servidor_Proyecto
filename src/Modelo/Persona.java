
package Modelo;

/**
 *
 * @author alede
 */
public class Persona {
    private static int id; 

    
    private String user;
    private String password;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private String nacionalidad;
    private String telefono;
    private String correo;

    public Persona() {
    }

    public Persona(int id, String user, String password, String nombre, String apellido1, String apellido2, String cedula, String nacionalidad, String telefono, String correo) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.correo = correo;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
