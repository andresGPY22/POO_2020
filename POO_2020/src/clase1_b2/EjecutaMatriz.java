/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_b2;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaMatriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matA[][] = new int[3][3];
        int matB[][] = new int[3][3];
        System.out.println("INGRESO DE DATOS DE LA MATRIZ B");
        for (int f = 0; f < matA.length; f++) {
            for (int c = 0; c < matA[0].length; c++) {
                System.out.println("Ingrese un valor para la posicion [" + f + "][" + c + "]");
                matA[f][c] = teclado.nextInt();

            }
        }
        System.out.println("INGRESO DE DATOS DE LA MATRIZ B");
        for (int f = 0; f < matB.length; f++) {
            for (int c = 0; c < matB[0].length; c++) {
                System.out.println("Ingrese un valor para la posicion [" + f + "][" + c + "]");
                matB[f][c] = teclado.nextInt();

            }
        }
        
        Matriz obj = new Matriz();
        obj.setMatrizA(matA);
        obj.setMatrizB(matB);
        
        obj.sumar();
        int matC[][] = obj.getMatrizC();
        System.out.println("PRESENTACIÓN DE MATRIZ");
        for (int f = 0; f < matA.length; f++) {
            for (int c = 0; c < matA[0].length; c++) {
                System.out.print(matC[f][c] +"\t");
            }
            System.out.println("");
        }
    }
}
