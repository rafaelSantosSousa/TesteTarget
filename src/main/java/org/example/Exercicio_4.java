package org.example;

public class Exercicio_4 {
    public static void main(String[] args) {

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
//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//
//SP – R$67.836,43
//RJ – R$36.678,66
//MG – R$29.229,88
//ES – R$27.165,48
//Outros – R$19.849,53
//
//Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
// 