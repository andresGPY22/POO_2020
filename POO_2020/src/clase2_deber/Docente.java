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
public class Docente {
    private String trabajar;
    private String enseñar;
    private String innovar;
    private String mejorar;
    private String estudiar;
    private String ayudar;
    private String revisar;
    
    // Vamor a encapsular los atributos
    
    public String obtener_trabajar(){
        return trabajar;
    }
    
    
    public String obtener_enseñar(){
        return enseñar;
    }
    
   
    public String obtener_innovar(){
        return innovar;
    }
    
    public String obtener_mejorar(){
        return mejorar;
    }
    
    public String obtener_estudiar(){
        return estudiar;
    }
    public String obtener_ayudar(){
        return ayudar;
    }
    public String obtener_revisar(){
        return revisar;
    }
    
    public void establecer_trabajar(String valor_trabajar){
       trabajar = valor_trabajar; 
    }
    
    public void establecer_enseñar(String valor_enseñar){
       enseñar = valor_enseñar; 
    }
   
    public void establecer_innovar(String valor_innovar){
       innovar = valor_innovar;  
    }
    public void establecer_mejorar(String valor_mejorar){
       mejorar = valor_mejorar;
    }
    public void establecer_estudiar(String valor_estudiar){
       estudiar = valor_estudiar;
    }
    public void establecer_ayudar(String valor_ayudar){
       ayudar = valor_ayudar;    
    }   
    public void establecer_revisar(String valor_revisar){
       revisar = valor_revisar;
    }
    
    
    public void obtener_acciones(){
       String acciones = "-"+trabajar +"\n-"+ enseñar +"\n-"+ innovar +"\n-"+
               mejorar +"\n-"+ estudiar +"\n-"+ ayudar +"\n-"+ revisar;
       System.out.println("El Docente realiza las siguientes acciones: \n"
               + acciones);
    } 
}
