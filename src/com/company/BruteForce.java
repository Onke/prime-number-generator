package com.company;

public class BruteForce {
    int[] primeNumbers;
    long duration;
    public BruteForce(int n) {
        primeNumbers = new int[n];
        long nanos = System.nanoTime();
        generatePrimes(n);
        duration = System.nanoTime() - nanos;
        //displayPrimes();
    }

    private int[] generatePrimes(int n) {
        primeNumbers[0] = 2;
       int index = 1;
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                primeNumbers[index++] = i;
            }
        }
        return primeNumbers;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private void displayPrimes(){
        for(int prime : primeNumbers)
            if(prime != 0)
            System.out.print(prime + ", ");
    }
}
