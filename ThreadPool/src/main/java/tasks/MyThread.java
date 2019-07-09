package tasks;

public class MyThread implements Runnable {
    private static Integer a = 1;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + a);
        a += 1;
    }
}
