/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Claudio
 */
public class Vehiculo {
    private int velocidad;
    private String placa;
    private String piloto;
    
    public Vehiculo(){
    }
    /*Inicializar valores a los atributos de nuestra clase*/
    public Vehiculo(String placa, int velocidad, String piloto){
        this.placa = placa;
        this.velocidad = velocidad;
        this.piloto = piloto; 
    }
    /*Metodo construcotr para incializar solamente placa y piloto*/
    public Vehiculo(String placa, String piloto){
        this.placa = placa;
        this.piloto = piloto;
                
    }
    
    public Vehiculo(String placa, int velocidad){
        this.placa = placa;
        this.velocidad= velocidad;
    }
    
    public Vehiculo(int velocidad, String placa){
        this.velocidad = velocidad;
        this.placa = placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    
}
