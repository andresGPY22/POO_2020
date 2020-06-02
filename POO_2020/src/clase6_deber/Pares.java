/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6_deber;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class Pares {

    private int n;
    private int pares;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getPares() {
        return pares;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }

    public void obtenerPares(){
        
        if (n % 2 == 0) {
            pares = pares + n;

        }
        if (n < 2) {
            System.out.println("Error");

        }
    }
}
