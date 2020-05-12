
package clase4_deber;

import java.util.Scanner;


public class EjecutaEjercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del prodcuto y la cantidad de articulos");
        Ejercicio1 objCosto = new Ejercicio1(teclado.nextLine(),teclado.nextInt());
        objCosto.setCosto((objCosto.getArticulos()*3.5)+10700);
        System.out.println("REGISTRO DE LOS ARTICULOS");
        System.out.println("Nombre del producto: "+objCosto.getDescripcion());
        System.out.println("Numero de Articulos: "+objCosto.getArticulos());
        System.out.println("Costo Total: "+ objCosto.getCosto());
    }
    
    
}
