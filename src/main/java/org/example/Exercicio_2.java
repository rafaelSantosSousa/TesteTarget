package org.example;

import java.util.Scanner;



public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          int a = 0;
          int b = 0;
          int c = 1;
          System.out.println("Digite um número: ");
          int valor = sc.nextInt();

          while (valor > a){
              a = b+c;
              b=c;
              c=a;
          }
          if(valor == 0 || valor ==1) {
            System.out.println("O número faz parte da sequência de Fibonacci.");
        } else if (valor == a) {
                System.out.println ("O número faz parte da sequência de Fibonacci.");
            } else {
            System.out.println ("O número não faz parte da sequência de Fibonacci.");

        }
            }
                }

               //2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

                      //  IMPORTANTE:
                      //  Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;//*