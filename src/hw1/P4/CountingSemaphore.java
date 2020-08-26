package hw1.P4;

public class CountingSemaphore {
    private Integer signals = 0;
    public synchronized void take() {
        this.signals++;
        this.notifyAll();
    }
    public synchronized void release() throws InterruptedException {
        while(this.signals == 0) {
            this.wait();
        }
        this.signals--;
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException{
        CountingSemaphore countingSemaphore = new CountingSemaphore();
        SendingThread sender = new SendingThread(countingSemaphore);
        RecevingThread receiver = new RecevingThread(countingSemaphore);
        receiver.start();
        sender.start();
    }
}
