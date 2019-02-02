package prototype;

import interfaces.CarPrototype;

public class FordPrototype extends CarPrototype{
    protected FordPrototype(CarPrototype car_prototype) {
        this.carPrice = car_prototype.getCarPrice();
    }
    
    public FordPrototype(){
        this.carPrice = 0.0;
    }
    
    @Override
    public String showInfo() {
        return "Car Model - Ford\n Price: " + this.getCarPrice();
    }

    @Override
    public CarPrototype clone() {
        return new FordPrototype(this);
    }
    
}
