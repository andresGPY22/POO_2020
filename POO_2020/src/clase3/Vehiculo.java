/*
 * Esta clase sirve para registrar los datos de los vehiculos en una competición
 */
package clase3;

/**
 *
 * @author Claudio
 */
public class Vehiculo {
    private double velocidad;
    private String placa;
    private String piloto;
    
    /**
     * Metodo para establecer el valor de la velocidad en el atrinuto velocidad
     * @param velocidad 
     */
    public void setVelocidad(double velocidad){
        if(velocidad >0 && velocidad <=300){
            this.velocidad = velocidad;
        }else{
            System.out.println("Velocidad Incorrecta");
        }
         
        
    }
    public double getVelocidad(){
        return velocidad;
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
