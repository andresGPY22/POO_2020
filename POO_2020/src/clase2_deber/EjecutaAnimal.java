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
public class EjecutaAnimal {
  public static void main(String[] args) {
        // Creamos un objetos de tipo Animal
        Animal animal =  new Animal();
        // establecer el valor de la propiedades de la clase Animal
        animal.establecer_caminar("El Animal realiza la acción de caminar");
        animal.establecer_correr("El Animal realiza la acción de correr");
        animal.establecer_saltar("El Animal realiza la acción de saltar");
        animal.establecer_nadar("El Animal realiza la acción de nadar");
        animal.establecer_comer("El Animal realiza la acción de comer");
        animal.establecer_dormir("El Animal realiza la acción de dormir");
        animal.establecer_flotar("El Animal realiza la acción de flotar");
        animal.establecer_picar("El Animal realiza la acción de picar");
        
        animal.obtener_acciones();
        Animal animal2 = new Animal();  
}
}
