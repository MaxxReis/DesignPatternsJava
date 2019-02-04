package factoryCar;

import interfaces.IPrototype;

public class Chassi implements IPrototype{
    private String name;
    private String model;
    
    public Chassi(String name, String model){
        this.name = name;
        this.model = model;
    }
    
    @Override
    public IPrototype clone() {
        return new Chassi(this.name, this.model);
    }

    @Override
    public String show() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
