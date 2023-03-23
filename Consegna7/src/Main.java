import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int [] i1 = {32,32,55};
        int [] i2 = {32,322,515};
        Vettore v = new Vettore(i1,i2);
        Concorrenza th1=new Concorrenza(v,1,"t1");
        Concorrenza th2=new Concorrenza(v,2,"t2");
        Concorrenza th3=new Concorrenza(v,3,"t3");
        Concorrenza th4=new Concorrenza(v,-1,"t4");
        Thread t1=new Thread(th1);
        Thread t2=new Thread(th2);
        Thread t3=new Thread(th3);
        t1.run();
        t2.run();
        t3.run();
        try {
            t1.join();//aspetto che finisca
            t2.join();
            t3.join();
        }catch (Exception e){};
        System.out.println("fines");
        th4.run();
    }
    public static void GeneraThread(){
        for (int i = 0; i<100; i++){
            Thread s = new Thread("i"+i);
            System.out.println(i);
        }
    }
}