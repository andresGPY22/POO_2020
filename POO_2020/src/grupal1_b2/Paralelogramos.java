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
public class Paralelogramos extends EjecutaFigurasGeometricas {
    private double area;
    private double base;
    private double altura;
    private String nombre;

    public Paralelogramos(double base, double altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void areaTotalParalelogramo(){
        area = base * altura;
    }
    
}
