/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int hora;
        double cuota;
        Empleado objEmpleado = new Empleado();
        System.out.println("Ingrese el nombre del empleado");
        nombre = teclado.nextLine();
        System.out.println("Ingrese las horas trabajadas del empleado");
        hora = teclado.nextInt();
        System.out.println("Ingrese la cuota del empleado");
        cuota = teclado.nextDouble();
        
        objEmpleado.setEmpleado(nombre);
        objEmpleado.setHoras(hora);
        objEmpleado.setCuota(cuota);
        
        objEmpleado.calcularSueldo();
        
        System.out.println("Nombre: " +nombre);
        System.out.println("Sueldo: " +objEmpleado.getSueldo());
        
    }
}
