package hw1.Q4;
import java.util.concurrent.*;
public class Main {
    public static void main(String[] args) {
        // build a fixed size threadpool
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
        //close threadpool
        es.shutdown();
    }
}

class Task implements Runnable {
    private final String name;
    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}