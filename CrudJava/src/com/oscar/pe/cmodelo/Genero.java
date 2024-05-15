package com.oscar.pe.cmodelo;

public class Genero {
    private int idGenero;
    private String nombre;
    private String codigo;
    private String simbolo;
    private String descripcion;
    private String usuario_creacion;
    private String usuario_actualizacion;

    
    //setters
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setUsuario_creacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public void setUsuario_actualizacion(String usuario_actualizacion) {
        this.usuario_actualizacion = usuario_actualizacion;
    }
    
    //getters
    public int getIdGenero() {
        return idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getDescripcion() {
        return descripcion;
    }    

    public String getUsuario_actualizacion() {
        return usuario_actualizacion;
    }

    public String getUsuario_creacion() {
        return usuario_creacion;
    }

    
}
