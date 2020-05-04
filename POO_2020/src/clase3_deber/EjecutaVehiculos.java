
package clase3_deber;

import java.util.Scanner;


public class EjecutaVehiculos {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculos objVehiculo= new Vehiculos();
        System.out.println("REGISTRO DE VENTA DEL VEHICULO 1");
        System.out.println("Ingrese el Nombre del Comprador:");
        objVehiculo.setDueño(teclado.nextLine());
        System.out.println("Ingrese la Marca del Vehiculo:");
        objVehiculo.setMarca(teclado.nextLine());
        System.out.println("Ingrese la Placa del Vehiculo");
        objVehiculo.setPlaca(teclado.nextLine());
        System.out.println("Ingrese el Kilometraje del Vehiculo");
        objVehiculo.setKilometro(teclado.nextDouble());
        System.out.println("Ingrese el Precio del Vehiculo");
        objVehiculo.setPrecio(teclado.nextDouble());
        
        System.out.println("REGISTRO DE VENTA DEL VEHICULO 2");
        Vehiculos objVehiculo2 = new Vehiculos();
        System.out.println("Ingrese el Nombre del Comprador:");
        teclado.nextLine();
        objVehiculo2.setDueño(teclado.nextLine());
        System.out.println("Ingrese la Marca del Vehiculo:");
        objVehiculo2.setMarca(teclado.nextLine());
        System.out.println("Ingrese la Placa del Vehiculo");
        objVehiculo2.setPlaca(teclado.nextLine());
        System.out.println("Ingrese el Kilometraje del Vehiculo");
        objVehiculo2.setKilometro(teclado.nextDouble());
        System.out.println("Ingrese el Precio del Vehiculo");
        objVehiculo2.setPrecio(teclado.nextDouble());

        
        System.out.println("REGISTRO DE VENTAS DE VEHICULOS");
        System.out.println("Vehiculo 1");
        System.out.println("Nombre del Comprador: "+objVehiculo.getDueño());
        System.out.println("Marca: "+objVehiculo.getMarca());
        System.out.println("Placa: "+objVehiculo.getPlaca());
        System.out.println("Kilometros: "+objVehiculo.getKilometro()+" Km/s");
        System.out.println("Precio: "+objVehiculo.getPrecio());
        System.out.println("--------------------------------------------");

        System.out.println("Vehiculo 2");
        System.out.println("Nombre del Comprador: "+objVehiculo2.getDueño());
        System.out.println("Marca: "+objVehiculo2.getMarca());
        System.out.println("Placa: "+objVehiculo2.getPlaca());
        System.out.println("Kilometros: "+objVehiculo2.getKilometro()+" Km/s");
        System.out.println("Precio: "+objVehiculo2.getPrecio());
        System.out.println("Fin del Registro");
    } 
}
