class ConsumerNoSync implements Runnable {
    private SerialGenerator serial;

    public ConsumerNoSync(SerialGenerator serial) {
        this.serial = serial;
    }

    @Override
    public void run() {
        while (true) {

            int i = serial.getNext();
            System.out.println("Consumato: " + i);
        }
    }
}
