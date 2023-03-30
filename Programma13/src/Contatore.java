import java.util.concurrent.Semaphore;

public class Contatore {
    public int cont;
    public Contatore(int cont){
        this.cont=cont;
    }
    public void incrementa(int n){
        synchronized (this) {
            this.cont = cont + n;
        }
    }
    public void decrementa(int n){
        synchronized (this) {
            this.cont = cont - n;
        }
    }
}
