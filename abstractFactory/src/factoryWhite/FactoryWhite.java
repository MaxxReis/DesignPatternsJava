package factoryWhite;

import interfaces.IFactory;

public class FactoryWhite implements IFactory{
    @Override
    public void createClothes() {
        TshirtWhite tshirt = new TshirtWhite("Hawwai");
        System.out.println(tshirt.toString());
        
        ShoesWhite shoes = new ShoesWhite("All-Stars");
        System.out.println(shoes.toString());
        
        BermudaWhite bermuda = new BermudaWhite("Coach");
        System.out.println(bermuda.toString());
    }
}
