package com.programming.app.arrays;

import java.util.Scanner;

/**
 * q07
 */
public class q07 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int vetor[] = new int[8];

    System.out.println("Preencha o vetor :");

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = input.nextInt();
    }

    for (int i = 0; i < vetor.length; i++) {
      for (int j = 0; j < vetor.length - i - 1; j++) {
        if (vetor[j] > vetor[j + 1]) {
          int temp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = temp;
        }
      }
    }

    System.out.println("Ordem crescente :");

    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }

    input.close();

  }
}
