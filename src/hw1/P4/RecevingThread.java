package hw1.P4;

import java.util.LinkedList;
import java.util.Queue;

public class RecevingThread extends Thread {
    CountingSemaphore semaphore = null;
    public RecevingThread(CountingSemaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {

            while (true) {
                this.semaphore.release();
                System.out.println("Receiver is running!");
            }
        } catch (InterruptedException e) {
        }
    }
}