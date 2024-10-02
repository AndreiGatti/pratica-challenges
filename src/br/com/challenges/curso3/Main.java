package br.com.challenges.curso3;

import br.com.challenges.curso2.model.Animal;
import br.com.challenges.curso2.model.Dog;
import br.com.challenges.curso2.model.Product;
import br.com.challenges.curso3.model.*;

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

        /*ArrayList<Product> productsList = new ArrayList<>();

        Product product1 = new Product("Sabão", 15.99 , 5);
        Product product2 = new Product("Detergente", 10.49, 8);

        Product newProduct = new Product("Novo Produto", 15.99, 3);
        System.out.println(newProduct);

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
        }*/

        /*ArrayList<String> listStrings = new ArrayList<>();
        listStrings.add("Java");
        listStrings.add("C++");
        listStrings.add("Python");

        for(String element : listStrings){
            System.out.println(element);
        }

        Animal animal = new Dog();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }else{
            System.out.println("O objeto não é um cachorro");
        }*/

        /*Product2 product1 = new Product2("Ar condicionado", 2000.0);
        Product2 product2 = new Product2("Aquecedor", 800.0);
        Product2 product3 = new Product2("Ventilador", 150.0);

        ArrayList<Product2> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        double priceSum = 0;
        for (Product2 product : productList){
            priceSum += product.getPrice();
        }

        double averagePrice = priceSum / productList.size();
        System.out.println("Preço médio dos produtos: " + averagePrice);*/

        /*Circle circle = new Circle();
        circle.radius = 5;

        Square square = new Square();
        square.side = 4;

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(square);

        for (Shape shape : shapeList) {
            System.out.println("Área: " + shape.calculateArea());
        }*/

        BankAccount account1 =  new BankAccount(101, 1500.0);
        BankAccount account2 =  new BankAccount(102, 2500.0);
        BankAccount account3 =  new BankAccount(103, 1800.0);

        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);

        BankAccount accountWithHighestBalance = accountList.get(0);
        for (BankAccount account : accountList){
            if (account.getBalance() > accountWithHighestBalance.getBalance()){
                accountWithHighestBalance = account;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + accountWithHighestBalance.getAccountNumber() +
                ", Saldo: " + accountWithHighestBalance.getBalance());
    }


}
