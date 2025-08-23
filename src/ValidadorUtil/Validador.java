/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorUtil;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author HP I3
 */
public class Validador {

    public static boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El email no puede estar vacío.");
            return false;
        }
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!email.matches(regex)) {
            JOptionPane.showMessageDialog(null, "El email no tiene un formato válido (ejemplo: usuario@correo.com).");
            return false;
        }
        return true;
    }

    public static boolean validarTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El teléfono no puede estar vacío.");
            return false;
        }
        if (!telefono.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El teléfono debe contener exactamente 8 dígitos.");
            return false;
        }
        return true;
    }

    public static boolean validarCedula(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La cédula no puede estar vacía.");
            return false;
        }
        if (!cedula.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "La cédula debe contener exactamente 9 dígitos.");
            return false;
        }
        return true;
    }

      public static boolean validarLicencia(String licencia) {
        if (licencia == null || licencia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La licencia no puede estar vacía.");
            return false;
        }
        if (!licencia.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "La licencia debe contener exactamente 9 dígitos.");
            return false;
        }
        return true;
    }

    public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser nula.");
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public static boolean Rango(LocalDate fecha, LocalDate inicio, LocalDate fin) {
        if (fecha == null || inicio == null || fin == null) {
            JOptionPane.showMessageDialog(null, "Las fechas no pueden ser nulas.");
            return false;
        }
        return (!fecha.isBefore(inicio) && !fecha.isAfter(fin));
    }

    public static boolean edadEnRango(LocalDate fechaNacimiento, int edadMin, int edadMax) {
        int edad = calcularEdad(fechaNacimiento);
        if (edad < edadMin || edad > edadMax) {
            JOptionPane.showMessageDialog(null, "La edad debe estar entre " + edadMin + " y " + edadMax + " años.");
            return false;
        }
        return true;
    }
}




