package app;

import clotheFactory.ClothesBlue;
import clotheFactory.ClothesFactory;
import interfaces.IFactory;

public class Main {
    public static void main(String[] args) {
        IFactory factoryOne = new ClothesFactory();
        factoryOne.createClothesBlue();
        
        IFactory factoryTwo = new ClothesFactory();
        factoryTwo.createClothesWhite();
    }
}
