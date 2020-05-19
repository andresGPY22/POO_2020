
package clase5_deber;

import java.util.Scanner;


public class EjecutaAngulos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int anguloA;
        int anguloB;
        int anguloC;
        
        Angulos objAngulos = new Angulos();
        System.out.println("Ingrese el Ángulo A del triángulo");
        anguloA = teclado.nextInt();
        System.out.println("Ingrese el Ángulo B del Triángulo");
        anguloB = teclado.nextInt();
        System.out.println("Ingrese el Ángulo C del Triángulo");
        anguloC = teclado.nextInt();
        
        
        objAngulos.setAnguloA(anguloA);
        objAngulos.setAnguloB(anguloB);
        objAngulos.setAnguloC(anguloC);
        
        objAngulos.obtenerAnguloA();
        objAngulos.obtenerAnguloB();
        objAngulos.obtenerAnguloC();
        
        System.out.println("El Angulo A del triangulo es: " +objAngulos.getAnguloFA());
        System.out.println("El Angulo B del triangulo es: " +objAngulos.getAnguloFB());
        System.out.println("El Angulo C del triangulo es: " +objAngulos.getAnguloFC());
    }
}
