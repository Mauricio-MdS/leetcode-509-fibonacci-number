class Solution {
    public int fib(int n) {
        if (n < 2 ) return n;

        int[] fibonacciSequence = new int[n+1];
        fibonacciSequence[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        return fibonacciSequence[n];
    }
}