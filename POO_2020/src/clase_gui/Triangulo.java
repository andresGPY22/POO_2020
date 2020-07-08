/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_gui;

/**
 *
 * @author Claudio
 */
public class Triangulo {
    private double base;
    private double altura;
    private double area;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void calcularArea(){
        area = base * altura/2;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
