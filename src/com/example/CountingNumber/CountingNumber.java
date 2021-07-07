package com.example.CountingNumber;

public class CountingNumber {
    public static void main(String[] args) {
        for (int x = 1; x < 20 ; x = x + 2) {
            System.out.print(" " + x);

        }
        System.out.println();
        System.out.print(" " + 20);
        System.out.println();
        for (int i = 19; i > 0; i = i - 2) {
            System.out.print(" " + i);

        }
    }
}
