package br.com.challenges.curso1;

import java.util.Scanner;
//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
public class Negativo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0;

        System.out.println("Digite um número positivo ou negativo-: ");
        number = read.nextInt();

        if(number > 0){
            System.out.println("O número é positivo!");
        }else{
            System.out.println("O número é negativo!");
        }
    }
}
