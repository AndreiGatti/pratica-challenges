package br.com.challenges.curso1;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0;

        System.out.println("Digite o número para verificar se ele é par ou impar: ");
        number = read.nextInt();

        if(number % 2 == 0){
            System.out.println("O número é par!");
        }else {
            System.out.println("O número é impar!");
        }
    }
}
