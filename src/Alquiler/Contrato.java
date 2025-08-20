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
    private double monto;
    private EstadoContrato estado;

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

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEstado(EstadoContrato estado) {
        this.estado = estado;
    }

     
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

    public double getMonto() {
        return monto;
    }

    public EstadoContrato getEstado() {
        return estado;
    }
    
    public Contrato(int idContrato, Clientes cliente, Vehiculos vehiculo,
                    LocalDate fechaInicio, LocalDate fechaFin, double tarifaDiaria) {
        this.idContrato = idContrato;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = tarifaDiaria * (fechaFin.toEpochDay() - fechaInicio.toEpochDay());
        this.estado = EstadoContrato.ACTIVO;
        this.vehiculo.getEstado(); // al iniciar contrato se ocupa el vehículo
    }

    public void finalizar() {
        if (estado == EstadoContrato.ACTIVO) {
            estado = EstadoContrato.FINALIZADO;
            vehiculo.getEstado(); // se libera el vehículo
        }
    }

    public void cancelar() {
        if (estado == EstadoContrato.ACTIVO) {
            estado = EstadoContrato.CANCELADO;
            vehiculo.getEstado(); // también se libera
        }
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + idContrato +
                ", cliente=" + cliente.getNombre() +
                ", vehiculo=" + vehiculo.getMarca() +
                ", desde=" + fechaInicio +
                ", hasta=" + fechaFin +
                ", monto=" + monto +
                ", estado=" + estado +
                '}';
    }
}




