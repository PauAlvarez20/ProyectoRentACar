/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import ValidadorUtil.ValidadorVehiculo;
import Vehiculo.EstadoVehiculo;
import Vehiculo.TipoVehiculo;
import Vehiculo.Vehiculos;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author ccore
 */
public class GestorVehiculos {
    
    private HashMap<String, Vehiculos> vehiculos;

    public GestorVehiculos() {
        vehiculos = new HashMap<>();
    }

    public void agregarVehiculo(Vehiculos v) throws Exception {
        if (vehiculos.containsKey(v.getPlaca())) {
            throw new Exception("Ya existe un vehiculo con la placa: " + v.getPlaca());
        }

        ValidadorVehiculo.validarYear(v.getYear());
        ValidadorVehiculo.validarTipo(v.getTipo());
        ValidadorVehiculo.validarEstado(v.getEstado());

        vehiculos.put(v.getPlaca(), v);
    }

    //actualiza vehiculo que ya existe
    public void actualizarVehiculo(String placa, String modelo, TipoVehiculo tipo, EstadoVehiculo estado) throws Exception {
        Vehiculos v = vehiculos.get(placa);
        if (v == null) {
            throw new Exception("Vehiculo no encontrado.");
        }

        ValidadorVehiculo.validarTipo(tipo);
        ValidadorVehiculo.validarEstado(estado);

        v.setModelo(modelo);
        v.setTipo(tipo);
        v.setEstado(estado);
    }

    //elimina el vehiculo, si no esta en alquiler
    public void eliminarVehiculo(String placa) throws Exception {
        Vehiculos v = vehiculos.get(placa);
        if (v == null) {
            throw new Exception("Vehículo no encontrado.");
        }
        if (v.getEstado() == EstadoVehiculo.ALQUILER) {
            throw new Exception("No se puede eliminar un vehículo en alquiler.");
        }
        vehiculos.remove(placa);
    }

    //se busca por la placa
    public Vehiculos buscarVehiculo(String placa) {
        return vehiculos.get(placa);
    }

    public Collection<Vehiculos> getVehiculos(){
        return vehiculos.values();
    }
}

