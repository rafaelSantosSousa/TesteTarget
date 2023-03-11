package org.example;

import java.util.Scanner;

import static java.text.NumberFormat.getPercentInstance;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sp = 67.83643F;
        float rj = 36.67866F;
        float mg = 29.22988F;
        float es = 27.16548F;
        float outros = 19.84953F;

        float soma = sp + rj + mg + es + outros;
     System.out.println(soma);

        float csp = ((sp*soma)/100);
        float crj = ((rj*soma)/100);
        float cmg = ((mg*soma)/100);
        float ces= ((es*soma)/100);
        float cout= ((outros*soma)/100);

        System.out.printf("%.1f", csp);
        sc.nextLine();
        System.out.printf("%.1f",crj);
        sc.nextLine();
        System.out.printf("%.1p",cmg);
        sc.nextLine();
        System.out.printf("%.1p",ces);
        sc.nextLine();
        System.out.printf("%.1p",cout);

    }
}
