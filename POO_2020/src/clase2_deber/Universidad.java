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
public class Universidad {
    private String reflexionar;
    private String enseñar;
    private String utilizar;
    private String mantener;
    private String ayudar;
    private String calificar;
 
    
    // Vamor a encapsular los atributos
    
    public String obtener_reflexionar(){
        return reflexionar;
    }
    
    public String obtener_enseñar(){
        return enseñar;
    }
   
    public String obtener_utilizar(){
        return utilizar;
    }
    
    public String obtener_mantener(){
        return mantener;
    }
    
    public String obtener_calificar(){
        return calificar;
    }
    public String obtener_ayudar(){
        return ayudar;
    }
    
    public void establecer_reflexionar(String valor_reflexionar){
       reflexionar = valor_reflexionar; 
    }
    
    public void establecer_enseñar(String valor_enseñar){
       enseñar = valor_enseñar; 
    }
   
    public void establecer_utilizar(String valor_utilizar){
       utilizar = valor_utilizar;  
    }
    public void establecer_mantener(String valor_mantener){
       mantener = valor_mantener;
    }
    public void establecer_calificar(String valor_calificar){
       calificar = valor_calificar;
    }
    public void establecer_ayudar(String valor_ayudar){
       ayudar = valor_ayudar;    
    }   
    
    public void obtener_acciones(){
       String acciones = "-"+reflexionar +"\n-"+ enseñar +"\n-"+ utilizar +"\n-"+
               mantener +"\n-"+ calificar +"\n-"+ ayudar;
       System.out.println("La Universidad realiza las siguientes acciones: \n"
               + acciones);
    } 
}
