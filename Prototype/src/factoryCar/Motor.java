package factoryCar;

import prototype.FactoryConfigurable;
import interfaces.IPrototype;

public class Motor implements IPrototype{
    private String name;
    private String model;
    
    public Motor(String name, String model){
        this.name = name;
        this.model = model;
    }
    
    @Override
    public IPrototype clone() {
        return new Motor(this.name, this.model);
    }

    @Override
    public String show() {
        return "Name " + this.name + "Model " + this.model; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}