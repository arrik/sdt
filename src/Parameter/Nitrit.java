/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter;

/**
 *
 * @author Ardhipc
 */
public class Nitrit {
    private static double nitrit;
    private static String status;
    private static double titik1=0;
    private static double titik2=0.5;
    private static double titik3=1;
    private static double titik4=2;

    public static double getNitrit() {
        return nitrit;
    }

    public static void setNitrit(double nitrit) {
        Nitrit.nitrit = nitrit;
    }
    public static String getStatus() {
        if (nitrit<=titik2) return status="Nitrit Optimal";
        else if (nitrit>titik2 && nitrit<titik3) return status="Nitrit Sedang";
        else return status="Nitrit Tinggi";
    }
    public static double optimal(){
        if (nitrit>=titik1 && nitrit<=titik2) return 1;
        else if (nitrit>titik2 && nitrit<titik3) return (titik3-nitrit)/(titik3-titik2);
        else return 0;
    }
    public static double tinggi(){
        if (nitrit>titik2 && nitrit<titik3) return (nitrit-titik2)/(titik3-titik2);
        else if (nitrit>=titik3 && nitrit<=titik4) return 1;
        else return 0;
    }
     
}
