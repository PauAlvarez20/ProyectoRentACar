/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Personas.Empleados;
import java.util.ArrayList;

/**
 *
 * @author galla
 */
public class ListaEmpleados {
    private ArrayList<Empleados> listEmpleado= new ArrayList<>();
    
    public void addEmpleado(Empleados empleado){
         for (Empleados e : listEmpleado) {
        if (e.getCedula().equals(empleado.getCedula())) {
            throw new IllegalArgumentException("Ya existe un empleado " + empleado.getCedula());
        }
    }
        listEmpleado.add(empleado);
    }
    public void removeEmpleado(Empleados empleado){
        listEmpleado.remove(empleado);
    }
    
    public Empleados buscarEmpleado(String cedula){
          for (Empleados empleado : listEmpleado) {
        if (empleado.getCedula().equals(cedula)) {
            return empleado; 
        }
    }
          return null;

    // si no lo encuentra
   // throw new NoEncontradoException("Empleado con cédula " + cedula + " no existe");
}
    
    public void actualizarEmpleado(String cedula, String nuevoTelefono, String nuevoCorreo, String nuevoPuesto) {
    Empleados empleado = buscarEmpleado(cedula); // usa tu método existente

    // Validación de teléfono (8 dígitos)
    if (nuevoTelefono != null && nuevoTelefono.matches("\\d{8}")) {
        empleado.setTelefono(nuevoTelefono);
    } 
        //throw new IllegalArgumentException("Teléfono inválido, debe tener 8 dígitos numéricos");
    

    // Validación de correo (regex básica)
    if (nuevoCorreo != null && nuevoCorreo.matches("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
        empleado.setCorreo(nuevoCorreo);
    } 
      //  throw new IllegalArgumentException("Correo inválido");
    

    // Puesto (solo verificar que no esté vacío)
    if (nuevoPuesto != null && !nuevoPuesto.isBlank()) {
        empleado.setPuesto(nuevoPuesto);
    } 
       // throw new IllegalArgumentException("El puesto no puede estar vacío");
    }


    public void setListEmpleado(ArrayList<Empleados> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

    public ArrayList<Empleados> getListEmpleado() {
        return listEmpleado;
    }

    public ListaEmpleados() {
        this.listEmpleado = new ArrayList<>();
    }
    
}
