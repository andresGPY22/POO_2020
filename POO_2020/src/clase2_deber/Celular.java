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
public class Celular {
    private String llamar;
    private String mandarMensajes;
    private String tomarFotografias;
    private String mandarDocumentos;
    private String usoRedes;
    
    
    // Vamor a encapsular los atributos
    
    public String obtener_llamar(){
        return llamar;
    }
  
    public String obtener_mandarMensajes(){
        return mandarMensajes;
    }
    
    public String obtener_tomarFotografias(){
        return tomarFotografias;
    }
    
    public String obtener_mandarDocumentos(){
        return mandarDocumentos;
    }
    
    public String obtener_usoRedes(){
        return usoRedes;
    }
    
    
    public void establecer_llamar(String valor_llamar){
       llamar = valor_llamar; 
    }
    
    public void establecer_mandarMensajes(String valor_mandarMensajes){
       mandarMensajes = valor_mandarMensajes; 
    }
   
    public void establecer_tomarFotografias(String valor_tomarFotografias){
       tomarFotografias = valor_tomarFotografias;  
    }
    public void establecer_mandarDocumentos(String valor_mandarDocumentos){
       mandarDocumentos = valor_mandarDocumentos;
    }
    public void establecer_usoRedes(String valor_usoRedes){
       usoRedes = valor_usoRedes;
    }
    
    
    public void obtener_acciones(){
       String acciones = "-"+llamar +"\n-"+ mandarMensajes +"\n-"
               + tomarFotografias +"\n-"+ mandarDocumentos +"\n-"+ usoRedes ;
       System.out.println("El celular realiza las siguientes acciones: \n"
               + acciones);
    }
}
