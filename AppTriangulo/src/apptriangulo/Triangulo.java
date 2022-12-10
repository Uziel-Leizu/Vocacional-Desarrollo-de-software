package apptriangulo;

public class Triangulo {

    private float base = 0; 
    private float altura = 0;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    


    public float calcularArea() { 
        return (base * altura) / 2;
    }

    public void imprimir() {
        System.out.println("Base= " +base+"\nAltura= "+altura);
    }

}
