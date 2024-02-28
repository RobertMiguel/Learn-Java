package com.programming.app.loop;

import java.util.Scanner;

public class q03 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int i, quantidadePessoas = 8, idade;
    int contadorIdade15 = 0, contadorIdade16a30 = 0, contadorIdade31a45 = 0, contadorIdade46a60 = 0, contadorIdadeAcima60 = 0; 
    double porcentagemUltimaFaixaEtaria, porcentagemPrimeriaFaixaEtaria;

    for(i = 1; i <= quantidadePessoas; i++) {
      System.out.println("Digite a idade :");
      idade = input.nextInt();

      if(idade <= 15) {
        contadorIdade15++;
      } else if(idade >= 16 && idade <= 30) {
        contadorIdade16a30++;
      } else if(idade >= 31 && idade <= 45) {
        contadorIdade31a45++;
      } else if(idade >= 46 && idade <= 60) {
        contadorIdade46a60++;
      } else if(idade > 60) {
        contadorIdadeAcima60++;
      }
    }

    porcentagemPrimeriaFaixaEtaria = (100.0 * contadorIdade15) / quantidadePessoas;
    porcentagemUltimaFaixaEtaria = (100.0 * contadorIdadeAcima60) / quantidadePessoas;

    System.out.println("Quantidadede pessoas na faixa etária até 15 : " + contadorIdade15);
    System.out.println("Quantidadede pessoas na faixa etária entre 16 a 30 : " + contadorIdade16a30);
    System.out.println("Quantidadede pessoas na faixa etária entre 31 a 45 : " + contadorIdade31a45);
    System.out.println("Quantidadede pessoas na faixa etária entre 46 a 60 : " + contadorIdade46a60);
    System.out.println("Quantidadede pessoas na faixa etária acima de 60 : " + contadorIdadeAcima60);

    System.out.println("Porcentagem da primeria faixa etária : " + porcentagemPrimeriaFaixaEtaria);
    System.out.println("Porcentagem da última etária : " + porcentagemUltimaFaixaEtaria);

  }
}
