/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;

/**
 *
 * @author galla
 */
public abstract class Personas {
    
    protected String cedula;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String telefono;
    protected String correo;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Personas(String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        int edad = java.time.Period.between(fechaNacimiento, java.time.LocalDate.now()).getYears();
    if (edad >= 18){
        this.fechaNacimiento = fechaNacimiento;
    }
        if (telefono.matches("\\d{8}")){
           this.telefono = telefono;
        }
        if (correo.matches("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
             this.correo = correo;
        }
    }
    
    // En el constructor vamos a poner una excepcion de cuando este vacio lo mande incorecto:    if (cedula == null || cedula.isBlank()) {       throw new IllegalArgumentException("La cédula es obligatoria");
    
}
