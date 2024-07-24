package multithreading;

public class RunnableMultiThreadThing implements Runnable {

    private int threadnumber;

    public RunnableMultiThreadThing(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " Runnable Thread "  + threadnumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
