package tasks;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        for(Integer i =0; i < 10; i++) {
            Runnable r = new MyThread(i, lock);
            Thread t = new Thread(r);
            t.setName("Thread" + " " + i);
            t.start();
        }
    }
}
