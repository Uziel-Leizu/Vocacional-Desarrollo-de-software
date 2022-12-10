package appperro;

public class AppPerro {

    public static void main(String[] args) {
        Perro p= new Perro("fifi",5);
        Perro p2 = new Perro("dog",7);
        Perrera casa = new Perrera (5);
        casa.alojar(p);
        casa.alojar(p2);
        String nombre="perro";
        Perro[] perros = new Perro[3];
        for (int i=0;i<3;i++){
            perros[i]=new Perro(nombre+i, (int) (Math.random()*10));
            casa.alojar(perros[i]);
        }
        casa.imprimir();
        if(casa.estaPerro("dog"))
            System.out.println("si esta");
        else 
            System.out.println("no esta");
        
    }
    
}
