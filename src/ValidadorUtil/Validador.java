/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorUtil;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author HP I3
 */
public class Validador {
    

    // Validar formato de correo
    public static boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && email.matches(regex);
    }

    // Validar teléfono (8 dígitos)
    public static boolean validarTelefono(String telefono) {
        return telefono != null && telefono.matches("\\d{8}");
    }

    // Validar cédula (9 dígitos)
    public static boolean validarCedula(String cedula) {
        return cedula != null && cedula.matches("\\d{9}");
    }

    // Validar licencia de conducir (9 dígitos en este ejemplo)
    public static boolean validarLicencia(String licencia) {
        return licencia != null && licencia.matches("\\d{9}");
    }
    
    // Método para calcular la edad a partir de una fecha de nacimiento
    public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // verificar si una fecha está dentro de un rango (inclusive)
    public static boolean estaEnRango(LocalDate fecha, LocalDate inicio, LocalDate fin) {
        if (fecha == null || inicio == null || fin == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas.");
        }
        return (!fecha.isBefore(inicio) && !fecha.isAfter(fin));
    }

    //  verificar si la edad está dentro de un rango específico
    public static boolean edadEnRango(LocalDate fechaNacimiento, int edadMin, int edadMax) {
        int edad = calcularEdad(fechaNacimiento);
        return edad >= edadMin && edad <= edadMax;
    }
}


