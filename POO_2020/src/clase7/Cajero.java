/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Claudio
 */
public class Cajero {

    private double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito > 0) 
            saldo = saldo + deposito;
        

    }

    public void retirar(double retiro) {

        if (saldo >= retiro && retiro > 0) 
            saldo = saldo - retiro;
        

    }
    
    public double consultar_saldo(){
        return saldo;
    }

}
