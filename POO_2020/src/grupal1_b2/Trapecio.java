/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal1_b2;

/**
 *
 * @author Claudio
 */
public class Trapecio extends EjecutaFigurasGeometricas{
    private double area;
    private double altura;
    private double baseMayor;
    private double baseMenor;
    private String nombre;

    public Trapecio(double altura, double baseMayor, double baseMenor, String nombre) {
        this.altura = altura;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
    
    public void areaTotalTrapecio (){
        area = ((baseMayor + baseMenor)*altura)/2;
    }
}
