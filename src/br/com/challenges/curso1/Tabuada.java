package br.com.challenges.curso1;

import java.util.Scanner;

//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
public class Tabuada {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0;
        System.out.println("Digite um número para ver a tabuada dele de 1 a 10: ");
        number = read.nextInt();

        System.out.println("br.com.challenges.curso1.Tabuada do "+ number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + " = " + (number * i));
        }
    }
}
