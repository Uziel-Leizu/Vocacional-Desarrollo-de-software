package appautobus;

import java.util.Scanner;

public class AppAutobus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cliente cli = new Cliente();
        Bus L = new Bus(14);
        int c=1;
        int lug;
        while (c==1){
            
            System.out.println("Ingrese su nombre: ");
            cli.setNombre(in.nextLine());
            System.out.println("Cuantos lugares desea usar?");
            lug= in.nextInt();
            cli.setAsientos(lug);
            
            
            
            for(int l=0;l<lug;l++){
                System.out.println("Elija uno de los siguientes asientos disponibles");
                L.imprimir();
                System.out.print("\n");
                L.setAsientos(in.nextInt());
                
            }
            L.imprimir();
            
            cli.imprimir();
            System.out.println("Desea usar nuevamente el programa?(1.S/2.N)");
            c=in.nextInt();
            
        in.nextLine();
        }
        
    }
    
}
