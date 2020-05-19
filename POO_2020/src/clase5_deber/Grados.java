
package clase5_deber;

public class Grados {

    private String gradosF;
    private String grados1;
    private String grados2;
    private String grados3;
    private double grados1C;
    private double grados2C;
    private double grados3C;
    private double grados;

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public String getGradosF() {
        return gradosF;
    }

    public void setGradosF(String gradosF) {
        this.gradosF = gradosF;
    }

    public String getGrados1() {
        return grados1;
    }

    public void setGrados1(String grados1) {
        this.grados1 = grados1;
    }

    public String getGrados2() {
        return grados2;
    }

    public void setGrados2(String grados2) {
        this.grados2 = grados2;
    }

    public String getGrados3() {
        return grados3;
    }

    public void setGrados3(String grados3) {
        this.grados3 = grados3;
    }

    public double getGrados1C() {
        return grados1C;
    }

    public void setGrados1C(double grados1C) {
        this.grados1C = grados1C;
    }

    public double getGrados2C() {
        return grados2C;
    }

    public void setGrados2C(double grados2C) {
        this.grados2C = grados2C;
    }

    public double getGrados3C() {
        return grados3C;
    }

    public void setGrados3C(double grados3C) {
        this.grados3C = grados3C;
    }

    public void obtenerGrados() {
        if (gradosF.equals("Fharenheit")) {
            grados1 = "Celsius: ";
            grados1C = grados - 32 * (1 / 9);
            grados2 = "Kelvin: ";
            grados2C = grados1C + 273;
            grados3 = "Rankine: ";
            grados3C = grados1C + 460;
        }else{
            if(gradosF.equals("Celsius")){
               grados1 = "Fharenheit: ";
               grados1C = grados * (9 / 5)+32;
               grados2 = "Kelvin: ";
               grados2C = grados + 273.15;
               grados3 = "Rankine: ";
               grados3C = grados + (9 / 5) + 491.67; 
            }else{
                if(gradosF.equals("Kelvin")){
                   grados1 = "Fharenheit: ";
                   grados1C = (grados - 273.15) * (9 / 5) + 32;
                   grados2 = "Celsius: ";
                   grados2C = grados - 273.15;
                   grados3 = "Rankine: ";
                   grados3C = grados * 1.8; 
                }else{
                    if(gradosF.equals("Rankine")){
                        grados1 = "Fharenheit: ";
                        grados1C = grados - 459.7;
                        grados2 = "Celsius: ";
                        grados2C = (grados1C - 491.67)*(5 / 9);
                        grados3 = "Kelvin: ";
                        grados3C = grados1C * 5/9 ;
                    }else{
                        System.out.println("No existe ese Grado");
                    }
                }
            }
        }
    }

}
