package com.oscar.pectest;

import com.oscar.pe.cmodelo.Genero;
import com.oscar.pe.cnegocio.GeneroBO;

import java.sql.SQLException;

public class Test {
    private GeneroBO generoBO = new GeneroBO();
    
    public void insertar() throws SQLException {
        Genero genero = new Genero();
        genero.setNombre("Masculino");
        genero.setSimbolo("/");
        genero.setCodigo("M");
        genero.setDescripcion("Género Masculino");
        genero.setUsuario_creacion("usuario21");
        genero.setUsuario_actualizacion("usuario21");
        
        generoBO.AgregarGenero(genero); // Cambio en el nombre del método a minúsculas
        System.out.println("Inserción exitosa");
    }
    
    public void modificar() throws SQLException{
        Genero genero = new Genero();
        genero.setIdGenero(9);
        genero.setNombre("Femenino");
        genero.setSimbolo("°");
        genero.setCodigo("f");
        genero.setDescripcion("Género Femenino");
        genero.setUsuario_creacion("usuario22");
        genero.setUsuario_actualizacion("usuario22");
        
        generoBO.AgregarGenero(genero);
        System.out.println("Modificacion exitosa");
    }
    
    public void eliminar() throws SQLException{
        generoBO.EliminarGenero(130);
    }
            
    public static void main(String[] args) throws SQLException {
        Test t = new Test();
        //t.insertar();
        //t.modificar();
        t.eliminar();
    }
}
