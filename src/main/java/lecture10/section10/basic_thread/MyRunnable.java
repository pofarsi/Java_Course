package lecture10.section10.basic_thread;


import static lecture10.section10.basic_thread.ThreadColor.ANSI_GREEN;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "MyRunnable class ");
    }
}
