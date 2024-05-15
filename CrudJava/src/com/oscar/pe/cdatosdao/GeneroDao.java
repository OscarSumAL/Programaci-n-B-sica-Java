package com.oscar.pe.cdatosdao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import com.oscar.pe.cmodelo.Genero;
import javax.swing.JTable;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GeneroDao {
    private String mensaje = "";
   
    public String AgregarGenero(Connection connection, Genero genero){
        PreparedStatement ps = null;
        String query = "INSERT INTO RED_SOCIAL.GENERO (NOMBRE,CODIGO, SIMBOLO, DESCRIPCION, USUARIO_CREACION, USUARIO_ACTUALIZACION) "+
               "VALUES (?, ?, ?, ?, ?, ?)";

        
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, genero.getNombre());
            ps.setString(2, genero.getCodigo());
            ps.setString(3, genero.getSimbolo());
            ps.setString(4, genero.getDescripcion());
            ps.setString(5, genero.getUsuario_creacion());
            ps.setString(6, genero.getUsuario_actualizacion());
            mensaje = "Se insertó correctamente";
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            mensaje = "No se insertó correctamente" + e.getMessage();
        }
        return mensaje;
    }
    
    public String ModificarGenero(Connection connection, Genero genero){
        PreparedStatement ps = null;
        String query = "UPDATE RED_SOCIAL.GENERO " +
                        "SET NOMBRE = ?, CODIGO = ?, SIMBOLO = ?, DESCRIPCION = ?, " +
                        "USUARIO_CREACION = ?, USUARIO_ACTUALIZACION = ? " +
                        "WHERE ID_GENERO = ?";

        
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, genero.getNombre());
            ps.setString(2, genero.getSimbolo());
            ps.setString(3, genero.getCodigo());
            ps.setString(4, genero.getDescripcion());
            ps.setString(5, genero.getUsuario_creacion());
            ps.setString(6, genero.getUsuario_actualizacion());
            ps.setInt(7, genero.getIdGenero());
            
            mensaje = "Se modificó correctamente";
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            mensaje = "No se modificó correctamente" + e.getMessage();
        }
        return mensaje;
        
        
    }
    
    public String EliminarGenero(Connection connection, int id){
        
        PreparedStatement ps = null;
        String query = "DELETE FROM RED_SOCIAL.GENERO WHERE ID_GENERO = ?";

        
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            mensaje = "Se eliminó correctamente";
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            mensaje = "No se eliminó correctamente" + e.getMessage();
        }
        
        return mensaje;
    }
    
    public void ListarGenero(Connection connection, JTable jTable ){
        Statement statement = null;
        ResultSet resultSet = null;
        DefaultTableModel model;
                
        String[] columnas = {"NOMBRE","CODIGO", "SIMBOLO", "DESCRIPCION", "USUARIO_CREACION", "USUARIO_ACTUALIZACION"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM GENERO ORDER BY ID_GENERO DESC";
        
        String[] filas = new String[8];
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                for(int i=0; i<8; i++){
                    filas[i] = resultSet.getString(i + 1);
                    
                }
                model.addRow(filas);
               
            }
            jTable.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la tabla");
        }

    }
}


