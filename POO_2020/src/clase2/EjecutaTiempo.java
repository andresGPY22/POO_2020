/*
 * Clase para que permita realizar la creación de objetos a partir de la clase 
Tiempo
 */
package clase2;

/**
 *
 * @author Claudio
 */
public class EjecutaTiempo {
    public static void main(String[] args) {
        // Creamos un objetos de tipo tiempo
        Tiempo tiempo =  new Tiempo();
        // establecer el valor de la propiedades de la clase Tiempo
        tiempo.establecer_hora(10);
        tiempo.establecer_minuto(11);
        tiempo.establecer_segundo(30);
        
        // vamos a obtener el valor de la variable hora 
        int hr = tiempo.obtener_hora();
        System.out.println("hora establecida: "+hr);
        // obteenr hora actual
        tiempo.obtener_hora_actual();
        Tiempo tiempo2 = new Tiempo();
    }
 
}
