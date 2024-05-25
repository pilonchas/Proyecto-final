package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author FERNANDO
 */
public class conexion {
//se realizara la conexion local 

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_pasteleria", "root", "Pilo816101");
            return cn;
        } catch (SQLException e) {
            System.out.println("error en la conexion" + e);
        }
        return null;
    }
}
