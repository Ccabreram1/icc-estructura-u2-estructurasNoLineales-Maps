package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private HashMap<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        //inicializar empleados 
        empleados = new HashMap<>();

    }

    public void addEmpleado(Empleado empleado){
        empleados.put( empleado.getId(),empleado); //ID es para que vaya uno por otro
    }
    
    public Empleado getREmpleado (int id){
        return empleados.get(id);
    }

    public void imprimirEmpleados(){
        //System.err.println(empleados); imrprime id con valores
        for (Empleado emp : empleados.values()) {
            System.out.println(emp);
            
        }
    }


    
}