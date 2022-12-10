package applinea;


public class AppLinea {

    public static void main(String[] args) {
        Linea l = new Linea(0,0,5,5);
        System.out.println("La pendiente es "+l.pendiente());
        System.out.println(l.toString());
    }
    
}
