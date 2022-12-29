package lecture10.section10.basic_thread;


import static lecture10.section10.basic_thread.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "First thread is running 'main' ");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("**** anotherThread with setName ****");
        anotherThread.start();
//        if we call run methods directly we do not get thread we get main thread.
//        anotherThread.run();

        new Thread() {
            public void run() {
                System.out.println(ANSI_RED + "anonymous class no running ");
            }
        }.start();
        // we can write the code above like this.
        new Thread(() -> System.out.println(ANSI_RED + "anonymous class no running ")).start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        // we can use anonymous class as well here

        Thread mySecondRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "myRunnableThread is an anonymous class.");
            }
        });
        mySecondRunnableThread.start();

        // sometimes code below is going to be print after Another Thread.
        System.out.println(ANSI_PURPLE + "After Another Thread that running ");

//        anotherThread.start(); we are going to get an error
    }
}

//Because threads run at the same time as other parts of the program,there is no way to know in which order
// the code will run. The problems that result from this are called concurrency problems. To avoid concurrency problems
// we use isAlive()

//public class Main extends Thread {
//    public static int amount = 0;
//
//    public static void main(String[] args) {
//        Main thread = new Main();
//        thread.start();
//        // Wait for the thread to finish
//        while(thread.isAlive()) {
//            System.out.println("Waiting...");
//        }
//        // Update amount and print its value
//        System.out.println("Main: " + amount);
//        amount++;
//        System.out.println("Main: " + amount);
//    }
//    public void run() {
//        amount++;
//    }
//}
