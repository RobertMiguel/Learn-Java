package com.programming.app.arrays;

import java.util.Scanner;

public class q02 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int i, j, k;
    double valorUnitario[] = new double[10];
    double quantidadeVendida[] = new double[10];
    double salario = 545.0;
    double acrescimo = 0.05;
    double valorGeralVendas = 0, valorComissao, salarioFinal;
    int indiceMaisVendido = 0;
    
    for (i = 0; i < 10; i++) {
      System.out.println("Digite o valor unitário do objeto :");
      valorUnitario[i] = input.nextDouble();
      System.out.println("Digite a quantidade vendida :");
      quantidadeVendida[i] = input.nextDouble();
    }

    for (i = 0; i < 10; i++) {
      valorGeralVendas += valorUnitario[i] * quantidadeVendida[i];

      if (quantidadeVendida[i] > quantidadeVendida[indiceMaisVendido]) {
        indiceMaisVendido = i;
      }

      System.out.println("Objeto mais vendido : " + (i + 1));
      System.out.println("Quantidade vendida : " + quantidadeVendida[i]);

    }

    valorComissao =  (valorGeralVendas * acrescimo);
    salarioFinal = salario + valorComissao;

    System.out.println("Valor geral das vendas : " + valorGeralVendas);
    System.out.println("Valor da comissão : " + valorComissao);
    System.out.println("Valor final do salário R$ : " + salarioFinal);
 
    input.close();

  }
}
