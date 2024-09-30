package br.com.challenges.curso3;

import br.com.challenges.curso3.model.Person;
import br.com.challenges.curso3.model.Product;
import br.com.challenges.curso3.model.ProductPerishable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Person> personArrayList = new ArrayList<>();

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
        }*/

        ArrayList<Product> productsList = new ArrayList<>();

        Product product1 = new Product("Sabão", 15.99 , 5);
        Product product2 = new Product("Detergente", 10.49, 8);

        Product newProduct = new Product("Novo Produto", 15.99, 3);
        /*System.out.println(newProduct);*/

        ProductPerishable productPerishable  = new ProductPerishable("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(productPerishable);

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(newProduct);
        productsList.add(productPerishable);

        System.out.println("Tamanho da lista: " + productsList.size());
        System.out.println("Produto na posição 0: " + productsList.get(0).getName());

        for (Product product : productsList) {
            System.out.println(product);
        }


    }


}
