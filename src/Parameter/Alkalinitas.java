/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter;

/**
 *
 * @author Ardhipc
 */
public class Alkalinitas {
     private static double alkalinitas;
     private static String status;
    private static double titik1=0;
    private static double titik2=50;
    private static double titik3=100;
    private static double titik4=150;
    private static double titik5=200;
    private static double titik6=250;

    public static double getAlkalinitas() {
        return alkalinitas;
    }

    public static void setAlkalinitas(double alkalinitas) {
        Alkalinitas.alkalinitas = alkalinitas;
    }

    public static String getStatus() {
        if (alkalinitas<=titik2) return status="Alkalinitas Sangat Rendah";
        else if (alkalinitas>titik2 && alkalinitas<titik3) return status="Alkalinitas Rendah Sedang";
        else if (alkalinitas>=titik3 && alkalinitas<=titik4) return status="Alkalinitas Optimal";
        else if(alkalinitas>titik4 && alkalinitas<titik5) return status="Alkalinitas Tinggi Sedang";
        else return status="Alkalinitas Sangat Tinggi";
    }
    
    public static double rendah(){
        if (alkalinitas>=titik1 && alkalinitas<=titik2) return 1;
        else if (alkalinitas>titik2 && alkalinitas<titik3) return (titik3-alkalinitas)/(titik3-titik2);
        else return 0;
    }
    public static double optimal(){
        if (alkalinitas>titik2 && alkalinitas<titik3) return (alkalinitas-titik2)/(titik3-titik2);
        else if (alkalinitas>=titik3 && alkalinitas<=titik4) return 1;
        else if (alkalinitas>titik4 && alkalinitas<titik5) return (titik5-alkalinitas)/(titik5-titik4);
        else return 0;
    }
    public static double tinggi(){
        if (alkalinitas>titik4 && alkalinitas <titik5) return (alkalinitas-titik4)/(titik5-titik4);
        else if (alkalinitas>=titik5 && alkalinitas <=titik6) return 1;
        else return 0;
    }
    
}
