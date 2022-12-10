package appecuacion2grado;
import java.util.Scanner;

public class AppEcuacion2Grado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ecuacion2Grado e1 = new Ecuacion2Grado();
        Ecuacion2Grado e2 = new Ecuacion2Grado(1,4,4);
        e1.imprimir();
        e2.imprimir();
        System.out.println(e2.toString());
    }
    
}
