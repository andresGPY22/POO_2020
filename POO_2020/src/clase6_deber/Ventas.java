/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6_deber;

/**
 *
 * @author Claudio
 */
public class Ventas {
    private String articulo;
    private double costo;
    private double utilidad;
    private double impuesto;
    private double precio;
    

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getPrecio() {
        return precio;
    }

    public Ventas(String articulo, double costo) {
        this.articulo = articulo;
        this.costo = costo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void calcularValores(){
        utilidad = (costo * 0.120);
        impuesto = (costo + utilidad)* 0.15;
        precio = costo + utilidad + impuesto;
    }
}
