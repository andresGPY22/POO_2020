/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaEmpleado {
    public static void main(String[] args) {
        String nombre;
        String cadena;
        int hrs;
        double cuota;
        char desea = 'n' ;
        
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese el numero de horas trabajadas: ");
            hrs = teclado.nextInt();
            System.out.println("Ingrese la cuota por hora: ");
            cuota = teclado.nextDouble();
            
            Empleado objEmpleado = new Empleado(nombre,hrs,cuota);
            objEmpleado.calcularSueldo();
            
            cadena = ("Nombre del Empleado: "+objEmpleado.getEmpleado()+"\nCuota por Hora: "+objEmpleado.getCuota()+"\nSueldo a Cobrar: "+objEmpleado.getSueldo());
            
            System.out.println("¿Desea Ingresar otro Empleado? s/n");
            desea = teclado.next().toLowerCase().charAt(0);
        }while(desea == 's');
        
        System.out.println(cadena);
    }
}
