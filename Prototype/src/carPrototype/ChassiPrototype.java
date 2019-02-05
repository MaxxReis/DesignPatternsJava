package carPrototype;

import interfaces.IPrototype;

public class ChassiPrototype implements IPrototype{
    private String name;
    private String model;
    
    public ChassiPrototype(String name, String model){
        this.name = name;
        this.model = model;
    }
    
    @Override
    public IPrototype clone() {
        return new ChassiPrototype(this.name, this.model);
    }

    @Override
    public String show() {
        return "Name " + this.name + " - Model " + this.model + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
}
