
package clase5_deber;

public class Angulos {

    
    private String anguloFA;
    private String anguloFB;
    private String anguloFC;

    public String getAnguloFB() {
        return anguloFB;
    }

    public void setAnguloFB(String anguloFB) {
        this.anguloFB = anguloFB;
    }

    public String getAnguloFC() {
        return anguloFC;
    }

    public void setAnguloFC(String anguloFC) {
        this.anguloFC = anguloFC;
    }
    private int anguloA;
    private int anguloB;
    private int anguloC;

    public String getAnguloFA() {
        return anguloFA;
    }

    public void setAnguloFA(String anguloFA) {
        this.anguloFA = anguloFA;
    }

    public int getAnguloA() {
        return anguloA;
    }

    public void setAnguloA(int anguloA) {
        this.anguloA = anguloA;
    }

    public int getAnguloB() {
        return anguloB;
    }

    public void setAnguloB(int anguloB) {
        this.anguloB = anguloB;
    }

    public int getAnguloC() {
        return anguloC;
    }

    public void setAnguloC(int anguloC) {
        this.anguloC = anguloC;
    }

    

    public void obtenerAnguloA() {
        if (anguloA == 90) {
            anguloFA = "Rectangulo";
        } else {
            if (anguloA > 90 && anguloA <= 180) {
                anguloFA = "Obtusángulo";
            } else {
                anguloFA = "Acutángulo";
            }
        
        }}
    public void obtenerAnguloB(){
        
        if (anguloB == 90) {
            anguloFB = "Rectangulo";
        } else {
            if (anguloB> 90 && anguloB <= 180) {
                anguloFB = "Obtusángulo";
            } else {
                anguloFB = "Acutángulo";
            }
        
        }}
    public void obtenerAnguloC(){
        
        if (anguloC == 90) {
            anguloFC = "Rectangulo";
        } else {
            if (anguloC > 90 && anguloC <= 180) {
                anguloFC = "Obtusángulo";
            } else {
                anguloFC = "Acutángulo";
            }
        
        }
    }
}
