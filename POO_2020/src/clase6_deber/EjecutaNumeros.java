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
public class EjecutaNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int i = 1;
        int lim;
        Numeros objNumeros = new Numeros();
        System.out.println("¿Cuántos números va a ingresar?");
        lim = teclado.nextInt();
        
        for (objNumeros.setI(i); i <= lim ; i++) {
            System.out.println("Ingrese un número");
            objNumeros.setN(teclado.nextInt());
            
            objNumeros.obtenerN();
            
            
            
        }
        System.out.println("El Número mayor es: "+ objNumeros.getMayor());
        System.out.println("El Número menor es: "+ objNumeros.getMenor());
        
    }
}
