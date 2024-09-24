package br.com.challenges.curso2.model;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showDetails(){
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
    }
}
