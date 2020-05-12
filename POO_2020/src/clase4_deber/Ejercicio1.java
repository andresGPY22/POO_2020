
package clase4_deber;


public class Ejercicio1 {
    private double costo;
    private String descripcion;
    private int articulos;

    public Ejercicio1(String descripcion, int articulos) {
        this.descripcion = descripcion;
        this.articulos = articulos;
    }
    
    
    
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getArticulos() {
        return articulos;
    }

    public void setArticulos(int articulos) {
        this.articulos = articulos;
    } 
}
