/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquiler;
import Personas.Clientes;
import Vehiculo.Vehiculos;
import java.time.LocalDate;
/**
 *
 * @author HP I3
 */
public class Reserva{
    private int idReserva;
    private Clientes cliente;
    private Vehiculos vehiculo;
    private LocalDate fechaReserva;
    private LocalDate fechaInicio;

    
    

    // Getters y Setters

    public int getIdReserva() {
        return idReserva;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Reserva(int idReserva, Clientes cliente, Vehiculos vehiculo,
                   LocalDate fechaReserva, LocalDate fechaInicio) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
    }
                
          
               

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + idReserva +
                ", cliente=" + cliente.getNombre() +
                ", vehiculo=" + vehiculo.getMarca() +
                ", fechaReserva=" + fechaReserva +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}


