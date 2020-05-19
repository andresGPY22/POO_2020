/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author Claudio
 */
public class Empleado {
    private String empleado;
    private int horas;
    private double cuota;
    private double sueldo;
    
    public Empleado(){
        
    }

    public Empleado(String empleado, int horas, double cuota) {
        this.empleado = empleado;
        this.horas = horas;
        this.cuota = cuota;
    }
    
    

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    

    public void setHoras(int horas) {
        this.horas = horas;
    }

    

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCuota() {
        return cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void calcularSueldo(){
        if(horas <= 40){
            sueldo = horas * cuota;
        }else{
            sueldo = (40*cuota)+((horas-40)*(cuota*2)); 
        }
    }
    
    
}

