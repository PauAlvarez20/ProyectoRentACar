/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Alquiler.Contrato;
import Alquiler.EstadoContrato;
import java.time.LocalDate;
import Personas.Clientes;
import Vehiculo.Vehiculos;
import java.util.ArrayList;
/**
 *
 * @author paublo
 */
public class gestorContrato {

    private ArrayList<Contrato> contratos;
    private ArrayList<Clientes> clientes;
    private ArrayList<Vehiculos> vehiculos;
    private int contadorId;

    public gestorContrato() {
        contratos = new ArrayList<>();
        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
        contadorId = 1;
    }

    // Agregar cliente
    public void agregarCliente(Clientes c) {
        clientes.add(c);
    }

    // Agregar vehículo
    public void agregarVehiculo(Vehiculos v) {
        vehiculos.add(v);
    }

    // Crear contrato
    public Contrato crearContrato(String cedula, String placa,  LocalDate inicio, LocalDate fin, double monto) {
        Clientes cliente = null;
        Vehiculos vehiculo = null;

        // Buscar cliente
        for (Clientes c : clientes) {
            if (c.getCedula().equals(cedula)) {
                cliente = c;
                break;
            }
        }

        // Buscar vehículo
        for (Vehiculos v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                vehiculo = v;
                break;
            }
        }

        // Crear contrato
        Contrato contrato = new Contrato(contadorId++, cliente, vehiculo, inicio, fin, monto);
        contratos.add(contrato);

        return contrato;
    }

    // Buscar contrato por id
    public Contrato buscarPorId(int id) {
        for (Contrato c : contratos) {
            if (c.getIdContrato() == id) {
                return c;
            }
        }
        return null;
    }

    // Finalizar contrato
    public void finalizarContrato(int id) {
        Contrato c = buscarPorId(id);
        if (c != null) {
            c.finalizar();
        }
    }

    // Cancelar contrato
    public void cancelarContrato(int id) {
        Contrato c = buscarPorId(id);
        if (c != null) {
            c.cancelar();
        }
    }
}









