/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_deber;

/**
 *
 * @author Claudio
 */
public class EjecutaComputadora {
    public static void main(String[] args) {
        // Creamos un objetos de tipo Computadora
        Computadora computadora =  new Computadora();
        // establecer el valor de la propiedades de la clase Computadora
        computadora.establecer_aceptarEntradas("La Computadora puede aceptar "
                + "entradas tanto informaticas como externos");
        computadora.establecer_procesarDatos("La Computadora procesa datos "
                + "informaticos");
        computadora.establecer_almacenarDatos("La Computadora alamcena datos "
                + "en la memoria de cualquier tipo");
        computadora.establecer_producirSalidas("La Computadora produce salidas"
                + " informaticas");
        computadora.establecer_encender("La Computadora realiza la acción de "
                + "encender");
        computadora.establecer_apagar("La Computadora realiza la accion de "
                + "apagar");
        
       
        computadora.obtener_acciones();
        Computadora computadora2 = new Computadora();
}
}
