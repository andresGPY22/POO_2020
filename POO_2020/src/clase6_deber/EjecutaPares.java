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
public class EjecutaPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int i;
        int lim;
        
        double promedio;
        System.out.println("¿Cuántos números va a ingresar?");
        lim = teclado.nextInt();
        Pares objPares = new Pares();
        for (i = 1; i <= lim ; i++) {
            System.out.println("Ingrese un número");
            objPares.setN(teclado.nextInt());
            
            objPares.obtenerPares();
              
        }
        promedio = objPares.getPares() / lim;
        System.out.println("El promedio de todo los pares es de: "+ promedio);

        
    }
    
    
    
    
 
}
