
package crudconsola;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Eliminar {
    
    public static void main(String[] args) {
        try {
            //1. Crear la conexion e importar driver
            Connection miConexion =  (Connection) 
            DriverManager.getConnection("jdbc:mysql://localhost/Colegio", "root", "");
            System.out.println("Conexion exitosa !!!");
            //2. Crear el statement
            Statement miStatement = miConexion.createStatement();
            String eliminar = "delete from alumno where codigo = 2";
            //3.Ejectuar el Statement
            miStatement.executeUpdate(eliminar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
}
