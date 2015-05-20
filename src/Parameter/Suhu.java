/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter;

/**
 *
 * @author Ardhipc
 */
public class Suhu {
    private static double suhu;
    private static double titik1=0;
    private static double titik2=15;
    private static double titik3=28;
    private static double titik4=30;
    private static double titik5=35;
    private static double titik6=100;

    public static double getSuhu() {
        return suhu;
    }

    public static void setSuhu(double suhu) {
        Suhu.suhu = suhu;
    }
    
    public static double dingin(){
        if (suhu>=titik1 && suhu<=titik2) return 1;
        else if (suhu>titik2 && suhu<titik3) return (titik3-suhu)/(titik3-titik2);
        else return 0;
    }
    public static double optimal(){
        if (suhu>titik2 && suhu<titik3) return (suhu-titik2)/(titik3-titik2);
        else if (suhu>=titik3 && suhu<=titik4) return 1;
        else if (suhu>titik4 && suhu<titik5) return (titik5-suhu)/(titik5-titik4);
        else return 0;
    }
    public static double panas(){
        if (suhu>titik4 && suhu <titik5) return (suhu-titik4)/(titik5-titik4);
        else if (suhu>=titik5 && suhu <=titik6) return 1;
        else return 0;
    }
}
