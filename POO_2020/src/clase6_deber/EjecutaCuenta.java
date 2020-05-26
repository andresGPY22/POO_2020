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
public class EjecutaCuenta {
   public static void main(String[] args) {
        String cuentaHabiente;
        String cadena="";
        double saldoI;
        int movimiento;
        int i = 0;
        char desea = 'n' ;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("ESTADO DE CUENTA");   
        System.out.println("Ingrese la Cuenta Habiente: ");
        cuentaHabiente = teclado.nextLine();
        System.out.println("Ingrese el Saldo Inicial de la cuenta: ");
        saldoI = teclado.nextDouble();
        
        do{
            
            
            System.out.println("Ingrese el (1)Si desea realizar un retiro o (2) si desea realizar un depósito");
            movimiento = teclado.nextInt();
            Cuenta objCuenta = new Cuenta(cuentaHabiente, saldoI,movimiento );
            objCuenta.calcularSaldoFinal();
            i++;
            cadena = cadena + ("Movimiento: "+ i +"\nDepósito: "+ objCuenta.getDeposito() +"\nRetiro: "+objCuenta.getRetiro()+"\nSaldo: "+objCuenta.getSaldoFinal()+"\n");
            
            System.out.println("¿Desea Ingresar otro Movimiento? s/n");
            desea = teclado.next().toLowerCase().charAt(0);
        }while(desea == 's');
        System.out.println("Cuenta Habiente :"+cuentaHabiente+"\nSaldoIncial: "+saldoI+"\n");
        System.out.println(cadena);
    }
}
 

