public class Main {
    public static void main(String[] args) {
        Concorrenza t1= new Concorrenza("t1");
        Concorrenza t2= new Concorrenza("t2");
        Concorrenza t3= new Concorrenza("t3");
        t1.start();
        t2.start();
        t3.start();
        //start per eseguire
        System.out.println("fine processo");

    }
}