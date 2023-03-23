import java.util.Random;
public class Concorrenza extends Thread{
    public Vettore v;
    public String nome;
    public int indice;

    public Concorrenza (Vettore v, int indice, String   nome){
        super(nome);
        this.indice=indice;
        this.v=v;
    }


    public void run(){
        if(indice==-1){
            v.toString();
        }else {
            long start, stop;
            double tempo;
            start = System.currentTimeMillis();
            System.out.println("inizio " + getName());
            v.sommaComponente(indice);
            System.out.println("fine " + getName());
            stop = System.currentTimeMillis();
            tempo = (stop - start) / 1000f;
            System.out.println("impiegato " + tempo + "s");
        }
    }
}