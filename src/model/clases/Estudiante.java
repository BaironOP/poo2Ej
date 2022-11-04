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
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String id;
    private String Facultad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String id, String Facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.Facultad = Facultad;
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

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", Facultad=" + Facultad + '}';
    }
    
}
