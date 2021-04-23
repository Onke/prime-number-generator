package com.company;

public class FirstOptimisation {
    int[] primeNumbers;
    long duration;

    public FirstOptimisation(int n) {
        this.primeNumbers = new int[n/2 + 1];
        long nanos = System.nanoTime();
        generatePrimes(n);
        duration = System.nanoTime() - nanos;
        //displayPrimes(n);
    }

    private void generatePrimes(int n) {
        for (int i = 1; i <= n/2; i+=2)
            primeNumbers[i] = 1;
        primeNumbers[0] = 0;
        primeNumbers[1] = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primeNumbers[i] == 1)
                for (int j = 2; i * j <= n/2; j++) {
                    primeNumbers[i * j] = 0;
                }
        }
    }

    private void displayPrimes(int n) {
        for (int i = 1; i <= n/2; i+=2  )
            if (primeNumbers[i] != 0)
                System.out.print(i + ", ");
    }
}
