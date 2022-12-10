package appbus;

public class Asientos {

    private boolean []ocupado = new boolean [13];
    private String []nombre=new String[13];

    public void setOcupado(boolean[] ocupado) {
        this.ocupado = ocupado;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }
    
    

    public void imprimir(){
        System.out.println("asientos disponibles");
        for(int i=0;i<13;i++){
            if(ocupado[i]==false){
                System.out.print(i+1+""+" , ");
            }
        }
    }
    

}