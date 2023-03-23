import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        Concorrenza th1=new Concorrenza("t1");
        Concorrenza th2=new Concorrenza("t2");
        Concorrenza th3=new Concorrenza("t3");

        Thread t1=new Thread(th1);
        Thread t2=new Thread(th2);
        Thread t3=new Thread(th3);

        long start,stop;
        start = System.currentTimeMillis(); //registro il tempo di inizio

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();//aspetto che finisca
            t2.join();
            t3.join();
        }catch (Exception e){};
        System.out.println("fines");
        stop=System.currentTimeMillis();
        double tempo =(double)(stop-start)/1000;
        System.out.println("Tempo: " + tempo);
        GeneraThread();
    }

    public static void GeneraThread(){
        for (int i = 0; i<100; i++){
            Thread s = new Thread("i"+i);
            System.out.println(i);
        }
    }
}