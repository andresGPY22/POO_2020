/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculo objVehiculo = new Vehiculo();
        System.out.println("REGISTRO DE DATOS PARA VEHICULO COMPETIDOR");
        System.out.println("Ingrese el nombre del piloto");
        String nombre = teclado.nextLine();//receptamos el valor de la variable nombre
        objVehiculo.setPiloto(nombre);
        System.out.println("Ingrese la placa del vehiculo");
        objVehiculo.setPlaca(teclado.nextLine());//obtenemos el valor desde el teclado y lo establecemos en placa
        System.out.println("Ingrese velocidad del vehiculo");
        objVehiculo.setVelocidad(teclado.nextDouble());//obtener el valor de tipo double por teclado y lo establecemos en velocidad
        
        System.out.println("FICHA DE REGISTRO DEL VEHICULO");
        System.out.println("Piloto:  "+objVehiculo.getPiloto());
        System.out.println("Placa: "+ objVehiculo.getPlaca());
        System.out.println("Velocidad llegada:"+objVehiculo.getVelocidad()+"km/s");
        
        System.out.println("CREACION DE UN SEGUDO OBJETO");
        Vehiculo objVehiculo2 = new Vehiculo();
        objVehiculo2.setPiloto("José");
        System.out.println("Nombre del piloto: "+objVehiculo2.getPiloto());
    }
}
