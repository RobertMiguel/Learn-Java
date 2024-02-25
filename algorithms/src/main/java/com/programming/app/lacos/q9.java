package com.programming.app.lacos;

import java.util.Scanner;

public class q9 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int contadorPeso90Altura150 = 0, contadorIdade10Altura190 = 0; 
    int totalIdade = 0; 

    for (int i = 1; i <= 10; i++) {
      System.out.println("Digite a sua idade :");
      int idade = input.nextInt();
      System.out.println("Digite o peso :");
      double peso = input.nextDouble();
      System.out.println("Digite a altura :");
      double altura = input.nextDouble();

      if (peso < 90 && altura < 1.50) {
        contadorPeso90Altura150++;
      }
      if (idade >= 10 && idade <= 30 && altura > 1.90) {
        contadorIdade10Altura190++; 
      }

      totalIdade+=idade;

    }

    double media = totalIdade / 10;
    double porcentagemIdade10Altura90 = (contadorIdade10Altura190 * 100.0) / 10;

    System.out.println("Média das idades das dez pessoas : " + media);
    System.out.println("Quantidades de pessoas com peso superior a 90 e com altura inferior a 1.50 metros :" + contadorPeso90Altura150);
    System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos com altura superior a 1.90 metros :" + porcentagemIdade10Altura90);

    input.close();

  }
}
