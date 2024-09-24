package br.com.challenges.curso2;

import java.util.Scanner;

public class Calculator {
    int number;

    public int calc(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número, para você saber o dobro dele: ");
        number = read.nextInt();

        return number *2;

    }
}
