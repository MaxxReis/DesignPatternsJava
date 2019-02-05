package app;

import carPrototype.ChassiPrototype;
import prototype.FactoryConfigurable;
import carPrototype.MotorPrototype;
import carPrototype.WheelPrototype;
import interfaces.IPrototype;

public class Main {
    public static void main(String[] args) {
        FactoryConfigurable factory = new FactoryConfigurable();
        
        System.out.println("Registering prototypes....");
        factory.registerPrototype("V8", new MotorPrototype("V8", "2010"));
        factory.registerPrototype("Chassi", new ChassiPrototype("A8b", "2010"));
        factory.registerPrototype("Iron", new WheelPrototype("13", "2012"));
        
        System.out.println("Creating prototypes....");
        MotorPrototype motor = (MotorPrototype) factory.create("V8");
        ChassiPrototype chassi = (ChassiPrototype) factory.create("Chassi");
        WheelPrototype wheel = (WheelPrototype) factory.create("Iron");
        
        System.out.println("================================");
        System.out.println("Showing prototypes....");
        System.out.println(motor.show());
        System.out.println(chassi.show());
        System.out.println(wheel.show());
        
        System.out.println("Unregistering prototypes....");
        System.out.println(factory.unregisterPrototype("V8"));
        System.out.println(factory.unregisterPrototype("Iron"));
        System.out.println(factory.unregisterPrototype("AA"));
        
        System.out.println("Clear prototypes....");
        System.out.println(factory.clear());
    }
}
