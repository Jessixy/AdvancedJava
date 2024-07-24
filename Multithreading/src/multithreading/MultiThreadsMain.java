package multithreading;

public class MultiThreadsMain {

    public static void main(String[] args) {

        System.out.println("Multithreads");

        MultihreadThing threadThing = new MultihreadThing(1);
        MultihreadThing threadThing2 = new MultihreadThing(1);

        //parallel(threadThing, threadThing2);

        //sequenziell(threadThing, threadThing2);


        start5Threads();

        RunnableMultiThreadThing runMThing = new RunnableMultiThreadThing(1);
        runMThing.run();


    }

    private static void parallel(Thread one, Thread two) {
        // paralell
        one.start();
        two.start();
    }

    private static void sequenziell (Thread one, Thread two) {
        // sequential
        one.run();
        two.run();
    }

    private static void start5Threads () {

        // Start 5 paralell threads
        for (int i = 0; i < 5; i++) {
            MultihreadThing multithread = new MultihreadThing(i);
            multithread.start();
        }

}

    private static void startRunnable () {
        for (int i= 0; i < 5; i++) {
            RunnableMultiThreadThing runMThing = new RunnableMultiThreadThing(i);
            Thread thread = new Thread(runMThing);
            thread.start();
        }
    }


}

