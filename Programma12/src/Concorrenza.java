import java.util.Random;
public class Concorrenza extends Thread{
    public Contatore cont;
    public Concorrenza (String nome, Contatore c){
        super(nome);
        this.cont=c;
    }

    public void run(){
        System.out.println("partenza del thread " + getName ());
        int n = (int)(Math.random()*10);
        this.cont.incrementa(n);
        System.out.println("il thread " + getName() + "incrementa di " +n);
        System.out.println("rine del thread " + getName());

   }
}