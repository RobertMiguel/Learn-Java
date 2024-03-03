package com.programming.app.hackerrank;

import java.util.Scanner;

/**
 * solution03
 */
public class solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                int term = a;
                for (int k = 0; k <= j; k++) {
                    term += (int) (Math.pow(2, k) * b);
                }
                System.out.print(term + " ");
            }

            System.out.println(); 
        }

        scanner.close();
    }
}

