package treads;

public class TreadsMain{

    public static void main(String[] args) {
        System.out.println("Threads");

        int n = 10;     // number of threads

        for (int i = 0; i < n; i++) {

            Thread1 thread1 = new Thread1();
            thread1.start();

            Thread thread2 = new Thread(new Thread2());
            thread2.start();

        }
    }
}
