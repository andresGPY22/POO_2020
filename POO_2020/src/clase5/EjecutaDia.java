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
public class EjecutaDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nDia;
        Dia objDia = new Dia();
        System.out.println("Ingrese el Número de Día");
        objDia.setNum(teclado.nextInt());
        objDia.calcularNum();
        
        System.out.println("El día correspondiente al número ingresado es: " +objDia.getNombre());
    }
}
