/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter;

/**
 *
 * @author Ardhipc
 */
public class PH {
    private static double ph;
    private static double titik1=0;
    private static double titik2=5;
    private static double titik3=7;
    private static double titik4=8;
    private static double titik5=10;
    private static double titik6=14;

    public static double getPh() {
        return ph;
    }

    public static void setPh(double ph) {
        PH.ph = ph;
    }
    
    public static double asam(){
        if (ph>=titik1 && ph<=titik2) return 1;
        else if (ph>titik2 && ph<titik3) return (titik3-ph)/(titik3-titik2);
        else return 0;
    }
    public static double optimal(){
        if (ph>titik2 && ph<titik3) return (ph-titik2)/(titik3-titik2);
        else if (ph>=titik3 && ph<=titik4) return 1;
        else if (ph>titik4 && ph<titik5) return (titik5-ph)/(titik5-titik4);
        else return 0;
    }
    public static double basa(){
        if (ph>titik4 && ph <titik5) return (ph-titik4)/(titik5-titik4);
        else if (ph>=titik5 && ph <=titik6) return 1;
        else return 0;
    }
}
