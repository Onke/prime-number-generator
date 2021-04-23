package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 100000000;
        BruteForce bruteForce = new BruteForce(n);
        System.out.println();
        FirstOptimisation firstOptimisation = new FirstOptimisation(n);
        System.out.println();
        System.out.printf("Brute force took - %d nanoseconds\n",bruteForce.duration/n);
        System.out.printf("First Optimisation took - %d nanoseconds\n", firstOptimisation.duration/n);
    }


}
