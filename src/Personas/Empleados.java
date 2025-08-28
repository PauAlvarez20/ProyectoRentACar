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
public class Empleados extends Personas {
    private String puesto;
    private double salario;

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleados(String cedula,  String nombre,LocalDate fechaNacimiento, String telefono,String correo, String puesto, double salario ) {
        super(cedula, nombre, fechaNacimiento, telefono, correo);
        this.puesto = puesto;
        this.salario = salario;
    }
    
}
