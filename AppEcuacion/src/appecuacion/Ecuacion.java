package appecuacion;

public class Ecuacion {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double x1(){
        double s1=((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return s1;
        
    }
    
    public double x2(){
        double s2=((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return s2;
    }
    
}
