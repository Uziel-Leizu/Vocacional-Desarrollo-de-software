package apptriangulo;
import java.util.Scanner;


public class AppTriangulo {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Triangulo t1 = new Triangulo();
        System.out.println("Ingresa la base= ");
        t1.setBase(in.nextFloat());
        System.out.println("Ingresa la Altura= ");
        t1.setAltura(in.nextFloat());
        System.out.println("Area es igual= "+t1.calcularArea());
        System.out.println(t1.getAltura()+"\n"+t1.getBase());
        
        
    }
    
}
