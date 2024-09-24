package br.com.challenges.curso2.model;

public class PrimeChecker extends PrimeNumbers{
    public void isPrime(int number) {
        if (verifyPrimality(number)) {
            System.out.println(number + " é primo.");
        }else {
            System.out.println(number + " não é primo.");
        }
    }
}
