package carPrototype;

import interfaces.IPrototype;

public class WheelPrototype implements IPrototype{
    private String name;
    private String model;
    
    public WheelPrototype(String name, String model){
        this.name = name;
        this.model = model;
    }
    
    @Override
    public IPrototype clone() {
        return new WheelPrototype(this.name, this.model);
    }

    @Override
    public String show() {
        return "Name " + this.name + " - Model " + this.model + "\n";
    }
    
}
