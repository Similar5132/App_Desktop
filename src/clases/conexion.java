
package clases;
import java.sql.*;

public class conexion {

    //Conexion Local 
    public static Connection conectar (){ //"static" indica que el método "conectar" es un método de clase, es decir, no requiere una instancia de la clase para ser invocado. // La palabra clave "Connection" antes del nombre del método indica el tipo de valor que devuelve el método. En este caso, devuelve un objeto de tipo "Connection", que es una interfaz de JDBC
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds","root","");
            
            return cn;
        } catch (SQLException e) {
        
            System.out.println("Error en conexion Local." + e);
        }
        return null;
    
    }
    
    
   
    
}
