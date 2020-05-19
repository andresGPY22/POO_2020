
package clase5_deber;


public class Articulo {
    private String descripcion;
    private int cantidad;
    private double precio;
    private double precioT;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }
    
    public void calcularPrecioT(){
        if(cantidad > 50){
            precioT = precio - (precio*0.15);
        }else{
            precioT = precio;
        }
    }
}
