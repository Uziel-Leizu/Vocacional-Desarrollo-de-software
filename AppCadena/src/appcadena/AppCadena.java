package appcadena;
import java.util.Scanner;

public class AppCadena {

    public static void main(String[] args) {
        Cadena s = new Cadena();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        s.setS(in.nextLine());
        System.out.println("Ingrese la palabra a buscar");
        s.setP(in.nextLine());
        
        System.out.println(s.buscar());
        s.imprimir();
        
        
        
        
        
    }
    
}
