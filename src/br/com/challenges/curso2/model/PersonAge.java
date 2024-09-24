package br.com.challenges.curso2.model;

public class PersonAge {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ageVerifier(){
        if(age >= 18){
            System.out.println("O usuário é maior de idade!");
        }else{
            System.out.println("O usuário é menor de idade!");
        }
    }
}
