/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_b2;

/**
 *
 * @author Claudio
 */
public class Matriz {
    private int matrizA[][] = new int[3][3];
    private int matrizB[][] = new int[3][3];
    private int matrizC[][] = new int[3][3];
    
    public void sumar(){
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[0].length; col++) {
                matrizC[fila][col] = matrizA[fila][col] + matrizB[fila][col];
                
            }
        }
    }

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }
    
    
}
