/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clases;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private String id;
    private String asignatura;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String id, String asignatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.asignatura = asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", asignatura=" + asignatura + '}';
    }
    
    
}
