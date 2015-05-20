/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter;

/**
 *
 * @author Ardhipc
 */
public class SurvivalRate {
     private static double survivalRate;
    private static double titik1=0;
    private static double titik2=30;
    private static double titik3=40;
    private static double titik4=60;
    private static double titik5=70;
    private static double titik6=100;

    public static double getSurvivalRate() {
        return survivalRate;
    }

    public static void setSurvivalRate(double survivalRate) {
        SurvivalRate.survivalRate = survivalRate;
    }
    
    public static double Rendah(){
        if (survivalRate>=titik1 && survivalRate<=titik2) return 1;
        else if (survivalRate>titik2 && survivalRate<titik3) return (titik2-survivalRate)/(titik3-titik2);
        else return 0;
    }
    public static double Sedang(){
        if (survivalRate>titik2 && survivalRate<titik3) return (survivalRate-titik2)/(titik3-titik2);
        else if (survivalRate>=titik3 && survivalRate<=titik4) return 1;
        else if (survivalRate>titik4 && survivalRate<titik5) return (titik5-survivalRate)/(titik5-titik4);
        else return 0;
    }
    public static double Tinggi(){
        if (survivalRate>titik4 && survivalRate <titik5) return (survivalRate-titik4)/(titik5-titik4);
        else if (survivalRate>=titik5 && survivalRate <=titik6) return 1;
        else return 0;
    }
    
    public static double Rendah(double t){
//        if (t==0) return t;
//        else if (t==1) return 30;
//        else 
    return (titik3-t*(titik3-titik2));
//       
    }
    public static double Sedang(double t){
//        if (t==0) return t;
//        else if (t==1) return 60;
//        else 
            return (titik3+t*(titik3-titik2));
//        
    }
    public static double Tinggi(double t){
//        if (t==0) return t;
//        else if (t==1) return 100;
//        else 
            return (titik3+t*(titik3-titik2));
    }
}
