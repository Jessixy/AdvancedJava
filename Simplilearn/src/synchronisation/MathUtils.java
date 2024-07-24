package synchronisation;

public class MathUtils {


    // synchronized keyword  -  to execute one thread at a time
     synchronized void  getMultiples(int n) {

        // synchronized (this)
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);

            try {
                // Pause for 4 seconds
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }


        }
    }




}
