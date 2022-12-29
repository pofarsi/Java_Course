package lecture10.section10.Threads;

public class RunnableMethods implements Runnable {
    public static void main(String[] args) {
        RunnableMethods obj = new RunnableMethods();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

