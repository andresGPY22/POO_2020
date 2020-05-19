/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Claudio
 */
public class Dia {
    private int num;
    private String nombre;

    

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void calcularNum(){
        switch(num){
            case 1 : nombre = "Lunes";
            break;
            case 2 : nombre = "Martes";
            break;
            case 3 : nombre = "Miercoles";
            break;
            case 4 : nombre = "Jueves";
            break;
            case 5 : nombre = "Viernes";
            break;
            case 6 : nombre = "Sábado";
            break;
            case 7 : nombre = "Domingo";
            default: nombre = "Valor Incorrecto";
        }
    }
    
    
}
