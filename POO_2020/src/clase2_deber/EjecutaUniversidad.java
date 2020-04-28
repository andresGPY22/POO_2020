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
public class EjecutaUniversidad {
    public static void main(String[] args) {
        // Creamos un objetos de tipo Universidad
        Universidad universidad =  new Universidad();
        // establecer el valor de la propiedades de la clase Universidad
        universidad.establecer_reflexionar("La Universidad reflexiona las "
                + "enseñanzas en los estudiantes");
        universidad.establecer_enseñar("La Universidad enseña todos los "
                + "aprendizajes a los estudiantes");
        universidad.establecer_utilizar("La Universidad utiliza materiales "
                + "tanto tecnologicos como manuales");
        universidad.establecer_mantener("La Universidad mantiene tanto el "
                + "aprendizaje como de la Universidad misma ");
        universidad.establecer_calificar("La Universidad realiza la acción de "
                + "calificar");
        universidad.establecer_ayudar("La Universidad ayuda a sus estudiantes "
                + "con todas las obligaciones");
        
       
        universidad.obtener_acciones();
        Universidad universidad2 = new Universidad();
}
}
