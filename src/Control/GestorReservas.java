/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Alquiler.Reserva;
import Personas.Clientes;
import Vehiculo.EstadoVehiculo;
import Vehiculo.Vehiculos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ccore
 */
public class GestorReservas{
    
    private List<Reserva> reservas;
    private int contadorId; // Para generar ids únicos automaticos

    public GestorReservas() {
        this.reservas = new ArrayList<>();
        this.contadorId = 1;
    }

     //crear reserva fechaReserva = hoy
    public Reserva agregarReserva(Clientes cliente, Vehiculos vehiculo,LocalDate inicio, LocalDate fin) {
        int idReserva = contadorId++;
        Reserva nueva = new Reserva(idReserva, cliente, vehiculo, LocalDate.now(), inicio);
        reservas.add(nueva);
        vehiculo.setEstado(EstadoVehiculo.ALQUILER); // Cambiar estado del vehículo
        return nueva;
    }

   //se cancela la reserva por el id
    public boolean cancelarReserva(int id) { 
        Reserva r = buscarReservaPorId(id);
        if (r != null) {
            r.getVehiculo().setEstado(EstadoVehiculo.DISPONIBLE);
            reservas.remove(r);
            return true;
        }
        return false;
    }

   //busca la reserva por el id
    public Reserva buscarReservaPorId(int id) {
        for (Reserva r : reservas) {
            if (r.getIdReserva() == id) {
                return r;
            }
        }
        return null;
    }

   
    public List<Reserva> getReservas() {
        return new ArrayList<>(reservas); // Retorna copia para no modificar la lista interna
    }
}



   

