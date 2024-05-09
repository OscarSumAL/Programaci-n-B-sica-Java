//package conexionoracle;
//
//import java.sql.*;
//
//public class ConexionOracle {
//
//    public static void main(String[] args) {
//       Connection connection = null;
//       Statement statement = null;
//       ResultSet resultSet = null;
//       
//        try {
//            connection = ConexionDB.getInstance().getConnection();
//            if (connection != null) {
//                System.out.println("Conexión Exitosa.......... :");
//                
//                //Crear una sentencia o una declaración
//                statement = connection.createStatement();
//                
//                String query = "SELECT * FROM PERSONA";
//                resultSet = statement.executeQuery(query);
//                
//                // Procesar los resultados
//                while(resultSet.next()){
//                    int idPersona = resultSet.getInt("ID_PERSONA");
//                    String nombre = resultSet.getString("NOMBRE");
//                    String paterno = resultSet.getString("PATERNO");
//                    String materno = resultSet.getString("MATERNO");
//                    String nacionalidad = resultSet.getString("NACIONALIDAD");
//                    
//                    System.out.println("ID: " + idPersona);
//                    System.out.println("NOMBRE: " + nombre);
//                    System.out.println("PATERNO: " + paterno);
//                    System.out.println("MATERNO: " + materno);
//                    System.out.println("NACIONALIDAD: " + nacionalidad);
//                    
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            
//      } 
//      finally {
//            try {
//                if (resultSet != null) {
//                    resultSet.close();
//                }
//                if (statement != null){
//                    statement.close();
//                }
//            }catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//    
//        }
//             
//    }
//    
//}
//
//
//
//



