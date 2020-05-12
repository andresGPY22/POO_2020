
package clase4_deber;

import java.util.Scanner;


public class EjecutaEjercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el Tiempo para comprobar");
        Ejercicio5 objTiempo = new Ejercicio5(teclado.nextInt());
        objTiempo.setDistancia((objTiempo.getTiempo()*300000));
        System.out.println("REGISTRO DE DISTANCIA RECORRIDA");
        System.out.println("Tiempo:: "+objTiempo.getTiempo()+" segundos");
        System.out.println("Distancia Recorrida: "+objTiempo.getDistancia()+" km/s");

}
}