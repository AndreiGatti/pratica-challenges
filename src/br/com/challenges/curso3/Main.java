package br.com.challenges.curso3;

import br.com.challenges.curso3.model.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        Person person1 = new Person("Akemi", 18);
        Person person2 = new Person("Rodrigo", 30);
        Person person3 = new Person("Caroline", 35);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        System.out.println("Tamanho da lista: " + personArrayList.size());
        System.out.println("Primeira Pessoa: " + personArrayList.get(0));

        System.out.println("Lista de Pessoas:");
        for (Person person : personArrayList){
            System.out.println(person);
        }
    }


}
