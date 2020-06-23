/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal1_b2;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaFigurasGeometricas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char op = 's';
        int opc = 0;
        String nombre;

        do {
            System.out.println("Ingrese la opcion que desea");
            System.out.println("Ingrese (1) para obtener el área de un Trapecio");
            System.out.println("Ingrese (2) para obtener el área de un Rombo");
            System.out.println("Ingrese (3) para obtner el área de un Paralelogramo");
            System.out.println("Ingrese (4) para Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    nombre = "Trapecio";
                    System.out.println("Ingrese la Base Menor");
                    double baseMe = teclado.nextDouble();
                    System.out.println("Ingrese la Base Mayor");
                    double baseMa = teclado.nextDouble();
                    System.out.println("Ingrese la Altura");
                    double altura = teclado.nextDouble();

                    Trapecio tp = new Trapecio(altura, baseMa, baseMe, nombre);
                    tp.areaTotalTrapecio();
                    System.out.println("El Área del " + tp.getNombre() + " es: " + tp.getArea());
                    break;
                case 2:
                    nombre = "Rombo";
                    System.out.println("Ingrese la Diagonal Mayor");
                    double dMayor = teclado.nextDouble();
                    System.out.println("Ingrese la Diagonal Menor");
                    double dMenor = teclado.nextDouble();

                    Rombo rm = new Rombo(dMayor, dMenor, nombre);
                    rm.areaTotal();
                    System.out.println("El Área del " + rm.getNombre() + " es: " + rm.getArea());
                    break;

                case 3:
                    nombre = "Paralelogramo";
                    System.out.println("Ingrese la Base ");
                    double base = teclado.nextDouble();
                    System.out.println("Ingrese la Altura");
                    double alt = teclado.nextDouble();

                    Paralelogramos pr = new Paralelogramos(base, alt, nombre);
                    pr.areaTotalParalelogramo();
                    System.out.println("El Área del " + pr.getNombre() + " es: " + pr.getArea());
                    break;

                case 4:
                    System.out.println("Gracias por usar el Programa");
                    op = 'n';
                    break;
            }
            System.out.println("Desea ingrsear una nueva Figura Si/No");
            op = teclado.next().charAt(0);
        } while (op == 's');
    }
}
