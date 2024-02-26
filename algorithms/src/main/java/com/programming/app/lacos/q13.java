package com.programming.app.lacos;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {

        int idade;
        int quantidadePessoas = 15;
        int contadorIdade1A10 = 0, contadorIdade11A20 = 0, contadorIdade21A30 = 0, contadorIdadeAcima31 = 0;
        double contadorPeso1A10 = 0, contadorPeso11A20 = 0, contadorPeso21A30 = 0, contadorPesoAcima31 = 0;
        double mediaPeso1A10 = 0, mediaPeso11A20 = 0, mediaPeso21A30 = 0, mediaPesoAcima31 = 0;
        double mediaIdade1A10 = 0, mediaIdade11A20 = 0, mediaIdade21A30 = 0, mediaIdadeAcima31 = 0;
        double peso;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Digite a idade :");
            idade = input.nextInt();
            System.out.println("Digite o peso :");
            peso = input.nextInt();

            if (idade >= 1 && idade <= 10) {
                contadorIdade1A10++;
                contadorPeso1A10 += peso;
            } else if (idade >= 11 && idade <= 20) {
                contadorIdade11A20++;
                contadorPeso11A20 += peso;
            } else if (idade >= 21 && idade <= 30) {
                contadorIdade21A30++;
                contadorPeso21A30 += peso;
            } else {
                contadorIdadeAcima31++;
                contadorPesoAcima31 += peso;
            }
        }

        mediaIdade1A10 = contadorIdade1A10 > 0 ? contadorPeso1A10 / contadorIdade1A10 : 0;
        mediaIdade11A20 = contadorIdade11A20 > 0 ? contadorPeso11A20 / contadorIdade11A20 : 0;
        mediaIdade21A30 = contadorIdade21A30 > 0 ? contadorPeso21A30 / contadorIdade21A30 : 0;
        mediaIdadeAcima31 = contadorIdadeAcima31 > 0 ? contadorPesoAcima31 / contadorIdadeAcima31 : 0;

        System.out.println("Média de idade na faixa etária de 1 a 10 anos : " + mediaIdade1A10);
        System.out.println("Média de idade na faixa etária de 11 a 20 anos : " + mediaIdade11A20);
        System.out.println("Média de idade na faixa etária de 21 a 30 anos : " + mediaIdade21A30);
        System.out.println("Média de idade na faixa etária de Acima 31 anos : " + mediaIdadeAcima31);

        System.out.println("Média do peso na faixa etária de 1 a 10 anos : " + mediaPeso1A10);
        System.out.println("Média do peso na faixa etária de 11 a 20 anos : " + mediaPeso11A20);
        System.out.println("Média do peso na faixa etária de 21 a 30 anos : " + mediaPeso21A30);
        System.out.println("Média do peso na faixa etária de Acima 31 anos : " + mediaPesoAcima31);

        input.close();
    }
}

