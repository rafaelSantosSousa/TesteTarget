package org.example;

import java.util.Scanner;

import static java.text.NumberFormat.getPercentInstance;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sp = 67.83643F;
        double rj = 36.67866F;
        double mg = 29.22988F;
        double es = 27.16548F;
        double outros = 19.84953F;

        double soma = sp + rj + mg + es + outros;
     System.out.println(soma);

        double percentualSP = ((sp*100)/soma);
        double percentualRJ = ((rj*100)/soma);
        double percentualMG = ((mg*100)/soma);
        double percentualES= ((es*100)/soma);
        double percentualOutros= ((outros*100)/soma);

        System.out.printf("Percentual de São Paulo: %.2f",percentualSP);
        System.out.print(" %\n");
        System.out.printf("Percentual do Rio de Janeiro: %.2f",percentualRJ);
        System.out.print(" %\n");
        System.out.printf("Percentual de Minas Gerais: %.2f",percentualMG);
        System.out.print(" %\n");
        System.out.printf("Percentual de Espirito Santos: %.2f",percentualES);
        System.out.print(" %\n");
        System.out.printf("Percentual de outros estados: %.2f",percentualOutros);


    }
}
