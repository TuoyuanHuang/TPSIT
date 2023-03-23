import java.util.Arrays;

public class Vettore {
    public int [] a;
    public int [] b;
    public int [] c;

    public Vettore (int [] a, int [] b){
        this.a=a;
        this.b=b;
    }

    public void sommaComponente(int indice){
        c[indice]=a[indice]+b[indice];
    }


    @Override
    public String toString() {
        return "Vettore{" +
                "a=" + Arrays.toString(a) +
                ", b=" + Arrays.toString(b) +
                ", c=" + Arrays.toString(c) +
                '}';
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int[] getB() {
        return b;
    }

    public void setB(int[] b) {
        this.b = b;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
        this.c = c;
    }



}
