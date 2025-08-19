/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author ccore
 */
public enum EstadoVehiculo {
    DISPONIBLE ("Disponible"),
    ALQUILER ("En Alquiler"),
    MANTENIMIENTO ("En Mantenimiento");
    
    private String estado;
    
   EstadoVehiculo(String estado){
       this.estado = estado;
   }

    public String getEstado() {
        return estado;
    }
   
   
}
