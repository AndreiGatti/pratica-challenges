package br.com.challenges.curso1;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        int tries = 0;
        int number = 0;
        int randomNumber = new Random().nextInt(100);

        while(tries < 5){
            System.out.println("Digite um número entre 0 e 100: ");
            number = read.nextInt();
            tries++;

            if(number == randomNumber){
                System.out.println("Parabéns você acertou o número em: " + tries + " tentaivas!");
                break;
            }else if(number < randomNumber){
                System.out.println("O número gerado é maior:");
            }else{
                System.out.println("O número gerado é menor:");
            }

        }

    }
}
