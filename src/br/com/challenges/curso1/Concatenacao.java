package br.com.challenges.curso1;

public class Concatenacao {
    public static void main(String[] args) {
        char letter = 'A';
        String word = "banana";
        String message = String.format("%c %s", letter, word);
        System.out.println(message);
    }
}
