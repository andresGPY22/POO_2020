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
public class EjecutaCelular {
     public static void main(String[] args) {
        // Creamos un objetos de tipo Celular
        Celular celular =  new Celular();
        // establecer el valor de la propiedades de la clase Celular
        celular.establecer_llamar("El Celular puede realizar llamadas");
        celular.establecer_mandarMensajes("El Celular puede mandar mensajes a"
                + " cualquier destinatario");
        celular.establecer_tomarFotografias("El Celular puede tomar fotografías"
                + " con la cámara");
        celular.establecer_mandarDocumentos("El Celular puede enviar diversos "
                + "documentos por correo");
        celular.establecer_usoRedes("El Celular puede hacer uso de las"
                + " Redes Sociales");
        
        celular.obtener_acciones();
        Celular celular2 = new Celular();  
}
}
