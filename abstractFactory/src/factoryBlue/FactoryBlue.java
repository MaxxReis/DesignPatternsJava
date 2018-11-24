package factoryBlue;

import interfaces.IFactory;

public class FactoryBlue implements IFactory{
    @Override
    public void createClothes() {
        TshirtBlue tshirt = new TshirtBlue("Polo");
        System.out.println(tshirt.toString());
        
        ShoesBlue shoes = new ShoesBlue("Nikke");
        System.out.println(shoes.toString());
        
        BermudaBlue bermuda = new BermudaBlue("Miichell");
        System.out.println(bermuda.toString()); 
    }
}
