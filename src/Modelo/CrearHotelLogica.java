package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class CrearHotelLogica {

    public CrearHotelLogica() {
    }

    private String insertarHab(int torres, int pisos, int habs, String nombre) {
        StringBuilder sql = new StringBuilder("INSERT INTO habitaciones" + nombre + " (idHab, torre, piso, numero, disponible) VALUES ");

        for (int torre = 1; torre <= torres; torre++) {
            for (int piso = 1; piso <= pisos; piso++) {
                for (int hab = 1; hab <= habs; hab++) {
                    String idHab = "" + torre + piso + String.format("%02d", hab);

                    sql.append(String.format("\n('%s', %d, %d, %02d, true),", idHab, torre, piso, hab));
                }
            }
        }

        sql.deleteCharAt(sql.length() - 1);
        sql.append(";");

        String query = sql.toString();

        System.out.println(query);

        return query;
    }

    public void crearTablas(String nombre, int torres, int pisos, int habs) {
        Conexion con = new Conexion();

        String queryHabs = "CREATE TABLE habitaciones" + nombre
                        + "(idhab INT UNIQUE PRIMARY KEY NOT NULL,"
                        + " torre INT NOT NULL,"
                        + " piso INT NOT NULL,"
                        + " numero INT NOT NULL,"
                        + " disponible BOOLEAN NOT NULL)";

        String queryReservas = "CREATE TABLE reservas" + nombre
                            + "(idreserva int UNIQUE PRIMARY KEY NOT NULL AUTO_INCREMENT,"
                            + " idusuario int NOT NULL,"
                            + " idHab int NOT NULL,"
                            + " fechaIngreso date not null,"
                            + " fechaSalida date not null)";

        String queryInsert = insertarHab(torres, pisos, habs, nombre);

        try {
            Connection cn = con.conectar();

            PreparedStatement psh = cn.prepareStatement(queryHabs);
            psh.executeUpdate();

            PreparedStatement psr = cn.prepareStatement(queryReservas);
            psr.executeUpdate();

            PreparedStatement psi = cn.prepareStatement(queryInsert);
            psi.executeUpdate();

            JOptionPane.showMessageDialog(null, "Hotel creado de manera satisfactoria, consulte con el encargado de IT para agregarlo a la interfaz.");

        } catch (SQLException e) {
            System.out.println("Error al crear el hotel " + e);
        }
    }
}
