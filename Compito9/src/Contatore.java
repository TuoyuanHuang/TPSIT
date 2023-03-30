import java.util.concurrent.Semaphore;

public class Contatore {
    public int cont;
    public Semaphore s = new Semaphore(1);
    public Contatore(int cont){
        this.cont=cont;
    }
    public void incrementa(int n){
        try {
            s.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.cont=cont+n;
        s.release();
    }
    public void decrementa(int n){
        this.cont=cont-n;
    }

}
