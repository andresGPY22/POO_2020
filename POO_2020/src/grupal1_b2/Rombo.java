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
public class Rombo extends EjecutaFigurasGeometricas{
    private double area;
    private double diagonalMayor;
    private double diagonalMenor;
    private String nombre;

    public Rombo(double diagonalMayor, double diagonalMenor, String nombre) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
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

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    
    public void areaTotal(){
        area = (diagonalMayor * diagonalMenor)/2;
        
    }
}
