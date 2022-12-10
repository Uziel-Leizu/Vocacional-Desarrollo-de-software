package appecuacion;

import java.util.Scanner;

public class AppEcuacion {

    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        Ecuacion e1=new Ecuacion();
        
        System.out.println("Dame  a");
        e1.setA(var.nextInt());
        System.out.println("Dame  b");
        e1.setB(var.nextInt());
        System.out.println("Dame c");
        e1.setC(var.nextInt());
        System.out.println("x1= "+e1.x1());
        System.out.println("x2= "+e1.x2());
        
    }
    
}
