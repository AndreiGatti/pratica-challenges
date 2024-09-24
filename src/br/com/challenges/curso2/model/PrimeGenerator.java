package br.com.challenges.curso2.model;

public class PrimeGenerator extends PrimeNumbers{
    public int generateNextPrime(int lastKnownPrime){
        int nextNumber = lastKnownPrime + 1;
        while(!verifyPrimality(nextNumber)){
            nextNumber++;
        }
        return nextNumber;
    }
}
