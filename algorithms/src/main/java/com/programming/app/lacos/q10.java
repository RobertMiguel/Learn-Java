package com.programming.app.lacos;

import java.util.Scanner;

public class q10 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int i, quantidadeNumeros = 10, numeros;
    int somaPares = 0, somaPrimo = 0;
    int contadorPrimo = 0, contadorPar = 0;

    for (i = 1; i <= quantidadeNumeros; i++) {
      System.out.println("Digite um número :");
      numeros = input.nextInt(); 
    }

    System.out.println("Total das somas dos números primos é de : " + somaPrimo);
    System.out.println("Total das somas dos números pares é de : " + somaPares);

    input.close();

  }
}
