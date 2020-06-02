/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CAJERO AUTOMATICO POO ");
        System.out.println("Ingrese el saldo Inicial de su cuenta");
        double saldo = teclado.nextDouble();
        Cajero obj = new Cajero(saldo);
        String desea = "si";
        do{
            System.out.println("Digite 1 para Depositar");
            System.out.println("Digite 2 para Retirar");
            System.out.println("Digite 3 para Consultar");
            System.out.println("Digite 4 para Salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese el valor del deposito");
                    double deposito = teclado.nextDouble(); 
                    obj.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Ingrese el valor del retiro");
                    double retiro = teclado.nextDouble();
                    obj.retirar(retiro);
                    break;
                case 3:
                    System.out.println("El saldo de tu cuenta es: "+ obj.consultar_saldo());
                    break;
                case 4: 
                    System.out.println("Gracias por utilizar nuestros servicios");
                    desea = "no";
                    break;
            }
            
            
        }while(desea.toLowerCase().equals("si"));
    }
 
}
