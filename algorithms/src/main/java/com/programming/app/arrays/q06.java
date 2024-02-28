package com.programming.app.arrays;

import java.util.Scanner;

public class q06 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int vetor[] = new int[10];

    System.out.println("Preencha o vetor ");
    for (int i = 0; i < 10; i++) {
      vetor[i] = input.nextInt();
    }

    for (int i = 0; i < vetor.length - 1; i++) {
      for (int j = 0; j < vetor.length - i - 1; j++) {
        if (vetor[j] > vetor[j + 1]) {
          int temp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = temp;
        }
      }
    }

    System.out.println("Ordem descrecente : "); 
    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }

    input.close();

  }
}
