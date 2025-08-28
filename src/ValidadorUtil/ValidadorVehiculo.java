/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorUtil;

import Vehiculo.EstadoVehiculo;
import Vehiculo.TipoVehiculo;
import java.time.Year;
import javax.swing.JOptionPane;

/**
 *
 * @author ccore
 */
public class ValidadorVehiculo {
    
    public static void validarYear(int year) {
      int yearActual = Year.now().getValue();
        if (year > yearActual || (yearActual - year) > 20) {
            JOptionPane.showMessageDialog (null, "El año del vehículo es inválido", "Error de Validación",
                    JOptionPane.ERROR_MESSAGE
            );
        }  
        
    }
    
    public static boolean validarTipo(TipoVehiculo tipo) {
        if (tipo == null) {
            JOptionPane.showMessageDialog(null, "El tipo de vehículo es inválido", "Error de Validación",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
        return true;
    }
    
    public static boolean validarEstado(EstadoVehiculo estado) {
        if (estado == null) {
            JOptionPane.showMessageDialog(null, "El estado del vehículo es inválido", "Error de Validación",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }   
        return true;
    }
 }

