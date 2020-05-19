
package clase5_deber;

import java.util.Scanner;

public class EjecutaGrados {
    public static void main(String[] args) {
        String gradosT;
        double grados;
        Scanner teclado = new Scanner(System.in);
        Grados objGrados = new Grados();
        System.out.println("Ingrese el tipo de grado a realizar(ojo la primera letra con mayúscula)");
        gradosT = teclado.nextLine();
        System.out.println("Ingrese el numero de grados a convertir");
        grados = teclado.nextDouble();
        
        objGrados.setGradosF(gradosT);
        objGrados.setGrados(grados);
        
        objGrados.obtenerGrados();
        
        System.out.println("Su Transofrmación es la siguiente");
        System.out.println(objGrados.getGrados1()+ objGrados.getGrados1C()+"°");
        System.out.println(objGrados.getGrados2()+ objGrados.getGrados2C()+"°");
        System.out.println(objGrados.getGrados3()+ objGrados.getGrados3C()+"°");
    }
}
