import Empleados.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Empleado[] arrEmpleados = new Empleado[10];
        int minSalario = 1160000, maxSalario = 5160000;
        int minDeducciones = 100000, maxDeducciones = 500000;
        int minHoras = 10, maxHoras = 40;
        double minTarifaPorHora = 35000;
        double maxTarifaPorHora = minTarifaPorHora*2;

        Random rand = new Random();

        // Empleados Asalariados
        arrEmpleados[0] = new EmpleadoAsalariado("Juan", minSalario + rand.nextDouble() * (maxSalario - minSalario), minDeducciones + rand.nextDouble() * (maxDeducciones - minDeducciones));
        arrEmpleados[1] = new EmpleadoAsalariado("Maria", minSalario + rand.nextDouble() * (maxSalario - minSalario), minDeducciones + rand.nextDouble() * (maxDeducciones - minDeducciones));
        arrEmpleados[2] = new EmpleadoAsalariado("Carlos", minSalario + rand.nextDouble() * (maxSalario - minSalario), minDeducciones + rand.nextDouble() * (maxDeducciones - minDeducciones));
        arrEmpleados[3] = new EmpleadoAsalariado("Ana", minSalario + rand.nextDouble() * (maxSalario - minSalario), minDeducciones + rand.nextDouble() * (maxDeducciones - minDeducciones));
        arrEmpleados[4] = new EmpleadoAsalariado("Pedro", minSalario + rand.nextDouble() * (maxSalario - minSalario), minDeducciones + rand.nextDouble() * (maxDeducciones - minDeducciones));

        // Empleados Por Horas
        arrEmpleados[5] = new EmpleadoPorHoras("Sofia", new Random().nextInt(maxHoras - minHoras + 1) + minHoras, minTarifaPorHora + rand.nextDouble() * (maxTarifaPorHora - minTarifaPorHora));
        arrEmpleados[6] = new EmpleadoPorHoras("Diego", new Random().nextInt(maxHoras - minHoras + 1) + minHoras, minTarifaPorHora + rand.nextDouble() * (maxTarifaPorHora - minTarifaPorHora));
        arrEmpleados[7] = new EmpleadoPorHoras("Isabella", new Random().nextInt(maxHoras - minHoras + 1) + minHoras, minTarifaPorHora + rand.nextDouble() * (maxTarifaPorHora - minTarifaPorHora));
        arrEmpleados[8] = new EmpleadoPorHoras("Miguel", new Random().nextInt(maxHoras - minHoras + 1) + minHoras, minTarifaPorHora + rand.nextDouble() * (maxTarifaPorHora - minTarifaPorHora));
        arrEmpleados[9] = new EmpleadoPorHoras("Camila", new Random().nextInt(maxHoras - minHoras + 1) + minHoras, minTarifaPorHora + rand.nextDouble() * (maxTarifaPorHora - minTarifaPorHora));

        //Imprime todos los empleados
        for(Empleado item : arrEmpleados) {
            System.out.println(item);
            System.out.println("================================");
        }

        //Modifico a un empleado por hora su nombre y salario
        String nombreDelEmpleadoAModificar = "Sofia";
        System.out.println("\n===============================================\nEl nombre anterior del empleado era "+ nombreDelEmpleadoAModificar);
        EmpleadoPorHoras empleadoAModificar =
                (EmpleadoPorHoras) arrEmpleados[getPositionEmpleadoByName(arrEmpleados, nombreDelEmpleadoAModificar)];
        empleadoAModificar.setNombre("Alejandra");
        empleadoAModificar.setHorasTrabajadas(rand.nextInt(maxHoras - minHoras + 1) + minHoras);

        //Obtener empleados por horas
        System.out.println("===============================================\nObteniendo empleados por horas:\n");
        for(Empleado item : arrEmpleados){
            if(item.getClass().equals(EmpleadoPorHoras.class)){
                System.out.println(item);
                System.out.println("===============================================");
            }
        }

        //Obtener datos en especifico
        String nombreDelEmpleadoEnEspecifico = "Ana";
        System.out.println("\nObteniendo los datos de " + nombreDelEmpleadoEnEspecifico);
        System.out.println(arrEmpleados[getPositionEmpleadoByName(arrEmpleados,nombreDelEmpleadoEnEspecifico)]);
    }
    private static int getPositionEmpleadoByName(Empleado[] arrEmpleados, String nombre){
        //En este ejemplo todos los empleados tendrán nombres unicos, sino, solo se va a escoger el primer empleado con ese nombre
        for(int i = 0; i < arrEmpleados.length; i++){
            if(arrEmpleados[i].getNombre().equals(nombre)){
                return i;
            }
        }
        System.out.println("No se encontro empleado con ese nombre");
        return -1;
    }
}
