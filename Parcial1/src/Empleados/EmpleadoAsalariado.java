package Empleados;
public class EmpleadoAsalariado extends Empleado{
    private final double deducciones;

    public EmpleadoAsalariado(String nombre, double salarioBase, double deducciones) {
        super(nombre, Math.round(salarioBase * 100.0) / 100.0);
        this.deducciones = Math.round(deducciones * 100.0) / 100.0;
    }
    @Override
    public double calcularSalario() {
        return Math.round((salarioBase - deducciones) * 100.0) / 100.0;
    }
    @Override
    public String toString() {
        return "Nombre del EmpleadoAsalariado: "+ nombre
                + "\nCon un salario Base de: " + salarioBase
                + " COP\nY sus deducciones son de: " + deducciones
                + " COP\nEl salario total queda en: " + calcularSalario() + " COP";
    }   
}
