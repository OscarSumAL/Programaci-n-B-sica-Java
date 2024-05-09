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
            String dbUrl = "jdbc:oracle:thin:USUARIO_MATRICULA/1234@localhost:1521:xe";
            connection = DriverManager.getConnection(dbUrl);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error no se pudo conectar a la DB" + e.getMessage());
        }
    }
    

    public static ConexionDB getInstance(){
        if (instancia == null) {
            instancia = new ConexionDB();
        }
        return instancia;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
}
