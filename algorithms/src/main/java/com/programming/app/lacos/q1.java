package com.programming.app.lacos;

import java.util.Scanner;

public class q1 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int valor01 = 0, valor02 = 0, valor03 = 0, valor04 = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.println("Digite o valor do número 1° :");
      valor01 = input.nextInt();
      System.out.println("Digite o valor do número 2° :");
      valor02 = input.nextInt();
      System.out.println("Digite o valor do número 3° :");
      valor03 = input.nextInt();
      System.out.println("Digite o valor do número 4° :");
      valor04 = input.nextInt();

      if(valor01 > valor02) {
        int valorMaior = valor01;
        int valorMenor = valor02;
        valor01 = valorMenor;
        valor02 = valorMaior;
      }
      if (valor03 > valor04) {
        int valorMaior = valor03;
        int valorMenor = valor04;
        valor03 = valorMenor;
        valor04 = valorMaior;
      }
      if (valor01 > valor03) {
        int valorMaior = valor01;
        int valorMenor = valor03;
        valor01 = valorMenor;
        valor03 = valorMaior;
      }
      if (valor02 > valor04) {
        int valorMaior = valor02;
        int valorMenor = valor04;
        valor02 = valorMenor;
        valor04 = valorMaior;
      }

      System.out.println("Ordem crescente : " + valor01 + " " + valor02 + " " + valor03 + " " + valor04);

    }

  }
}
