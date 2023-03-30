import java.util.concurrent.Semaphore;

class Producer implements Runnable {
    private SerialGenerator serial;
    private Semaphore semP;
    private Semaphore semC;

    public Producer(SerialGenerator serial, Semaphore semP, Semaphore semC) {
        this.serial = serial;
        this.semP = semP;
        this.semC = semC;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semP.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int s = serial.getNext();
            System.out.println("Prodotto: " + s);
            semC.release();
        }
    }
}