/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorUtil;

import Vehiculo.EstadoVehiculo;
import Vehiculo.TipoVehiculo;
import java.time.Year;

/**
 *
 * @author ccore
 */
public class ValidadorVehiculo {
    
    public static void validarYear(int year) throws Exception{
        int yearActual = Year.now().getValue();
        if(year > yearActual || (yearActual - year) > 20){
            throw new Exception("El año del vehiculo es invalido");
        }  
    }
    
    public static void validarTipo(TipoVehiculo tipo) throws Exception {
       if (tipo == null) {
           throw new Exception("El tipo de vehiculo es invalido");
           
       }
    }
    
    public static void validarEstado(EstadoVehiculo estado) throws Exception {
     if (estado == null){
        throw new Exception("El estado del vehiculo es invalido");
        }   
    } 
    
 }

