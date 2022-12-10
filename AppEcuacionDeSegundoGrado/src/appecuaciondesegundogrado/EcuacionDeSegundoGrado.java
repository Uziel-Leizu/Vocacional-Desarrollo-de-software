package appecuaciondesegundogrado;

public class EcuacionDeSegundoGrado {

    private float A;
    private float B;
    private float C;

    public float getA() {
        return A;
    }

    public float getB() {
        return B;
    }

    public float getC() {
        return C;
    }


    public void setA(float A) {
        this.A = A;
    }


    public void setB(float B) {
        this.B = B;
    }


    public void setC(float C) {
        this.C = C;
    }

    public float Raiz1() {
        float x1 = (float) (-B + Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A);
        return x1;
    }

    public float Raiz2() {
        float x2 = (float) (-B + Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A);
        return x2;
    }
}
