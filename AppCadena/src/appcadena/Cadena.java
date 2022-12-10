package appcadena;

public class Cadena {

    private char c;
    private String s;
    private int l;
    private String cad;
    private String p;
    private int posicion,end;
    private int conta=0;

    public void setS(String s) {
        this.s = s;
    }

    public void setP(String p) {
        this.p = p;
    }

    public int buscar() {
        
        for(int i=0;i<s.length();i++){
            for(int f=0;f<p.length();f++){
                if (s.charAt(i)==p.charAt(f)){
                end = i+1;
                }
                while(f==0){
                if (s.charAt(i)==p.charAt(f)){
                posicion = i;
                
                }
                break;
                }
            }
        }
        cad = s.substring(posicion,end);
        return posicion;
    }

    public void imprimir() {
        int l= s.length();
        System.out.println(s);
        System.out.println("La longitud de la cadena es: "+l);
        System.out.println("La palabra a buscar fue: "+cad);
        System.out.println("Las veces que se encontro la palabra fueron: "+conta);
    }

}
