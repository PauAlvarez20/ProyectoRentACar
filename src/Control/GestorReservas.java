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
import java.util.List;

/**
 *
 * @author ccore
 */
public class GestorReservas{
   private Queue<Reserva> reservas; 
   private int contadorId; 
   private List<Clientes>listClientes;


    public GestorReservas() {
        this.reservas = new LinkedList<>(); 
        this.contadorId = 1;
    }
       

    // crea reserva con fechaReserva = hoy
    public Reserva agregarReserva(Clientes cliente, Vehiculos vehiculo, LocalDate inicio, LocalDate fin) {
        Clientes clienteEncontrado = null; //empieza a buscar cliente en lista
        for (Clientes c : listClientes) {
            if (c.getCedula().equals(cliente.getCedula())) { 
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            throw new IllegalArgumentException("El cliente con id " + cliente.getCedula() + " no existe en la lista");
        }

        int idReserva = contadorId++;
        Reserva nueva = new Reserva(idReserva, clienteEncontrado, vehiculo, LocalDate.now(), inicio);

        reservas.offer(nueva); 
        vehiculo.setEstado(EstadoVehiculo.ALQUILER);
        return nueva;
    }

    // cancelar reserva por id
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

    // buscar reserva por id
    public Reserva buscarReservaPorId(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == id) {
                return reserva;
            }
        }
        return null;
    }

    // obtener todas las reservas
    public Queue<Reserva> getReservas() {
        return new LinkedList<>(reservas);
    }

    // sacar la primera reserva de la lista)
    public Reserva atenderReserva() {
        Reserva reserva = reservas.poll(); 
        if (reserva != null) {
            reserva.getVehiculo().setEstado(EstadoVehiculo.DISPONIBLE);
        }
        return reserva;
    }
    
}

    




   

