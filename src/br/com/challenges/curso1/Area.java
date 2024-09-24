package br.com.challenges.curso1;

import java.util.Scanner;
//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
public class Area {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int side = 0;
        int ray = 0;
        int option = 0;
        //Circulo pi*r*r
        //Quadrado lado*lado
        System.out.println("Digite 1 se você quer calcular a área de um quadrado, ou 2 se quiser calcular a área de um círculo: ");
        option = read.nextInt();
        if (option == 1){
            System.out.println("Digite o tamanho do lado do seu quadrado: ");
            side = read.nextInt();
            int areaQuadrado = side * side;
            System.out.println("A area do quadrado é de: "+ areaQuadrado);
        } else if (option == 2) {
            System.out.println("Digite o raio do círculo: ");
            ray = read.nextInt();
            int areaCirculo = (int) (3.14*(ray * ray));
            System.out.println("A area do círculo é de: "+ areaCirculo);
        }

    }
}
