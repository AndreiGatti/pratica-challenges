package br.com.challenges.curso2.tests;

import br.com.challenges.curso2.model.CarModel;

public class CarTest {
    public static void main(String [] args){
        CarModel myCar = new CarModel();
        myCar.defineModel("Sedan");
        myCar.definePrice(30000,32000,35000);
        myCar.showInfo();
    }
}
