package com.programming.app.loop;
import java.util.Scanner;

public class q07 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int i, quantidadePessoas = 5;
    int idade;
    double altura, peso;
    int contadorIdadeSuperior50 = 0, contadorIdadeEntre10E20 = 0, contadorPesoInferior40 = 0;
    double mediaAlturaIdadeEntre10E20, mediaPesoInferior40, somaIdadeEntre10E20 = 0, somaPesoInferior40 = 0; 

    for(i = 1; i <= quantidadePessoas; i++) {
      System.out.println("Digite a idade :");
      idade = input.nextInt();
      System.out.println("Digite o altura :");
      altura = input.nextDouble();
      System.out.println("Digite o peso :");
      peso = input.nextDouble();

      if (idade > 50) {
       contadorIdadeSuperior50++;
      }
      if (idade >= 10 && idade <= 20) {
        somaIdadeEntre10E20+=altura;
        contadorIdadeEntre10E20++;
      }
      if (peso < 40) {
        somaPesoInferior40+=peso;
        contadorPesoInferior40++;
      }

    }

   mediaAlturaIdadeEntre10E20 = somaIdadeEntre10E20 / contadorIdadeEntre10E20;  
   mediaPesoInferior40 = (somaPesoInferior40 * 100.0) / contadorPesoInferior40;

    System.out.println("Quantidade de pessoas superior a 50 : " + contadorIdadeSuperior50);
    System.out.println("Media das altura da idade entre 10 e 20 : " + mediaAlturaIdadeEntre10E20);
    System.out.println("Porcentagem de pessoas com peso inferior a 40Kg : " + mediaPesoInferior40);


    input.close();

  }
}
