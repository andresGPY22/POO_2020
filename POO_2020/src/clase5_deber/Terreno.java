
package clase5_deber;


public class Terreno {
    private int largo;
    private int ancho;
    private double precio;
    private double precioT;

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public double getPrecio() {
        return precio;
    }

    
    
    public void calcularPrecioT(){
    
    if((ancho*largo) <= 400){
        precioT = precio ;
        
    }else{
        precioT = precio - (precio * 0.1);
    }
}
}