package appautobus;

public class Cliente {
    
    private String nombre;
    private int[] asientos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void setAsientos (int n){
        asientos = new int[n];
    }
    
    public void asientospedidos(){
        for(int i=0;i<asientos.length;i++){
            
        }
    }
    
    public void imprimir (){
            System.out.println("\n");
            System.out.println(nombre+"\nNumero de Asientos: "+""+asientos.length+"");
            for(int g=0;g<asientos.length;g++){
                System.out.println();
            }
        
    }
    
}
