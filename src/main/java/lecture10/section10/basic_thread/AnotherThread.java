package lecture10.section10.basic_thread;


import static lecture10.section10.basic_thread.ThreadColor.ANSI_BLUE;
import static lecture10.section10.basic_thread.ThreadColor.ANSI_CYAN;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Another Thread is running ");
        System.out.println(ANSI_BLUE + currentThread().getName());

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            System.out.println(ANSI_CYAN + "Another thread in catch block ");
        }
        System.out.println(ANSI_BLUE + "5 second have passed and thread is woke up. ");
    }
}
