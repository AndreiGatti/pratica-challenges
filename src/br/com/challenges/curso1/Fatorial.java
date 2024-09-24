package br.com.challenges.curso1;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0;

        System.out.println("Digite um número para calcular a sua fatorial: ");
        number = read.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
    }
}
