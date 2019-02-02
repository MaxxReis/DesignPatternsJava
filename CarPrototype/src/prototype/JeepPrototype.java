package prototype;

import interfaces.CarPrototype;

public class JeepPrototype extends CarPrototype{
    protected JeepPrototype(CarPrototype car_prototype) {
        this.carPrice = car_prototype.getCarPrice();
    }
    
    public JeepPrototype(){
        this.carPrice = 0.0;
    }
    
    @Override
    public String showInfo() {
        return "Car Model Jeep \n Price: " + this.getCarPrice();
    }

    @Override
    public CarPrototype clone() {
        return new JeepPrototype(this);
    }
    
}
