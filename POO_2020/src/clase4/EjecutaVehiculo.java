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
public class EjecutaVehiculo {
    public static void main(String[] args) {
        //Creacion de objeto con constructor por defecto
        /*Vehiculo objVehiculo=new Vehiculo();
        objVehiculo.setPiloto("Andres");
        String piloto = objVehiculo.getPiloto();
        System.out.println("El NOmbre del Piloto es: "+piloto);*/
        
        //Vehiculo objVehiculo2= new Vehiculo("ECU-389", "Andres");
        //String piloto = objVehiculo2.getPiloto();
        //System.out.println("El nombre del piloto es: "+piloto);
        
        //Inicializamos la velocidad y la placa
        Vehiculo objVehiculo3 = new Vehiculo(120, "ARE-598");
        objVehiculo3.setPiloto("Andres");
        System.out.println("El nombre del piloto es: "+objVehiculo3.getPiloto());
    }
}
