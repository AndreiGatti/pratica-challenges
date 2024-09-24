package br.com.challenges.curso2.tests;

import br.com.challenges.curso2.model.PrimeChecker;
import br.com.challenges.curso2.model.PrimeGenerator;
import br.com.challenges.curso2.model.PrimeNumbers;

public class PrimeNumbersTest {
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        checker.verifyPrimality(17);

        PrimeGenerator generator = new PrimeGenerator();
        int nextNumber = generator.generateNextPrime(17);
        System.out.println("O próximo primo após 17 é: " + nextNumber);

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrime(30);
    }
}
