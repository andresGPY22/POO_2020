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
public class EjecutaEstudiante {
   public static void main(String[] args) {
        // Creamos un objetos de tipo Estudiante
        Estudiante estudiante =  new Estudiante();
        // establecer el valor de la propiedades de la clase Estudiante
        estudiante.establecer_interactivo("El Estudiante es interactivo");
        estudiante.establecer_espontaneo("El Estudiante es espontaneo");
        estudiante.establecer_resolver("El Estudiante realiza la acción de resolver");
        estudiante.establecer_criticar("El Estudiante realiza la acción de criticar");
        estudiante.establecer_competir("El Estudinate es competitivo");
        estudiante.establecer_reconocer("El estudiante realiza la acción de reconocer");
        estudiante.establecer_estudiar("El Estudiante realiza la acción de estudiar");
       
        estudiante.obtener_acciones();
        Estudiante estudiante2 = new Estudiante();
    } 
}
