package br.com.challenges.curso1;

public class Media {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 9;
        int media = (nota1 + nota2)/2;
        String mensagem = String.format("A média da nota 1 = %d e nota 2 = %d é de %d", nota1, nota2, media);
        System.out.println(mensagem);
    }
}
