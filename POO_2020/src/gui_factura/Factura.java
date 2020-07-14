/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_factura;

/**
 *
 * @author DELL
 */
public class Factura {
    private String nombre;
    private int cantidad;
    private double valor;
    private double descuento;
    private double subtotal;
    private double iva_12;
    private double toDescuento;
    

    public Factura(String nombre, int cantidad, double valor, double descuento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
        this.descuento = descuento;
    }

  
   
    public void SubtotalTo(){
    subtotal=valor*cantidad;
    }
    public void TotalIva(){
    iva_12=(valor*cantidad)+(0.12*(valor*cantidad));

    }
    public void TotalDescuento(){
        descuento=descuento/100;
       
    toDescuento=((valor*cantidad)+(0.12*(valor*cantidad)) )-descuento*(valor*cantidad);
    }
    
    

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva_12() {
        return iva_12;
    }

    public double getToDescuento() {
        return toDescuento;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
}
