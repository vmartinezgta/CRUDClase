package crudformulario;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection conectar = null;

    public Connection conexion() {
        try {
            conectar = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
