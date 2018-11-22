package clotheFactory;

import interfaces.IFactory;

public class ClothesFactory implements IFactory{

    @Override
    public void createClothesBlue() {
        System.out.println("Clothes blue was created");
    }

    @Override
    public void createClothesWhite() {
        System.out.println("Clothes white was created");
    }

    
    
}
