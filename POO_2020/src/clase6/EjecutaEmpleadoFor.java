/*
 * Integrantes: Andrés Jiménez y Carlos Castillo
 */
package clase6;

import java.util.Scanner;


public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String cadena = "";
        int hrs;
        double cuota;
        int desea ;
        double sueldoT = 0 ;
        System.out.println("¿Cuántos Empleados se va a ingresar");
        desea = teclado.nextInt();
        
        for (int i = 0; i < desea; i++) {

            System.out.println("Ingrese el nombre del empleado "+(i+1)+": ");
            teclado.nextLine();
            nombre = teclado.nextLine();
            System.out.println("Ingrese el numero de horas trabajadas: ");
            hrs = teclado.nextInt();
            System.out.println("Ingrese la cuota por hora: ");
            cuota = teclado.nextDouble();
            
            Empleado objEmpleado = new Empleado(nombre,hrs,cuota);
            objEmpleado.calcularSueldo();
            
            cadena = cadena + ("\nNombre del Empleado: "+ nombre +"\nCuota por Hora: "+ hrs +"\nSueldo a Cobrar: "+objEmpleado.getSueldo()+"\n---------------------------------");
            sueldoT = sueldoT + objEmpleado.getSueldo();
            
        }
        System.out.println("REPORTE DE EMPLEADOS");
        System.out.println("--------------------------");
        System.out.println(cadena);
        System.out.println("El sueldo total de Empleados es: "+sueldoT);
        System.out.println("el número de Empleados son: "+desea);
    }
}
