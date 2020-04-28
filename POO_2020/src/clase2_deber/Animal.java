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
public class Animal {
    private String caminar;
    private String correr;
    private String saltar;
    private String nadar;
    private String comer;
    private String dormir;
    private String flotar;
    private String picar;
    
    // Vamor a encapsular los atributos
    
    public String obtener_caminar(){
        return caminar;
    }
    
    
    public String obtener_correr(){
        return correr;
    }
    
   
    public String obtener_saltar(){
        return saltar;
    }
    
    public String obtener_nadar(){
        return nadar;
    }
    
    public String obtener_comer(){
        return comer;
    }
    public String obtener_dormir(){
        return dormir;
    }
    public String obtener_flotar(){
        return flotar;
    }
    public String obtener_picar(){
        return picar;
    }
    public void establecer_caminar(String valor_caminar){
       caminar = valor_caminar; 
    }
    
    public void establecer_correr(String valor_correr){
       correr = valor_correr; 
    }
   
    public void establecer_saltar(String valor_saltar){
       saltar = valor_saltar;  
    }
    public void establecer_nadar(String valor_nadar){
       nadar = valor_nadar;
    }
    public void establecer_comer(String valor_comer){
       comer = valor_comer;
    }
    public void establecer_dormir(String valor_dormir){
       dormir = valor_dormir;    
    }   
    public void establecer_flotar(String valor_flotar){
       flotar = valor_flotar;
    }
    public void establecer_picar(String valor_picar){
       picar = valor_picar;
    }
    
    
    public void obtener_acciones(){
       String acciones = "-"+caminar +"\n-"+ correr +"\n-"+ saltar +"\n-"+
               nadar +"\n-"+ comer +"\n-"+ dormir +"\n-"+ flotar+"\n-"+picar;
       System.out.println("El Animal realiza las siguientes acciones: \n"
               + acciones);
    } 
}
