
package clase5_deber;

import java.util.Scanner;


public class EjecutaArticulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precio;
        Articulo objArticulo = new Articulo();
        System.out.println("Ingrese el nombre del articulo");
        descripcion = teclado.nextLine();
        System.out.println("Ingrese la cantidad a pedir");
        cantidad = teclado.nextInt();
        System.out.println("Ingrese el precio unitario del articulo");
        precio = teclado.nextDouble();
        
        objArticulo.setDescripcion(descripcion);
        objArticulo.setCantidad(cantidad);
        objArticulo.setPrecio(precio);
        
        objArticulo.calcularPrecioT();
        
        System.out.println("Nombre del Articulo: " +descripcion);
        System.out.println("Cantidad: " +cantidad);
        System.out.println("Precio Unitario : "+objArticulo.getPrecioT());
    }
}
