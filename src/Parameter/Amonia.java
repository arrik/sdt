/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter;

/**
 *
 * @author Ardhipc
 */
public class Amonia {
    private static double amonia;
    private static double titik1=0;
    private static double titik2=0.1;
    private static double titik3=0.5;
    private static double titik4=1;

    public static double getAmonia() {
        return amonia;
    }

    public static void setAmonia(double amonia) {
        Amonia.amonia = amonia;
    }
    
    public static double optimal(){
        if (amonia>=titik1 && amonia<=titik2) return 1;
        else if (amonia>titik2 && amonia<titik3) return (titik3-amonia)/(titik3-titik2);
        else return 0;
    }
    public static double tinggi(){
        if (amonia>titik2 && amonia<titik3) return (amonia-titik2)/(titik3-titik2);
        else if (amonia>=titik3 && amonia<=titik4) return 1;
        else return 0;
    }
}
