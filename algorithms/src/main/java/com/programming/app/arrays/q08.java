package com.programming.app.arrays;

import java.util.Scanner;

/**
 * q08
 */
public class q08 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int vetor01[] = new int[5];
    int vetor02[] = new int[5];

    System.out.println("Preecha o vetor 1 :");

    for (int i = 0; i < vetor01.length; i++) {
      vetor01[i] = input.nextInt();
    }

    System.out.println("Preecha o vetor 1 :");

    for (int i = 0; i < vetor02.length; i++) {
      vetor02[i] = input.nextInt();
    }



    input.close();

  }
}
