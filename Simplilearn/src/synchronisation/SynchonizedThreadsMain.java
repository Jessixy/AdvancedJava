package synchronisation;

import org.w3c.dom.ls.LSOutput;

public class SynchonizedThreadsMain {

    public static void main(String[] args) {

        System.out.println("Synchronization");

        MathUtils obj = new MathUtils();

        Thread1 t1 = new Thread1(obj);
        Thread t2 = new Thread(new Thread2(obj));
        t1.start();
        t2.start();

    }
}
