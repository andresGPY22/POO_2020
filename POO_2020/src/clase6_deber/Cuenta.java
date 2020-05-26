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
public class Cuenta {
   Scanner teclado = new Scanner(System.in); 
   private String cuentaHabiente;
   private int movimiento;
   private double saldoInicial;
   private double saldoFinal;
   private double retiro;
   private double deposito;

    public Cuenta(String cuentaHabiente, double saldoInicial, int movimiento) {
        this.cuentaHabiente = cuentaHabiente;
        this.movimiento = movimiento;
        this.saldoInicial = saldoInicial;
    }
   

    public String getCuentaHabiente() {
        return cuentaHabiente;
    }

    public void setCuentaHabiente(String cuentaHabiente) {
        this.cuentaHabiente = cuentaHabiente;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
   
    public void calcularSaldoFinal(){
       switch(movimiento){
           case 1 :
               System.out.println("Ingrese el valor del retiro");
               retiro = teclado.nextDouble();
               saldoFinal = saldoInicial - retiro;
               saldoInicial = saldoFinal;
               break;
           case 2 : 
               System.out.println("Ingrese el valor del depósito");
               deposito = teclado.nextDouble();
               saldoFinal = saldoInicial + deposito;
               saldoInicial = saldoFinal;
               break;
           default: System.out.println("No es el valor correcto");
               
       }
       
            
        }
        
}
