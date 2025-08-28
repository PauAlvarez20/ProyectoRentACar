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
import java.util.LinkedList;

import java.util.Queue;

/**
 *
 * @author ccore
 */
public class GestorReservas{
   
    private Queue<Reserva> reservas; // list de reservas
    private int contadorId; // Para generar ids únicosssss

    public GestorReservas() {
        this.reservas = new LinkedList<>(); // LinkedList implementa Queue
        this.contadorId = 1;
    }

    // Crear reserva con fechaReserva = hoy
    public Reserva agregarReserva(Clientes cliente, Vehiculos vehiculo, LocalDate inicio, LocalDate fin) {
        int idReserva = contadorId++;
        Reserva nueva = new Reserva(idReserva, cliente, vehiculo, inicio, fin);
        reservas.offer(nueva); // offer = agregar al final de la cola
        vehiculo.setEstado(EstadoVehiculo.ALQUILER);
        return nueva;
    }

    // Cancelar reserva por id siempre
    public boolean cancelarReserva(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == id) {
                reserva.getVehiculo().setEstado(EstadoVehiculo.DISPONIBLE);
                reservas.remove(reserva);
                return true;
            }
        }
        return false;
    }

    // Buscar reserva por id
    public Reserva buscarReservaPorId(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == id) {
                return reserva;
            }
        }
        return null;
    }

    // Obtener todas las reservas
    public Queue<Reserva> getReservas() {
        return new LinkedList<>(reservas);
    }

    // Atender (sacar la primera reserva de la lista)
    public Reserva atenderReserva() {
        Reserva reserva = reservas.poll(); // poll = sacar la cabeza de la cola
        if (reserva != null) {
            reserva.getVehiculo().setEstado(EstadoVehiculo.DISPONIBLE);
        }
        return reserva;
    }
}

    




   

