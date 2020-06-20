/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_b2;

/**
 *
 * @author Claudio
 */
public class Vector {
    private int vectorA[] = new int[10];
    private int vectorB[] = new int[10];
    private int producto;
    
    public void calcularProducto(){
        for (int indice = 0; indice < vectorA.length; indice++) {
            producto = producto + (vectorA[indice]*vectorB[indice]);
            
        }
    }

    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
    
    
}
