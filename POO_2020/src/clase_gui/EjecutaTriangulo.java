/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_gui;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular el área de un triángulo");
        System.out.println("Ingrese la base");
        double base = teclado.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = teclado.nextDouble();
        //creación o instanciacion del objeto
        Triangulo obj = new Triangulo(base, altura);
        obj.calcularArea();
        
        System.out.println("El área del triángulo es: "+ obj.getArea());
    }
}
