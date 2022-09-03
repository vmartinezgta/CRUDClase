
package crudconsola;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Actualizar {
    public static void main(String[] args) {
        try {
            //1. Crear la conexion e importar driver
            Connection miConexion =  (Connection) 
            DriverManager.getConnection("jdbc:mysql://localhost/Colegio", "root", "");
            //2. Crear el statement
            Statement miStatement = miConexion.createStatement();
            String actualizar = "update alumno set nombre = 'Pablo Marmol' where codigo = 1";
            //3.Ejectuar el Statement
            miStatement.executeUpdate(actualizar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
