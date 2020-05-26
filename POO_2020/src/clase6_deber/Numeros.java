/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6_deber;

/**
 *
 * @author Claudio
 */
public class Numeros {

    private int n;
    private int mayor;
    private int menor;
    private int i ;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    

    
    

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public void obtenerN() {
        if (i == 1){
            
        menor = n;
        }
        if (n > mayor) {
            mayor = n;

        }
        if (n < menor) {
            menor = n;

        }

    }
}
