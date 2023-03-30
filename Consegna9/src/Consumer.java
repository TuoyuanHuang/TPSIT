import java.util.concurrent.Semaphore;

class Consumer implements Runnable {
    private SerialGenerator serial;
    private Semaphore semP;
    private Semaphore semC;

    public Consumer(SerialGenerator serial, Semaphore semP, Semaphore semC) {
        this.serial = serial;
        this.semP = semP;
        this.semC = semC;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semC.acquire(); // Acquisiamo il semaforo del consumatore
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = serial.getNext();
            System.out.println("Consumato: " + i);
            semP.release(); // Rilasciamo il semaforo del produttore
        }
    }
}