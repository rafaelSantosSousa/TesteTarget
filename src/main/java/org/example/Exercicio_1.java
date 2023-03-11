package org.example;

import java.util.Scanner;
///Observe o trecho de código abaixo:
//
//int INDICE = 13, SOMA = 0, K = 0;
//
//enquanto K < INDICE faça
//{
//K = K + 1;
//SOMA = SOMA + K;
//}
//
//imprimir(SOMA);
//
//Ao final do processamento, qual será o valor da variável SOMA?
public class Exercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do indíce?");
        int i = sc.nextInt();
        int soma = 0;
        for(int K = 0; K < i; ){
            K = K + 1;
            System.out.println(soma = soma + K);
        }
                }
                        }


