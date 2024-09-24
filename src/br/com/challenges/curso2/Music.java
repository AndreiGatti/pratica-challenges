package br.com.challenges.curso2;

public class Music {
    String title;
    String artist;
    int launchYear;
    double sumOfRatings;
    int totalReviews;

    void showTechincalSheet(){
        System.out.println("Título da música: "+ title);
        System.out.println("Artista da música: "+ artist);
        System.out.println("Ano de lançamento da música: "+ launchYear);
    }

    void rating(double rate){
        sumOfRatings += rate;
        totalReviews++;
    }

    double getAverage(){
        return sumOfRatings/totalReviews;
    }
}
