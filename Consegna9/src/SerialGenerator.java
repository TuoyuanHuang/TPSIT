class SerialGenerator {
    private int serial = 0;

    public synchronized int getNext() {
        return ++serial;
    }
}
