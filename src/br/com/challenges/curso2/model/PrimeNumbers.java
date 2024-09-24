package br.com.challenges.curso2.model;

public class PrimeNumbers {
    public boolean verifyPrimality(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if(number % i == 0){
                return false;
            }
            
        }
        return true;
    }

    public void listPrime(int upperLimit) {
        System.out.println("Números primos até " + upperLimit + ": ");
        for (int i = 2; i <= upperLimit; i++) {
            if(verifyPrimality(i)) {
                System.out.println(i + " ");
            }
            
        }
        System.out.println();
    }
}
