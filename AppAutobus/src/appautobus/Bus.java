package appautobus;


public class Bus {
   
    private boolean[] asientos;
    
    public Bus(int n){
        asientos = new boolean[n];
    }

    public void setAsientos(int x) {
        this.asientos[x-1] = true;
        
    }
    
    public void imprimir(){
        System.out.println("asientos disponibles");
        for(int i=0;i<asientos.length;i++){
            if(asientos[i]==false){
                System.out.print(i+1+""+" , ");
                
            }
        }
    }
}
