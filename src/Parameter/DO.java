/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter;

/**
 *
 * @author Ardhipc
 */
public class DO {
    private static double Do;
    private static String status;
    private static double titik1=0;
    private static double titik2=1;
    private static double titik3=5;
    private static double titik4=8;

    public static double getDo() {
        return Do;
    }

    public static void setDo(double Do) {
        DO.Do = Do;
    }
    public static String getStatus() {
        if (Do<=titik2) return status="DO Rendah";
        else if (Do>titik2 && Do<titik3) return status="DO Sedang";
        else return status="DO Optimal";
    }
    public static double rendah(){
        if (Do>=titik1 && Do<=titik2) return 1;
        else if (Do>titik2 && Do<titik3) return (titik3-Do)/(titik3-titik2);
        else return 0;
    }
    public static double optimal(){
        if (Do>titik2 && Do<titik3) return (Do-titik2)/(titik3-titik2);
        else if (Do>=titik3 && Do<=titik4) return 1;
        else return 0;
    }
    
    public static void getStatusDo(){
        if (Do<=titik2) status="DO Rendah";
        else if (Do>titik2 && Do<titik3) status="DO Sedang";
        else status="DO Optimal";
    } 
}
