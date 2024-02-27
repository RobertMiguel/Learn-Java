package com.programming.app.arrays;

import java.util.Scanner;

public class q05 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int x[] = new int[10];
    int y[] = new int[10];

    System.out.println("Digite um número para o array 1 :"); 
    for (int i = 0; i < 10; i++) {
     x[i] = input.nextInt();
    }

    System.out.println("Digite um número para o array 2 :"); 
    for (int i = 0; i < 10; i++) {
     y[i] = input.nextInt();
    }

    int uniao[] = new int[20];
    int contadorUniao = 0;

    for (int i = 0; i < 10; i++) {
      boolean encontrado = false;
      for (int j = 0; j < contadorUniao; j++) {
        if (uniao[j] == y[i]) {
          encontrado = true;
          break;
        }
      }

      if (!encontrado) {
        uniao[contadorUniao++] = x[i];
      }

      encontrado = false;

      for (int j = 0; j < 10; j++) {
        if (uniao[j] == y[i]) {
          encontrado = true;
          break;
        }
      }

      if (!encontrado) {
        uniao[contadorUniao++] = y[i];
      }
    }

    System.out.println("União dos arrays :");

    for (int i = 0; i < contadorUniao; i++) {
      System.out.println(uniao[i]);
    }

    int diferenca[] = new int[10];
    int indiceDiferenca = 0;

    for (int i = 0; i < 10; i++) {
      boolean encontrado = false;
      for (int j = 0; j < 10; j++) {
        if (x[i] == y[j]) {
          encontrado = true;
          break;
        }
      }

      if(!encontrado) {
        diferenca[indiceDiferenca++] = x[i];
      }
    }

    System.out.println("Diferença de arrays :");

    for (int i = 0; i < indiceDiferenca; i++) {
      System.out.println(diferenca[i]);
    }

    int produto[] = new int[10];

    for (int i = 0; i < 10; i++) {
      produto[i] = x[i] * y[i];
    }

    System.out.println("Produto de array :");

    for (int i = 0; i < 10; i++) {
      System.out.println(produto[i]);
    }

    int interseccao[] = new int[10];
    int contadorInterseccao = 0;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (x[i] == y[j]) {
         boolean encontrado = false; 
         for (int k = 0; k < contadorInterseccao; k++) {
           if (interseccao[k] == x[i]) {
             encontrado = true;
             break;
           }
         }

         if (!encontrado) {
           interseccao[contadorInterseccao++] = x[i];
         }
        }
      }
    }

    System.out.println("Intersecção dos arrays x e y :");

    for (int i = 0; i < contadorInterseccao; i++) {
      System.out.println(interseccao[i]);
    }

    input.close();

  }
}
