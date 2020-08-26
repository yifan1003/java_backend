package hw1.P4;

public class SendingThread extends Thread{
    CountingSemaphore countingSemaphore = null;
    public SendingThread(CountingSemaphore semaphore) {
        this.countingSemaphore = semaphore;
    }
    @Override
    public void run() {
//        int i = 0;
        while(true) {
            System.out.println("Sender is running!");
            this.countingSemaphore.take();
//            i++;
        }
    }
}
