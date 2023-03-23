import java.util.ArrayList;
public class Programma12 {
    public static void main(String[] args) {
        Contatore c = new Contatore(0);
        Concorrenza t1=new Concorrenza("t1", c);
        Concorrenza t2=new Concorrenza("t2", c);
        Concorrenza t3=new Concorrenza("t3", c);
        System. out.println("partenza del processo principale");
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){}
        System.out.println("fine del processo principale");

    }
}
