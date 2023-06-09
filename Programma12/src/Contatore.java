import java.util.concurrent.Semaphore;

public class Contatore {
    public int cont;
    public Semaphore s = new Semaphore(1);
    public Contatore(int cont){
        this.cont=cont;
    }
    public void incrementa(int n){
        synchronized (this) {
            //prima deve acquisire un lock sull'oggetto this, è implicito che sta sincronizzando rispetto a this
            this.cont = cont + n;
        }
    }
    public void decrementa(int n){
        this.cont=cont-n;
    }
}
