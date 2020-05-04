
package clase3_deber;

import java.util.Scanner;


public class EjecutaBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Banco objBanco= new Banco();
        System.out.println("CUENTA BANCARIA 1");
        System.out.println("Ingrese el numero de cuenta:");
        objBanco.setNumeroCuenta(teclado.nextInt());
        System.out.println("Ingrese el valor del saldo de la cuenta:");
        objBanco.setValorSaldo(teclado.nextDouble());
        System.out.println("Ingrese el Nombre del socio de la cuenta");
        teclado.nextLine();
        objBanco.setNombreSocio(teclado.nextLine());
        
        System.out.println("CUENTA BANCARIA 2");
        Banco objBanco2 = new Banco();
        System.out.println("Ingrese el numero de cuenta:");
        objBanco2.setNumeroCuenta(teclado.nextInt());
        System.out.println("Ingrese el valor del saldo de la cuenta:");
        objBanco2.setValorSaldo(teclado.nextDouble());
        System.out.println("Ingrese el Nombre del socio de la cuenta");
        teclado.nextLine();
        objBanco2.setNombreSocio(teclado.nextLine());

        
        System.out.println("Ficha de Registro de Cuentas");
        System.out.println("Número de Cuenta: "+objBanco.getNumeroCuenta());
        System.out.println("Valor del Saldo: "+objBanco.getValorSaldo());
        System.out.println("Nombre del Socio: "+objBanco.getNombreSocio());
        System.out.println("--------------------------------------------");

        System.out.println("Número de Cuenta: "+objBanco2.getNumeroCuenta());
        System.out.println("Valor del Saldo: "+objBanco2.getValorSaldo());
        System.out.println("Nombre del Socio: "+objBanco2.getNombreSocio());
        System.out.println("Fin del Registro");
    }
}
