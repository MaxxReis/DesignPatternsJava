package app;

import factoryCar.Chassi;
import prototype.FactoryConfigurable;
import factoryCar.Motor;

public class Main {
    public static void main(String[] args) {
        FactoryConfigurable prototypeCar = new FactoryConfigurable();
        
        Motor motor1 =  new Motor("v8", "2010");
        Motor motor2 =  new Motor("v9", "2011");   
        Motor motor3 =  new Motor("v10", "2010");
        
        Chassi chassi1 = new Chassi("Bz", "1009");
        Chassi chassi2 = new Chassi("HT", "2004");
        Chassi chassi3 = new Chassi("WR", "2008");
        
        System.out.println("Registering motors");
        System.out.println("" +prototypeCar.registerPrototype("Ford", motor1));
        System.out.println("" +prototypeCar.registerPrototype("Volks", motor2));
        System.out.println("" +prototypeCar.registerPrototype("BMW", motor3));
        
        System.out.println("==================================================");
        System.out.println("Registering chassis");
        System.out.println(prototypeCar.registerPrototype("AAA", chassi1));
        System.out.println(prototypeCar.registerPrototype("BBB", chassi2));
        System.out.println(prototypeCar.registerPrototype("AAA", chassi3));
        
        System.out.println("==================================================");
        System.out.println("Removing prototypes");
        System.out.println(prototypeCar.unregisterPrototype("Ford"));
        System.out.println(prototypeCar.unregisterPrototype("AAA"));
        
        System.out.println("==================================================");
        System.out.println("clearing prototypes");
        System.out.println(prototypeCar.clear());
        
        
    }
}
