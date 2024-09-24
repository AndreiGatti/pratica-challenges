package br.com.challenges.curso1;

import java.util.Scanner;
//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
public class Iguais {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        System.out.println("Digite o primeiro número: ");
        number1 = read.nextInt();
        System.out.println("Digite o segundo número: ");
        number2 = read.nextInt();

        if(number1 == number2){
            System.out.println("Os números são iguais");
        } else if (number1 > number2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}
