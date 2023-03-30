import java.util.concurrent.Semaphore;

public class Concorrenza2 extends Thread{
    public Contatore cont;
    public Concorrenza2 (String nome, Contatore c){
        super(nome);
        this.cont=c;
    }

    public void run(){
        System.out.println("partenza del thread " + getName ());
        int n = (int)(Math.random()*10);
        this.cont.decrementa(n);
        System.out.println("il thread " + getName() + " decrementa di " +n);
        System.out.println("rine del thread " + getName());

    }
}
