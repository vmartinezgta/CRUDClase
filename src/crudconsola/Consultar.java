
package crudconsola;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consultar {
    
    public static void main(String[] args) {
        try {
            //1. Crear la conexion e importar driver
            Connection miConexion =  (Connection) 
            DriverManager.getConnection("jdbc:mysql://localhost/Colegio", "root", "");
            
            //2. Crear el statement
            Statement miStatement = miConexion.createStatement();
            String consultar = "select * from alumno";
            //3.ResultSet
            ResultSet miResultSet = miStatement.executeQuery(consultar);
            while (miResultSet.next()) {
                System.out.println(miResultSet.getString("codigo") + " " +
                                   miResultSet.getString("nombre") + " " +
                                   miResultSet.getString("direccion") + " " +
                                   miResultSet.getString("telefono"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
}
