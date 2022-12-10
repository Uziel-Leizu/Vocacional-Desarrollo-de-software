package appecuaciondesegundogrado;
import java.util.Scanner;

public class AppEcuacionDeSegundoGrado {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EcuacionDeSegundoGrado Ec = new EcuacionDeSegundoGrado();
        
        System.out.println("Ingrese el vlor de a: ");
        Ec.setA(in.nextInt());
        System.out.println("Ingrese el vlor de b: ");
        Ec.setA(in.nextInt());
        System.out.println("Ingrese el vlor de c: ");
        Ec.setA(in.nextInt());
        
        System.out.println("El valor de x1= "+Ec.Raiz1()+"\nEl valor de x2= "+Ec.Raiz2());

    }

}
