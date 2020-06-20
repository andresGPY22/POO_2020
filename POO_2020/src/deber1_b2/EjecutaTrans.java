/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1_b2;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaTrans {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero  de  Filas a  Ingresar");
        int fila = teclado.nextInt();
        System.out.println("Ingrese el numero  de Columnas  a  Ingresar");
        int colu = teclado.nextInt();
        Trans obj = new Trans();
        int mat[][] = new int[fila][colu];

        System.out.println("INGRESO DE DATOS DE LA MATRIZ ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colu; j++) {
                System.out.println("Ingrese un valor para la posicion [" + i + "][" + j + "]");
                mat[i][j] = teclado.nextInt();

            }
        }
        obj.MatrizT();

        System.out.println("__________________________________");
        System.out.println("Presentacion de la Matriz ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colu; j++) {
                System.out.print(mat[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("_________________________________________");
        System.out.println("Presentacion de la Matriz  Transpuesta");
        for (int i = 0; i <colu; i++) {
            for (int j = 0; j <fila; j++) {
                
                   System.out.print(mat[j][i] + "\t");
            }
            System.out.println("");
        }

    }

}
