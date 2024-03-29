package tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Runnable r = new MyThread();
        for(int i = 0; i < 10; i++)
        {
            exec.submit(r);
        }
        exec.shutdown();
    }
}
