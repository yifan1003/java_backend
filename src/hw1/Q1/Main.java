package hw1.Q1;

public class Main {
    public static void main(String[] args) {
        // method 1
//        Thread t = new Mythread();
//        t.start();
        //method2
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
