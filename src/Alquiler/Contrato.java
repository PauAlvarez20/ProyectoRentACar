/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquiler;

import java.time.LocalDate;
/**
 *
 * @author HP I3
 */
   



public class Contrato {

    private int idContrato;
    private Reserva reserva;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private EstadoContrato descripcion;

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Reserva getReserva() {
        return reserva;
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

    public void setEstado(EstadoContrato descripcion) {
        this.descripcion = descripcion;
    }

     
    public int getIdContrato() {
        return idContrato;
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
        return descripcion;
    }
    
    public Contrato(int idContrato, LocalDate fechaInicio,Reserva reserva, LocalDate fechaFin, double tarifaDiaria) {
        this.reserva = reserva;
        this.idContrato = idContrato;       
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = tarifaDiaria * (fechaFin.toEpochDay() - fechaInicio.toEpochDay());
        
    }

    public void finalizar() {
        if (descripcion == EstadoContrato.ACTIVO) {
            descripcion = EstadoContrato.FINALIZADO;
            reserva.getIdReserva();// se libera el vehículo
        }
    }

    public void cancelar() {
        if (descripcion == EstadoContrato.ACTIVO) {
            descripcion = EstadoContrato.CANCELADO;
           reserva.getIdReserva(); // también se libera
        }
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", reserva=" + reserva + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto + ", descripcion=" + descripcion + '}';
    }

    
}




