
package clase5_deber;


import java.util.Scanner;


public class EjecutaTerreno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ancho;
        int largo;
        double precio;
        Terreno objTerreno = new Terreno();
        System.out.println("Ingrese el ancho del terreno");
        ancho = teclado.nextInt();
        System.out.println("Ingrese el largo del terreno");
        largo = teclado.nextInt();
        System.out.println("Ingrese el precio del terreno");
        precio = teclado.nextDouble();
        
        objTerreno.setAncho(ancho);
        objTerreno.setLargo(largo);
        objTerreno.setPrecio(precio);
        
        objTerreno.calcularPrecioT();
        
        System.out.println("Ancho: " +ancho);
        System.out.println("Largo: " +largo);
        System.out.println("Precio: "+objTerreno.getPrecioT());
    }
}
