package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias em que houve faturamento: ");
        int n = sc.nextInt();
        int d = 0;
        double soma = 0;
        double[] faturadias = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o faturamento para o dia " + (d = (d + 1)) + ":");
            faturadias[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            soma = soma + faturadias[i];
        }
        double media = (soma / n);

        double maiorValor = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (faturadias[i] > maiorValor) {
                maiorValor = faturadias[i];
            }
        }

        double menorValor = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (faturadias[i] < menorValor) {
                menorValor = faturadias[i];
            }
        }


        System.out.println("O valor total do faturamento no mês: " + soma);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maiorValor);
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menorValor);
        System.out.printf("O valor da média mensal é: %.2f", media);


    }
    }