/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Alquiler;

/**
 *
 * @author HP I3
 */

   

public enum EstadoContrato {
    PENDIENTE("Pendiente de aprobación"),
    RESERVADO("Vehículo reservado"),
    ACTIVO("Contrato en curso"),
    FINALIZADO("Contrato finalizado"),
    CANCELADO("Contrato cancelado por el cliente"),
    VENCIDO("Contrato vencido por fecha"),
    RENOVADO("Contrato renovado");
    

    private final String descripcion;

    EstadoContrato(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}


