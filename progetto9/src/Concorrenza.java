public class Concorrenza extends Thread{
    public Concorrenza(String nome){
        //chiamo il costruttore della superclasse
        super(nome); //passo il nome ddel thread
    }
    public void run(){
        // codice del thread
        System.out.println("partenza del thread"+getName());
        System.out.println("fine del thread"+super.getName());
    }
}
