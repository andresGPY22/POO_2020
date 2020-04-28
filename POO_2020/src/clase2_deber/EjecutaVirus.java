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
public class EjecutaVirus {
    public static void main(String[] args) {
        // Creamos un objetos de tipo Virus
        Virus virus =  new Virus();
        // establecer el valor de la propiedades de la clase Virus
        virus.establecer_bloquear("El Virus bloquea el ordenador");
        virus.establecer_mostrar("El Virus muestra imagenes molestas");
        virus.establecer_destruir("El Virus destruye archivos del disco duro ");
        virus.establecer_reducir("El Virus del espacio del disco duro");
        virus.establecer_eliminacion("El Virus de archivos vitales");
        
        virus.obtener_acciones();
        Virus virus2 = new Virus();
}
}
