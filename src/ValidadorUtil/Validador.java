/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorUtil;

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
}


