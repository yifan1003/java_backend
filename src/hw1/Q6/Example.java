package hw1.Q6;

public class Example {
    public static void main(String[] args) throws Exception {
        Thread threadAdd = new AddThread();
        Thread threadDec = new DecThread();
        threadAdd.start();
        threadDec.start();
        threadAdd.join();
        threadDec.join();
        System.out.println(Counter.count);
    }
}
