
package clase4_deber;

import java.util.Scanner;


public class EjecutaEjercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el ancho del terreno, la longitud del terreno y el costo del metro cuadrado");
        Ejercicio2 objCosto = new Ejercicio2(teclado.nextDouble(),teclado.nextDouble(),teclado.nextDouble());
        objCosto.setCostoT(objCosto.getAnchura()*objCosto.getLongitud()*objCosto.getCosto());
        System.out.println("INFORMACIÓN DEL TERRENO");
        System.out.println("Ancho del terreno: "+objCosto.getAnchura());
        System.out.println("Largo del Terreno: "+objCosto.getLongitud());
        System.out.println("Costo por metros del Terreno: "+ objCosto.getCosto());
        System.out.println("Costo Total del Terreno:" +objCosto.getCostoT());
}
}
