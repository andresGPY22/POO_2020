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
public class EjecutaDocente {
    public static void main(String[] args) {
        // Creamos un objetos de tipo Docente
        Docente docente =  new Docente();
        // establecer el valor de la propiedades de la clase Docente
        docente.establecer_trabajar("El Docente realiza la accion de trabajar");
        docente.establecer_enseñar("El Docente se encarga de enseñar");
        docente.establecer_innovar("El Docente se encarga de innovar ideas");
        docente.establecer_mejorar("El Docente mejora tanto sus habilidades "
                + "como la de los estudiante");
        docente.establecer_estudiar("El Docente estudia para prepararse "
                + "para las clases");
        docente.establecer_ayudar("El Docente se encarga de ayudar a los "
                + "estudiantes");
        docente.establecer_revisar("El Docente revisa las actividades de los "
                + "estudiantes");
       
        docente.obtener_acciones();
        Docente docente2 = new Docente();
}
}
