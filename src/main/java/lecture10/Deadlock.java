package lecture10;

public class Deadlock {
    public static final Object object1 = new Object();
    public static final Object object2 = new Object();

    public static void main(String[] args) {
        DeadLockThread1 dlt1 = new DeadLockThread1();
        DeadLockThread2 dlt2 = new DeadLockThread2();
        dlt1.start();
        dlt2.start();
    }

    private static class DeadLockThread1 extends Thread {
        public void run() {
            synchronized (object1) {
                System.out.println("Thread 1 Locked ");

                System.out.println("Thread 1 Waiting for object1 to unlock ");

                synchronized (object2) {
                    System.out.println("Thread 1 locking 1 amd 2");
                }
            }
        }
    }
    private static class DeadLockThread2 extends Thread {
        public void run() {
            synchronized (object2) {
                System.out.println("Thread 2 Locked object2 ");

                System.out.println("Thread 2 Waiting for object2 to unlock");

                synchronized (object1) {
                    System.out.println("Thread 2 locking 1 and  2");
                }
            }
        }
    }
}