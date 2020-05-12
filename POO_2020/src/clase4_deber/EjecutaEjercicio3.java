
package clase4_deber;

import java.util.Scanner;


public class EjecutaEjercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la Hora: ");
        Ejercicio3 objHoras = new Ejercicio3(teclado.nextInt());
        objHoras.setDias(objHoras.getHoras()/24);
        objHoras.setMinutos(objHoras.getHoras()*60);
        objHoras.setSegundos(objHoras.getHoras()*3600);
        System.out.println("INFORMACION");
        System.out.println(+objHoras.getHoras()+" horas es a "+objHoras.getDias()+" días");
        System.out.println(+objHoras.getHoras()+" horas es a "+objHoras.getMinutos()+" minutos");
        System.out.println(+objHoras.getHoras()+" horas es a "+objHoras.getSegundos()+" segundos");
}
}