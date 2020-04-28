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
public class Virus {
    private String bloquear;
    private String mostrar;
    private String destruir;
    private String reducir;
    private String eliminacion;
    
    
    // Vamor a encapsular los atributos
    
    public String obtener_bloquear(){
        return bloquear;
    }
    
    
    public String obtener_mostrar(){
        return mostrar;
    }
    
   
    public String obtener_destruir(){
        return destruir;
    }
    
    public String obtener_reducir(){
        return reducir;
    }
    
    public String obtener_eliminacion(){
        return eliminacion;
    }
    
    
    public void establecer_bloquear(String valor_bloquear){
       bloquear = valor_bloquear; 
    }
    
    public void establecer_mostrar(String valor_mostrar){
       mostrar = valor_mostrar; 
    }
   
    public void establecer_destruir(String valor_destruir){
       destruir = valor_destruir;  
    }
    public void establecer_reducir(String valor_reducir){
       reducir = valor_reducir;
    }
    public void establecer_eliminacion(String valor_eliminacion){
       eliminacion = valor_eliminacion;
    }
    
    public void obtener_acciones(){
       String acciones = "-"+bloquear +"\n-"+ mostrar +"\n-"+ destruir +"\n-"+
               reducir +"\n-"+ eliminacion ;
       System.out.println("El Virus realiza las siguientes acciones: \n"
               + acciones);
    } 
}
