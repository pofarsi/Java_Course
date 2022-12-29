package lecture10.section10.Threads;

public class RunMethods extends Thread {
    public static void main(String[] args) {
        RunMethods thread = new RunMethods();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}