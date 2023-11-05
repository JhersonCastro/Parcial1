package Empleados;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = Math.round(tarifaPorHora * 100.0) / 100.0;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
   
    @Override
    public double calcularSalario() {
        return Math.round((tarifaPorHora*horasTrabajadas)*100)/100;
    }
    @Override
    public String toString() {
        return "Nombre del Empleado que trabaja por horas: "+ nombre
                + "\nSu precio por hora equivale a: " + tarifaPorHora
                + " COP\nY las horas que ha trabajado son: " + horasTrabajadas
                + " COP\nDando como resultado un salario de: " + calcularSalario()+ " COP";
    }    
}

