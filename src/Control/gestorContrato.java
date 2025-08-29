/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Alquiler.Contrato;
import Alquiler.Reserva;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author paublo
 */
public class gestorContrato {

    private List<Contrato> contratos; 
    private int contadorId; // Para generar IDs automáticos

    public gestorContrato() {
        contratos = new ArrayList<>();
        contadorId = 1;
    }

    // Crear un contrato a partir de una reserva
   public Contrato crearContrato(Reserva reserva, LocalDate fechaInicio, LocalDate fechaFin, double tarifaDiaria) {
    Contrato contrato = new Contrato(contadorId, fechaInicio, reserva, fechaFin, tarifaDiaria);
    contratos.add(contrato);
    contadorId++;
    return contrato;
}


    // Buscar contrato por índice
    public Contrato getContrato(int index) {
        if (index >= 0 && index < contratos.size()) {
            return contratos.get(index);
        }
        return null;
    }


    // Finalizar un contrato
    public void finalizarContrato(int index) {
        Contrato contrato = getContrato(index);
        if (contrato != null) {
            contrato.finalizar();
        }
    }

    // Mostrar todos los contratos
    public List<String> listarContratos() {
    List<String> lista = new ArrayList<>();
    for (int i = 0; i < contratos.size(); i++) {
        lista.add("[" + i + "] " + contratos.get(i).toString());
    }
    return lista;
     }


    

    public int getCantidadContratos() {
        return contratos.size();
    }
}











