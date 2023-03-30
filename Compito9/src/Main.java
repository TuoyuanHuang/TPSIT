import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Conc r = new Conc();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.run();
        t2.run();
    }
    public static class Conc implements Runnable{
        int i=0;
        @Override
        public void run() {
            while (true) {
                Semaphore s1 = new Semaphore(1);
                try {
                    s1.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
                System.out.println(i);
                s1.release();
            }
        }
    }
}