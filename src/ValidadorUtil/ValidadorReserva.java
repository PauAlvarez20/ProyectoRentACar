/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorUtil;

import java.time.LocalDate;

/**
 *
 * @author ccore
 */
public class ValidadorReserva {
    
    public static void ValidarFechas(LocalDate inicio, LocalDate fin) throws Exception { 
        if (inicio.isBefore(LocalDate.now())) {
            throw new Exception("La fecha de inicio no puede ser anterior a hoy");
        }
        if (fin.isBefore(inicio)){
            throw new Exception("La fecha final debe ser posterior a la inicial");
        }
        if (inicio.plusDays(30).isBefore(fin)){
            throw new Exception("No se aceptan reservas de mas de 30 dias");
        }
    }
     
}
