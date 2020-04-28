/*
 * Clase Tiempo, para poder obtener la hora
 */
package clase2;

/**
 * 
 * @author Claudio
 */
public class Tiempo {
    // Variables,atributos, caracterisitcas o propiedades de la clase tiempo
    private int hora;
    private int minuto;
    private int segundo;
    
    // Vamor a encapsular los atributos
    /**
     * Este métododevuelve la hora contenida en hora
     * @return hora 
     */
    public int obtener_hora(){
        return hora;
    }
    
    /**
     * Este método devuelve el valor contenida en minuto
     * @return minuto 
     */
    public int obtener_minuto(){
        return minuto;
    }
    
    /**
     * Este método devuelve el valor contenida en segundos 
     * @return segundo 
     */
    public int obtener_segundo(){
        return segundo;
    }
    /**
     * Método para establecer el valor de la variable hora
     * @param valor_hora 
     */
    public void establecer_hora(int valor_hora){
       hora = valor_hora; 
    }
    /**
     * Método para establecer el valor de la variable minuto
     * @param valor_minuto 
     */
    public void establecer_minuto(int valor_minuto){
       minuto = valor_minuto; 
    }
    /**
     * Método para establecer el valor de la variable segundo
     * @param valor_segundo 
     */
    public void establecer_segundo(int valor_segundo){
       segundo = valor_segundo; 
    }
    /**
     * Metodo para obtener la hora completa actal completa
     */
    public void obtener_hora_actual(){
       String hora_completa = hora + ":" + minuto + ":" + segundo;
       System.out.println("hora actual:"+ hora_completa);
    }
}
