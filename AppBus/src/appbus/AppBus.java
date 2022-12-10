package appbus;
import java.util.Scanner;



public class AppBus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Asientos L = new Asientos();
        int c=1;
        int lug;
        while (c==1){
            lug= in.nextInt();
            for(int l=0;l<lug;l++){
                System.out.println("Elija uno de los siguientes asientos disponibles");
                L.imprimir();
                
            }
        
        }
    
    }
}
