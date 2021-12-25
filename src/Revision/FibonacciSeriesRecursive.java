package Revision;

import java.util.Scanner;

public class FibonacciSeriesRecursive {
    public static int Fibonacci(int n){
        if (n <= 1)
            return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
