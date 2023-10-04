import Empleados.*;
public class Main {
    
    
    public static void main(String[] args) {
        Empleado[] arrEmpleados = new Empleado[2];
        //Este for solo funciona cuando la longitud es par,
        //No cuando es impar, el parcial, especificamente dice que es par
        //1 - Llena el arreglo con al menos 10 datos diferentes. check;
        for(int i = 0; i < arrEmpleados.length/2; i++){
            arrEmpleados[i]  = new EmpleadoAsalariado
                    (Readers.readString("Dime el nombre del EmpleadoAsalariado : "), 
                    Readers.readDouble("Dime tu salario base"), 
                    Readers.readDouble("Dime tus deducciones"));
        }
        for(int i = arrEmpleados.length/2; i < arrEmpleados.length; i++){
            arrEmpleados[i]  = new EmpleadoPorHoras
                                                (Readers.readString("Dime el nombre del EmpleadoPorHoras : "),
                                                Readers.readInt("Dime cuantas horas trabajo"),
                                                Readers.readDouble("Cual es tu tarifa por hora?"));  
        }
        
        
        
        //Imprime todos los empleados, bien bonito 
        for(Empleado item : arrEmpleados){
            System.out.println(item);
            System.out.println("================================");
        }
        
        //Modificar a un objeto del arreglo
        int opc = 0;
        do{
        System.out.println("Modificar el dato de un objeto en el array!");
        
        int position = getPositionEmpleadoByName(arrEmpleados, Readers.readString("Dime el nombre del empleado"));
        if(position != -1){
            if(arrEmpleados[position].getClass().equals(EmpleadoAsalariado.class)){
                EmpleadoAsalariado refEmpleado = (EmpleadoAsalariado) arrEmpleados[position];
                switch(Readers.readInt("1- Modificar el Nombre 2-Modificar el salario base 3-salir")){
                    case 1 -> refEmpleado.setNombre(Readers.readString("Ingresa el nuevo nombre"));
                    case 2 -> refEmpleado.setSalarioBase(Readers.readDouble("Ingrese el nuevo salario base"));
                    case 3 -> opc = 5;
                }
            }else{
                EmpleadoPorHoras refEmpleado = (EmpleadoPorHoras) arrEmpleados[position];
                switch(Readers.readInt("1- Modificar el Nombre 2-Modificar la tarifa por horas 3-Modificar las horas trabajadas 4-salir")){
                    case 1 -> refEmpleado.setNombre(Readers.readString("Ingresa el nuevo nombre"));
                    case 2 -> refEmpleado.setTarifaPorHora(Readers.readDouble("Cambiemos la tarifa por hora"));
                    case 3 -> refEmpleado.setHorasTrabajadas(Readers.readInt("Cuantas horas trabajo, campeon?"));
                    case 4 -> opc = 5;
                }
            }
        }
        }while(opc != 5);
       
        System.out.println("");
        
        //Imprimo de nuevo los empleados para ver si hubo cambios
        for(Empleado item : arrEmpleados){
            System.out.println(item);
            System.out.println("================================");
        }
        
        System.out.println("");
        //Obtener empleados por horas
        System.out.println("Obteniendo empleados por horas");
        for(Empleado item : arrEmpleados){
            if(item.getClass().equals(EmpleadoPorHoras.class)){
                System.out.println(item.toString());
            }
        }
        
        
        //Obtener un empleado en especifico por el nombre, he imprimo  sus datos
        int pos;
        do{
        pos = getPositionEmpleadoByName(arrEmpleados, Readers.readString("Dime el nombre del empleado"));
        if(pos != -1)
            System.out.println("Datos del empleado en especifico: " + arrEmpleados[pos].toString());   
        }while(pos != -1);
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
