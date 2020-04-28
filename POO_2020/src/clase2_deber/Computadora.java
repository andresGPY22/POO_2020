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
public class Computadora {
    private String aceptarEntradas;
    private String procesarDatos;
    private String almacenarDatos;
    private String producirSalidas;
    private String encender;
    private String apagar;
    
    
    // Vamor a encapsular los atributos
    
    public String obtener_aceptarEntradas(){
        return aceptarEntradas;
    }
    
    
    public String obtener_procesarDatos(){
        return procesarDatos;
    }
    
   
    public String obtener_almacenarDatos(){
        return almacenarDatos;
    }
    
    public String obtener_producirSalidas(){
        return producirSalidas;
    }
    
    public String obtener_encender(){
        return encender;
    }
    public String obtener_apagar(){
        return apagar;
    }
    
    
    public void establecer_aceptarEntradas(String valor_aceptarEntradas){
       aceptarEntradas = valor_aceptarEntradas; 
    }
    
    public void establecer_procesarDatos(String valor_procesarDatos){
       procesarDatos = valor_procesarDatos; 
    }
   
    public void establecer_almacenarDatos(String valor_almacenarDatos){
       almacenarDatos = valor_almacenarDatos;  
    }
    public void establecer_producirSalidas(String valor_producirSalidas){
       producirSalidas = valor_producirSalidas;
    }
    public void establecer_encender(String valor_encender){
       encender = valor_encender;
    }
    public void establecer_apagar(String valor_apagar){
       apagar = valor_apagar;    
    }   
    
    
    
    public void obtener_acciones(){
       String acciones = "-"+aceptarEntradas +"\n-"+ procesarDatos +"\n-"
               + almacenarDatos +"\n-"+ producirSalidas +"\n-"+ encender +"\n-"
               + apagar ;
       System.out.println("La Computadora realiza las siguientes acciones: \n"
               + acciones);
    } 
}
