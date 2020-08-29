package hw1.P8;

import java.util.HashMap;
import java.util.Map;

public class MemoizationExample {
    public Map<Integer,Integer> memorizeTable = new HashMap<>();
    //Fibonacci with Memoization;
    public int fibonacci(int n) {
        if (n == 0) { return 0;}
        if (n == 1) { return 1;}
        if (this.memorizeTable.containsKey(n)){
            return this.memorizeTable.get(n);
        }
        int result = fibonacci(n-1) + fibonacci(n-2);
        this.memorizeTable.put(n,result);
        return result;
    }

    public static void main(String[] args) {
        MemoizationExample memoizationExample = new MemoizationExample();
        int testRes = memoizationExample.fibonacci(5);
        System.out.println(testRes);
    }
}
