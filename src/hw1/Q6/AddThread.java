package hw1.Q6;

public class AddThread extends Thread {
    @Override
    public void run() {
        for ( int i = 0; i < 1000; i ++) {
            synchronized(Counter.lock) {
                Counter.count += 1;
            }
        }
    }
}
