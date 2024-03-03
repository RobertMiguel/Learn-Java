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
    int vetor03[] = new int[10];
    int j = 0;

    System.out.println("Preecha o vetor 1 :");

    for (int i = 0; i < vetor01.length; i++) {
      vetor01[i] = input.nextInt();
      vetor03[j] = vetor01[i];
      j++;
    }

    System.out.println("Preecha o vetor 2 :");

    for (int i = 0; i < vetor02.length; i++) {
      vetor02[i] = input.nextInt();
      vetor03[j] = vetor02[i];
      j++;
    }

    for (int i = 0; i < vetor03.length; i++) {
      for (int k = 0; k < vetor03.length - k - 1; k++) {
        if (vetor03[k] > vetor03[k + 1]) {
          int temp = vetor03[k];
          vetor03[k] = vetor03[k + 1];
          vetor03[k + 1] = temp;
        }
      }
    }

    System.out.println("Ordem crescente :");

    for (int i = 0; i < vetor03.length; i++) {
      System.out.println(vetor03[i]);
    }

    input.close();

  }
}
