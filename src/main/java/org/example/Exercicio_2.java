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




