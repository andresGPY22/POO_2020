/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6_deber;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaVentas {
    public static void main(String[] args) {
        String articulo;
        String cadena="";
        double costo;
        char desea = 'n' ;
        
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el Articulo: ");
            articulo = teclado.nextLine();
            System.out.println("Ingrese el Costo del Articulo: ");
            costo = teclado.nextDouble();
            
            
            Ventas objVentas = new Ventas(articulo, costo);
            objVentas.calcularValores();
            
            cadena = cadena + ("Articulo: "+ articulo +"\nCosto de Producción: "+costo+"\nUtilidad: "+objVentas.getUtilidad()+"\nImpuesto: "+objVentas.getImpuesto()+"\nPrecio de Venta: "+objVentas.getPrecio()+"\n");
            
            System.out.println("¿Desea Ingresar otro Articulo? s/n");
            desea = teclado.next().toLowerCase().charAt(0);
        }while(desea == 's');
        System.out.println("PRECIOS DE VENTAS\n");
        System.out.println(cadena);
    }
}
