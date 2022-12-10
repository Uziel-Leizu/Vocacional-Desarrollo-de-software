package appperro;


public class Perrera {
    
    private Perro []jaulas;
    private int k=0;
    public Perrera(int perrera) {
        this.jaulas = new Perro[perrera];
    }
    

   public void alojar(Perro p) {
       
        this.jaulas[k] = p;
        k++;
    }
   
    
    
    
    public void imprimir(){
        for (int i=0;i<jaulas.length;i++){
            System.out.println(jaulas[i].getNombre()+" "+jaulas[i].getNumero());
        }
    }

    boolean estaPerro(String dog) {
        for(int i=0;i<jaulas.length;i++){
            if(jaulas[i].getNombre().equals(dog))
                return true;

        }
        return false;
    }

 




}
