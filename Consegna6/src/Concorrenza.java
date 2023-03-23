public class Concorrenza implements Runnable{
    public String nome;
    public Concorrenza (String nome){
        this.nome=nome;
    }
    public void run(){
        System.out.println("inizio " + this.nome);
        System.out.println("fine " + this.nome);
    }
}
