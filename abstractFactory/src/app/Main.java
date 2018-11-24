package app;

import factoryBlue.TshirtBlue;
import factoryBlue.FactoryBlue;
import factoryWhite.FactoryWhite;
import interfaces.IFactory;

public class Main {
    public static void main(String[] args) {
        IFactory factoryOne = new FactoryBlue();
        factoryOne.createClothes();
        
        System.out.println("**************************************");
        
        IFactory factoryTwo = new FactoryWhite();
        factoryTwo.createClothes();
    }
}
