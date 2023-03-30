import java.util.Random;
public class Concorrenza extends Thread{
    public Contatore cont;
    public Concorrenza (String nome, Contatore c){
        super(nome);
        this.cont=c;
    }

    public void run(){
        stampa();

    }
    public void stampa(){
        System.out.println("hallo");
    }
}