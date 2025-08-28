/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Personas.Clientes;
import static ValidadorUtil.Validador.validarLicencia;
import java.util.ArrayList;

/**
 *
 * @author galla
 */
public class ListaClientes implements ListArray<Clientes>{
    private ArrayList<Clientes> listClientes=new ArrayList<>();

    @Override
    public void add(Clientes t) {
       for (Clientes c : listClientes) {
           if (c.getCedula().equals(t.getCedula())) {
            throw new IllegalArgumentException("Ya existe un empleado " + t.getCedula());
           }
       }
        listClientes.add(t);
    }

    @Override
    public void remove(Clientes t) {
       listClientes.remove(t);
    }

    @Override
    public Clientes find(String cedula) {
        for (Clientes cliente:listClientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    public void actualizarCliente(String cedula, String nuevoTelefono, String nuevoCorreo, String licencia){
        Clientes clien=find(cedula);
        
        if (nuevoTelefono!= null && nuevoTelefono.matches("\\d{8}")) {
            clien.setTelefono(nuevoTelefono);
        }
        if (nuevoCorreo != null && nuevoCorreo.matches("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
            clien.setCorreo(nuevoCorreo);
        }
        if (validarLicencia(licencia)==true) {
            clien.setLicencia(licencia);
        }
    }

    public ArrayList<Clientes> getListClientes() {
        return listClientes;
    }

    public ListaClientes() {
        this.listClientes=new ArrayList<>();
    }

   
    
}
