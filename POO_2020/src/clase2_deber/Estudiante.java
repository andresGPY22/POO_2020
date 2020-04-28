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
public class Estudiante {
    private String interactivo;
    private String espontaneo;
    private String resolver;
    private String criticar;
    private String competir;
    private String reconocer;
    private String estudiar;
    
    // Vamor a encapsular los atributos
    
    public String obtener_interactivo(){
        return interactivo;
    }
    
    
    public String obtener_espontaneo(){
        return espontaneo;
    }
    
   
    public String obtener_resolver(){
        return resolver;
    }
    
    public String obtener_criticar(){
        return criticar;
    }
    
    public String obtener_competir(){
        return competir;
    }
    public String obtener_reconocer(){
        return reconocer;
    }
    public String obtener_estudiar(){
        return estudiar;
    }
    
    public void establecer_interactivo(String valor_interactivo){
       interactivo = valor_interactivo; 
    }
    
    public void establecer_espontaneo(String valor_espontaneo){
       espontaneo = valor_espontaneo; 
    }
   
    public void establecer_resolver(String valor_resolver){
       resolver = valor_resolver;  
    }
    public void establecer_criticar(String valor_criticar){
       criticar = valor_criticar;
    }
    public void establecer_competir(String valor_competir){
       competir = valor_competir;
    }
    public void establecer_reconocer(String valor_reconocer){
       reconocer = valor_reconocer;    
    }   
    public void establecer_estudiar(String valor_estudiar){
       estudiar = valor_estudiar;
    }
    
    
    public void obtener_acciones(){
       String acciones = "-"+interactivo +"\n-"+ espontaneo +"\n-"+ resolver +"\n-"+
               criticar +"\n-"+ competir +"\n-"+ reconocer +"\n-"+ estudiar;
       System.out.println("El Estudiante realiza las siguientes acciones: \n"
               + acciones);
    }
}
