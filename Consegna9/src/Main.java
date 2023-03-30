import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        boolean SemaforoAcceso = false;
        SerialGenerator serial = new SerialGenerator();

        if (SemaforoAcceso) {
            Semaphore semP = new Semaphore(1);
            Semaphore semC = new Semaphore(0);

            Producer producer = new Producer(serial, semP, semC);
            Consumer consumer = new Consumer(serial, semP, semC);
            Thread producerT = new Thread(producer);
            Thread consumerT = new Thread(consumer);
            producerT.start();
            consumerT.start();
        } else {
            ProducerNoSync producer = new ProducerNoSync(serial);
            ConsumerNoSync consumer = new ConsumerNoSync(serial);
            Thread producerT = new Thread(producer);
            Thread consumerT = new Thread(consumer);
            producerT.start();
            consumerT.start();
        }
    }
}