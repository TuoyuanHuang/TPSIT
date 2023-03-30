public class Programma13 {
    public static void main(String[] args) {
        Contatore c = new Contatore(0);
        Concorrenza t1=new Concorrenza("t1", c);
        Concorrenza t2=new Concorrenza("t2", c);
        Concorrenza t3=new Concorrenza("t3", c);
        Concorrenza2 t4=new Concorrenza2("t4", c);
        Concorrenza2 t5=new Concorrenza2("t5", c);
        Concorrenza2 t6=new Concorrenza2("t6", c);
        System. out.println("partenza del processo principale");
        t1.start();
        t2.start();
        t3.start();
        t4.run();
        t5.run();
        t6.run();
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){}
        System.out.println("fine del processo principale");

    }
}
