package br.com.challenges.curso1;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = "Andrei Gatti";
        String accountType = "Corrente";
        double balance = 2500;
        double transfer = 0;
        int option = 0;


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo conta: " + accountType);
        System.out.println("Saldo inicial: R$ " + balance);
        System.out.println("\n***********************");
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                
                """;

        while (option != 4) {
            System.out.println(menu);
            option = read.nextInt();

            if (option == 1) {
                System.out.println("O seu saldo atual é: R$ " + balance);
            } else if (option == 2) {
                System.out.println("Insira a quantiade que você deseja transferir: ");
                transfer = read.nextDouble();
                if (transfer > balance) {
                    System.out.println("Você não tem saldo suficiente");
                }else {
                    balance -= transfer;
                    System.out.println("Novo saldo: " + balance);
                }
            } else if (option == 3) {
                System.out.println("Insira a quantiade que você recebeu: ");
                balance = read.nextDouble() + balance;
                System.out.println("Saldo atualizado: R$ " + balance);
            } else if (option !=4){
                System.out.println("Operação inválida!");
            }

        }
    }
}
