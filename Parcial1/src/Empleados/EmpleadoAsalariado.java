/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author IngSis
 */
public class EmpleadoAsalariado extends Empleado{
    private final double deducciones;

    public EmpleadoAsalariado(String nombre, double salarioBase, double deducciones) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }
   
    
    @Override
    public double calcularSalario() {
        return salarioBase - deducciones;
    }

    @Override
    public String toString() {
        String label =
                "Nombre del EmpleadoAsalariado"+ nombre 
                + "\nCon un salario Base de: " + salarioBase 
                + "COP\nY sus deducciones son de " + deducciones
                + "El salario total queda en" + calcularSalario();
        return label;
    }
    
   
}
