package applinea;

public class Linea {
    private double x1,x2,y1,y2;
    
    public Linea(){
        x1=1;
        x2=1;
        y1=1;
        y2=1;
    }
    
    public Linea(double x1,double y1,double x2, double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    
   
    
    public double pendiente(){
        double m = (y2-y1)/(x2-x1);
        return m;
    }
     @Override
    public String toString(){
        double v = (pendiente()*-x1)+y1;
        String s = "f(x)= "+pendiente()+"X+"+v; 
        return s;
    }
}
