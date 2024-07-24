package multithreading;

public class MultihreadThing extends Thread {
    
    
    private int threadnumber;
    
    public MultihreadThing(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println(i +  " from thread " +  this.threadnumber);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }


}
