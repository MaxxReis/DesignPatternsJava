package prototype;

import interfaces.IPrototype;
import java.util.HashMap;

public class FactoryConfigurable {
    private HashMap<String, IPrototype> prototypes;
    
    public FactoryConfigurable(){
        this.prototypes = new HashMap<>();
    }
    
    public boolean registerPrototype(String namePrototype, IPrototype prototype){
        return (prototypes.put(namePrototype, prototype) == null) ? true : false;
    }
    
    public boolean unregisterPrototype(String namePrototype){
        prototypes.remove(namePrototype);
        return true;
    }
    
    public boolean clear(){
        prototypes.clear();
        return true;
    }
}
