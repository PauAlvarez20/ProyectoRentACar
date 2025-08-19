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
    private int year;
    private TipoVehiculo tipo;
    private EstadoVehiculo estado; 

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }
    
    
    public abstract double calcularTarifaPersonalizada(int dias);
    
    public boolean estaDisponible(){
      return estado == EstadoVehiculo.DISPONIBLE;   
        
    }

    public Vehiculos(String placa, String marca, String modelo, int year, TipoVehiculo tipo, EstadoVehiculo estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.tipo = tipo;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", year=" + year + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
    
    
}
