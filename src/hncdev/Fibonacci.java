package hncdev;

import java.util.Arrays;

public class Fibonacci {

    public long[] calculateFibonacciSeries(int n) {
        long[] fibonacciSeries = new long[n];
        fibonacciSeries[0] = 1;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < fibonacciSeries.length; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        return fibonacciSeries;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long[] myFibonacci = fibonacci.calculateFibonacciSeries(10);
        System.out.println(Arrays.toString(myFibonacci));
    }
}
