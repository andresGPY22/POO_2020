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
public class EjecutaVector {
    public static void main(String[] args) {
        int vectA[] = new int[10];
        int vectB[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS PARA EL VECTOR A");
        for (int indice = 0; indice < vectA.length; indice++) {
            System.out.println("Ingrese elemento para la posicion ["+indice+"]");
            vectA[indice] = teclado.nextInt();
            teclado.nextLine();
            
        }
        System.out.println("INGRESO DE DATOS PARA EL VECTOR B");
        for (int indice = 0; indice < vectB.length; indice++) {
            System.out.println("Ingrese elemento para la posicion ["+indice+"]");
            vectB[indice] = teclado.nextInt();
            teclado.nextLine();
            
        }
        Vector obj = new Vector();
        obj.setVectorA(vectA);
        obj.setVectorB(vectB);
        obj.calcularProducto();
        
        for (int indice = 0; indice < vectA.length; indice++) {
            System.out.println("VECTOR A["+vectA[indice]+"] x VECTOR B["+vectB[indice]+"] = "+(vectA[indice]*vectB[indice]));
            
        }
        System.out.println("La Sumatoria de los prodcutos: "+obj.getProducto());
    }
}
