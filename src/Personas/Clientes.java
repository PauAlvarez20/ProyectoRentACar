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
public class Clientes extends Personas {
    private String licencia;

    public String getLicencia() {
        return licencia;
    }

    public Clientes(String licencia, String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo) {
        super(cedula, nombre, fechaNacimiento, telefono, correo);
        this.licencia = licencia;
    }
    // excepcion si esta vacio o null manda la excepcion
}