//package conexionoracle;
//
//import java.sql.*;
//
//public class ConexionOracle {
//
//    public static void main(String[] args) {
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            connection = ConexionDB.getInstance().getConnection();
//
//            if (connection != null) {
//                System.out.println("Conexión Exitosa.......... :");
//
//                // Crear una sentencia o una declaración
//                statement = connection.createStatement();
//
//                // Tabla PERSONA
//                String queryPersona = "SELECT * FROM PERSONA";
//                resultSet = statement.executeQuery(queryPersona);
//
//                System.out.println("\nTabla PERSONA");
//                System.out.println("+------------+----------------+----------------+----------------+----------------+----------+");
//                System.out.printf("| %-10s | %-14s | %-14s | %-14s | %-14s | %-6s   |%n", "ID", "NOMBRE", "PATERNO", "MATERNO", "NACIONALIDAD", "ESTADO");
//                System.out.println("+------------+----------------+----------------+----------------+----------------+----------+");
//
//                while (resultSet.next()) {
//                    int idPersona = resultSet.getInt("ID_PERSONA");
//                    String nombre = resultSet.getString("NOMBRE");
//                    String paterno = resultSet.getString("PATERNO");
//                    String materno = resultSet.getString("MATERNO");
//                    String nacionalidad = resultSet.getString("NACIONALIDAD");
//                    String estado = resultSet.getString("ESTADO");
//
//                    System.out.printf("| %-10d | %-14s | %-14s | %-14s | %-14s | %-6s |%n", idPersona, nombre, paterno, materno, nacionalidad, estado);
//                }
//
//                System.out.println("+------------+----------------+----------------+----------------+----------------+--------+");
//
//                // Tabla GENERO
//                String queryGenero = "SELECT ID_GENERO, NOMBRE, CODIGO, SIMBOLO, DESCRIPCION FROM GENERO";
//                resultSet = statement.executeQuery(queryGenero);
//
//                System.out.println("\nTabla GENERO");
//                System.out.println("+------------+----------------+----------------+----------------+---------------------+");
//                System.out.printf("| %-10s | %-14s | %-14s | %-14s | %-14s      |%n", "ID", "NOMBRE", "CODIGO", "SIMBOLO", "DESCRIPCION");
//                System.out.println("+------------+----------------+----------------+----------------+---------------------+");
//
//                while (resultSet.next()) {
//                    int idGenero = resultSet.getInt("ID_GENERO");
//                    String nombre = resultSet.getString("NOMBRE");
//                    String codigo = resultSet.getString("CODIGO");
//                    String simbolo = resultSet.getString("SIMBOLO");
//                    String descripcion = resultSet.getString("DESCRIPCION");
//
//                    System.out.printf("| %-10d | %-14s | %-14s | %-14s | %-14s   |%n", idGenero, nombre, codigo, simbolo, descripcion);
//
//                }
//
//                System.out.println("+------------+----------------+----------------+----------------+----------------+");
//
//                // Tabla TIPO_DOCUMENTO
//                String queryTipoDocumento = "SELECT ID_TIPO_DOCUMENTO, NOMBRE, ESTADO, SIGLA, CODIGO FROM TIPO_DOCUMENTO";
//                resultSet = statement.executeQuery(queryTipoDocumento);
//
//                System.out.println("\nTabla TIPO_DOCUMENTO");
//                System.out.println("+------------+----------------------------+----------------+----------------+----------------+");
//                System.out.printf("| %-10s | %-14s             | %-14s | %-14s | %-14s |%n", "ID", "NOMBRE", "ESTADO", "SIGLA", "CODIGO");
//                System.out.println("+------------+----------------------------+----------------+----------------+----------------+");
//
//                while (resultSet.next()) {
//                    int idTipoDocumento = resultSet.getInt("ID_TIPO_DOCUMENTO");
//                    String nombre = resultSet.getString("NOMBRE");
//                    String estado = resultSet.getString("ESTADO");
//                    String sigla = resultSet.getString("SIGLA");
//                    String codigo = resultSet.getString("CODIGO");
//
//                    System.out.printf("| %-10d  | %-14s            | %-14s | %-14s | %-14s |%n", idTipoDocumento, nombre, estado, sigla, codigo);
//                }
//
//                System.out.println("+------------+----------------+----------------+----------------+----------------+");
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (resultSet != null) {
//                    resultSet.close();
//                }
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//}




//package conexionoracle;
//
//import java.sql.*;
//import java.util.*;
//
//public class ConexionOracle {
//
//    public static void main(String[] args) {
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            connection = ConexionDB.getInstance().getConnection();
//
//            if (connection != null) {
//                System.out.println("Conexión Exitosa.......... :");
//
//                // Crear una sentencia o una declaración
//                statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//
//                // Tabla PERSONA
//                String queryPersona = "SELECT * FROM PERSONA";
//                resultSet = statement.executeQuery(queryPersona);
//                printTable(resultSet, Arrays.asList("ID_PERSONA", "NOMBRE", "PATERNO", "MATERNO", "NACIONALIDAD", "ESTADO"));
//
//                // Tabla GENERO
//                String queryGenero = "SELECT ID_GENERO, NOMBRE, CODIGO, SIMBOLO, DESCRIPCION FROM GENERO";
//                resultSet = statement.executeQuery(queryGenero);
//                printTable(resultSet, Arrays.asList("ID_GENERO", "NOMBRE", "CODIGO", "SIMBOLO", "DESCRIPCION"));
//
//                // Tabla TIPO_DOCUMENTO
//                String queryTipoDocumento = "SELECT ID_TIPO_DOCUMENTO, NOMBRE, ESTADO, SIGLA, CODIGO FROM TIPO_DOCUMENTO";
//                resultSet = statement.executeQuery(queryTipoDocumento);
//                printTable(resultSet, Arrays.asList("ID_TIPO_DOCUMENTO", "NOMBRE", "ESTADO", "SIGLA", "CODIGO"));
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (resultSet != null) {
//                    resultSet.close();
//                }
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    private static void printTable(ResultSet resultSet, List<String> columnNames) throws SQLException {
//        List<Integer> columnWidths = new ArrayList<>();
//        for (String columnName : columnNames) {
//            columnWidths.add(columnName.length());
//        }
//
//        // Determinar el ancho máximo de cada columna
//        resultSet.beforeFirst();
//        while (resultSet.next()) {
//            for (int i = 0; i < columnNames.size(); i++) {
//                String value = resultSet.getString(columnNames.get(i));
//                if (value != null) {
//                    columnWidths.set(i, Math.max(columnWidths.get(i), value.length()));
//                }
//            }
//        }
//        resultSet.beforeFirst(); // Restablecemos el cursor al inicio
//
//        // Imprimir línea superior
//        printLine(columnWidths);
//
//        // Imprimir encabezados de columna
//        List<String> headers = new ArrayList<>(columnNames);
//        printRow(columnWidths, headers);
//
//        // Imprimir línea de separación
//        printLine(columnWidths);
//
//        // Imprimir filas de datos
//        while (resultSet.next()) {
//            List<String> values = new ArrayList<>();
//            for (String columnName : columnNames) {
//                values.add(resultSet.getString(columnName));
//            }
//            printRow(columnWidths, values);
//        }
//
//        // Imprimir línea inferior
//        printLine(columnWidths);
//        System.out.println();
//    }
//
//    private static void printLine(List<Integer> columnWidths) {
//        StringBuilder line = new StringBuilder();
//        for (int width : columnWidths) {
//            line.append("+").append("-".repeat(width + 2));
//        }
//        line.append("+");
//        System.out.println(line);
//    }
//
//    private static void printRow(List<Integer> columnWidths, List<?> values) {
//        StringBuilder row = new StringBuilder();
//        for (int i = 0; i < values.size(); i++) {
//            row.append("| ").append(String.format("%-" + columnWidths.get(i) + "s ", values.get(i)));
//        }
//        row.append("|");
//        System.out.println(row);
//    }
//}


package conexionoracle;

import java.sql.*;
import java.util.*;

public class ConexionOracle {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = ConexionDB.getInstance().getConnection();

            if (connection != null) {
                System.out.println("Conexión Exitosa.......... :");

                // Crear una sentencia o una declaración
                statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

                // Consulta combinada con INNER JOIN
                String query = "SELECT p.ID_PERSONA, p.NOMBRE, p.PATERNO, p.MATERNO, p.NACIONALIDAD, p.ESTADO, "
                             + "g.NOMBRE AS GENERO_NOMBRE, g.CODIGO AS GENERO_CODIGO, g.SIMBOLO AS GENERO_SIMBOLO, g.DESCRIPCION AS GENERO_DESCRIPCION, "
                             + "t.NOMBRE AS TIPO_DOCUMENTO_NOMBRE, t.ESTADO AS TIPO_DOCUMENTO_ESTADO, t.SIGLA AS TIPO_DOCUMENTO_SIGLA, t.CODIGO AS TIPO_DOCUMENTO_CODIGO "
                             + "FROM PERSONA p "
                             + "INNER JOIN GENERO g ON p.ID_GENERO = g.ID_GENERO "
                             + "INNER JOIN TIPO_DOCUMENTO t ON p.ID_TIPO_DOCUMENTO = t.ID_TIPO_DOCUMENTO";

                // Ejecutar la consulta
                resultSet = statement.executeQuery(query);

                // Definir los nombres de las columnas para imprimir
                List<String> columnNames = Arrays.asList("ID_PERSONA", "NOMBRE", "PATERNO", "MATERNO", "NACIONALIDAD", "ESTADO",
                                                         "GENERO_NOMBRE", "GENERO_CODIGO", "GENERO_SIMBOLO", "GENERO_DESCRIPCION",
                                                         "TIPO_DOCUMENTO_NOMBRE", "TIPO_DOCUMENTO_ESTADO", "TIPO_DOCUMENTO_SIGLA", "TIPO_DOCUMENTO_CODIGO");

                // Imprimir los resultados
                printTable(resultSet, columnNames);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void printTable(ResultSet resultSet, List<String> columnNames) throws SQLException {
        List<Integer> columnWidths = new ArrayList<>();
        for (String columnName : columnNames) {
            columnWidths.add(columnName.length());
        }

        // Determinar el ancho máximo de cada columna
        resultSet.beforeFirst();
        while (resultSet.next()) {
            for (int i = 0; i < columnNames.size(); i++) {
                String value = resultSet.getString(columnNames.get(i));
                if (value != null) {
                    columnWidths.set(i, Math.max(columnWidths.get(i), value.length()));
                }
            }
        }
        resultSet.beforeFirst(); // Restablecemos el cursor al inicio

        // Imprimir línea superior
        printLine(columnWidths);

        // Imprimir encabezados de columna
        List<String> headers = new ArrayList<>(columnNames);
        printRow(columnWidths, headers);

        // Imprimir línea de separación
        printLine(columnWidths);

        // Imprimir filas de datos
        while (resultSet.next()) {
            List<String> values = new ArrayList<>();
            for (String columnName : columnNames) {
                values.add(resultSet.getString(columnName));
            }
            printRow(columnWidths, values);
        }

        // Imprimir línea inferior
        printLine(columnWidths);
        System.out.println();
    }

    private static void printLine(List<Integer> columnWidths) {
        StringBuilder line = new StringBuilder();
        for (int width : columnWidths) {
            line.append("+").append("-".repeat(width + 2));
        }
        line.append("+");
        System.out.println(line);
    }

    private static void printRow(List<Integer> columnWidths, List<?> values) {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            row.append("| ").append(String.format("%-" + columnWidths.get(i) + "s ", values.get(i)));
        }
        row.append("|");
        System.out.println(row);
    }
}
