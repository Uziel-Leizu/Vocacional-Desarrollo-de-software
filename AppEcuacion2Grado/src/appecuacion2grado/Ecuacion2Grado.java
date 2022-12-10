package appecuacion2grado;


public class Ecuacion2Grado {
    private double a;
    private double b;
    private double c;


    //constructor por default
    public Ecuacion2Grado(){
        a=1;
        b=1;
        c=1;
    }
    
    public Ecuacion2Grado(double a,double b,double c){ //firma de metodos
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public String toString(){
        String s = a+"X^2+"+b+"X+"+c;
        return s;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    public double raiz1(){
        double r1;
        r1=(-b+Math.sqrt(b*b-4*a*c))/2;
        
        return r1;
    }
    
    public double raiz2(){
        double r2;
        
        r2=(-b+Math.sqrt(b*b-4*a*c))/2;
        
        return r2;
    }
    
    public void imprimir (){
        System.out.println("a= "+a+"\nb= "+b+"\nc= "+c);
    }
    
}
