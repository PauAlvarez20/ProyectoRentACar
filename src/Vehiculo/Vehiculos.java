/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author ccore
 */
public abstract class Vehiculos {
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private TipoVehiculo tipo;
    private EstadoVehiculo estado; 
    
    
    public abstract double calcularTarifaPerzonalizada(int dias);
    
    public boolean estDisponible(){
      return estado == EstadoVehiculo.DISPONIBLE;   
        
    }
}
