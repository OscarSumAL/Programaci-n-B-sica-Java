package conexionoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    
    private  static ConexionDB instancia;
    private Connection connection;
    
    //Constructor de la clase ConexionDB
    private ConexionDB(){
        try {
            //Cargando el Driver de Oracle
            Class.forName("oracle.jdbc.OracleDriver");
            
            //Establecer las credenciales
            String dbUrl = "jdbc:oracle:thin:RED_SOCIAL/2654@localhost:1521:xe";
            connection
            
        } catch (Exception e) {
        }
    }
    
}
