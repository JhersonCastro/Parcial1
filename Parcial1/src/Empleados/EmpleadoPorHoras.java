package Empleados;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        /*El salarioBase del Empleado por horas no la necesito, debido a la naturaleza del
            Empleado por horas, es decir, un empleado que trabaja por horas, no tiene un salario base per sé,
            sino que es el producto de su tarifa por cada hora, y las horas que ha trabajado 
            (Comunmente, habrán casos donde tenga un salario fijo y se le agreguen las horasTrabajadas*tarifaDeHora,
            pero tomaré que solo se le paga las horas que trabaje, no sumando un salario base 
        {Sí tambien se agrega el salario base, pues a este constructor se le agrega el parametro de salario base 
        y en calcular salario al producto se le agrega el salario base})   
        */
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
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
        return tarifaPorHora*horasTrabajadas;
    }
    @Override
    public String toString() {
        String label =
                "Nombre del Empleado que trabaja por horas: "+ nombre 
                + "\nSu precio por hora equivale a: " + tarifaPorHora 
                + "\nY las horas que ha trabajado son: " + horasTrabajadas
                + "\nDando como resultado un salario de: " + calcularSalario();
        return label;
    }
    
}
