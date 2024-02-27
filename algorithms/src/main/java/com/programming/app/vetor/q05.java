package com.programming.app.vetor;

import java.util.Scanner;

public class q05 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int i;
    int x[] = new int[10];
    int y[] = new int[10];
    int uniao[] = new int[20];
    int diferenca[] = new int[10];

    int j = 0;

    for (i = 0; i < 10; i++) {
     System.out.println("Digite um número para o vetor 1, na posição : " + (i + 1)); 
     x[i] = input.nextInt();
     uniao[j] = x[i];
     j++;
    }

    for (i = 0; i < 10; i++) {
     System.out.println("Digite um número para o vetor 2, na posição : " + (i + 1)); 
     y[i] = input.nextInt();
     uniao[j] = y[i];
     j++;
    }

    System.out.println("União de vetores :");

    for (int j2 = 0; j2 < uniao.length; j2++) {
      System.out.println(uniao[j2]);
    }

    System.out.println("Diferença de vetores :");

    j = 0;

    for (int j3 = 0; j3 < uniao.length; j3++) {
      if (uniao[j3] == y[j3]) {
        System.out.println("Número repetido!");
      } else {
        diferenca[j3] = uniao[j3];
      }
      j++;
    }

    for (int j4 = 0; j4 < diferenca.length; j4++) {
      System.out.println(diferenca[j4]);
    }

    input.close();

  }
}
