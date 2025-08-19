/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author ccore
 */
public enum TipoVehiculo {
    SEDAN ("Sedan", 25000),
    SUV ("Suv" , 30000),
    PICKUP ("Pick-up" , 35000);
    
    
    private String nombre;
    private double tarifaDiaria; 
    
    TipoVehiculo(String nombre, double tarifaDiaria){
        this.nombre = nombre;
        this.tarifaDiaria = tarifaDiaria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }
    
    
}
