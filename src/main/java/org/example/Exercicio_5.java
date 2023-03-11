package org.example;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int len = texto.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++) {
            tempCharArray[i] = texto.charAt(i);
        }

        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
    }

