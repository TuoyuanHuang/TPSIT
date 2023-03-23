import java.util.Random;
public class Concorrenza implements Runnable{
    public String nome;
    public Concorrenza (String nome){
        this.nome=nome;
    }
    public void run(){
        System.out.println("inizio " + this.nome);
        Random random = new Random();
        try{
            Thread.sleep(random.nextInt(10)+1);
        }catch (Exception e){};
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*10));//int tra 0 e 9
        System.out.println("fine " + this.nome);
    }
}
