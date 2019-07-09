package tasks;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {
    private Integer number;
    private static Integer a = 1;
    ReentrantLock lock;

    MyThread(Integer i, ReentrantLock lock) {
        this.number = i;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + ": " + a);
        a += 1;
	lock.unlock();
    }
}
