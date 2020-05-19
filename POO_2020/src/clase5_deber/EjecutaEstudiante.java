
package clase5_deber;

import java.util.Scanner;


public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        
        Estudiante objEstudiante = new Estudiante();
        System.out.println("Ingrese el Nombre del Estudiante");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la Nota del Parcial 1");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese la Nota del Parcial 2");
        nota2 = teclado.nextDouble();
        System.out.println("Ingrese la Nota del Parcial 3");
        nota3 = teclado.nextDouble();
        
        objEstudiante.setNombre(nombre);
        objEstudiante.setNota1(nota1);
        objEstudiante.setNota2(nota2);
        objEstudiante.setNota3(nota3);
        
        objEstudiante.obtenerNotaF();
        
        System.out.println("Nombre del Estudiante: " +nombre);
        System.out.println("Nota Parcial 1: " +nota1);
        System.out.println("Nota Parcial 2: " +nota2);
        System.out.println("Nota Parcial 3: " +nota3);
        System.out.println("Promedio Final: " +objEstudiante.getPromedio()+ objEstudiante.getNotaF());
    }
}
