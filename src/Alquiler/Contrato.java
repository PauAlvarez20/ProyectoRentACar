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
   



public class Contrato {
    private int idContrato;
    private Clientes cliente;
    private Vehiculos vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private EstadoContrato descripcion;

    
   
    public int getIdContrato() {
        return idContrato;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    // Getters y Setters
    public EstadoContrato getdescripcion() {   
        return descripcion;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setEstado(EstadoContrato estado) {
        this.descripcion = descripcion;
    }
    
    public Contrato(int idContrato, Clientes cliente, Vehiculos vehiculo,
                    LocalDate fechaInicio, LocalDate fechaFin, EstadoContrato descripcion) {
        this.idContrato = idContrato;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + idContrato +
                ", cliente=" + cliente.getNombre() +
                ", vehiculo=" + vehiculo.getMarca() +
                ", desde=" + fechaInicio +
                ", hasta=" + fechaFin +
                ", estado=" + descripcion +
                '}';
    }
}


