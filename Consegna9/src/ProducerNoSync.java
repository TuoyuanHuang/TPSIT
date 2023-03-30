class ProducerNoSync implements Runnable {
    private SerialGenerator serialGen;

    public ProducerNoSync(SerialGenerator serialGen) {
        this.serialGen = serialGen;
    }

    @Override
    public void run() {
        while (true) {
            int serial = serialGen.getNext();
            System.out.println("Prodotto: " + serial);
        }
    }
}
