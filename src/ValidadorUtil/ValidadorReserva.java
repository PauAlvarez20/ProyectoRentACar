/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorUtil;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author ccore
 */
public class ValidadorReserva {
    
    public static boolean ValidarFechas(LocalDate inicio, LocalDate fin) { 
      if (inicio.isBefore(LocalDate.now())) {
            JOptionPane.showMessageDialog(null, "La fecha de inicio no puede ser anterior a hoy", "Error en fecha", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (fin.isBefore(inicio)){
            JOptionPane.showMessageDialog(null, "La fecha final debe ser posterior a la inicial", "Error en fecha", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (inicio.plusDays(30).isBefore(fin)){
            JOptionPane.showMessageDialog(null, "No se aceptan reservas de más de 30 días", "Error en fecha", 
                    JOptionPane.ERROR_MESSAGE);
           return false;
        }
        return true; 
    }  
          
 }
        
            
     

