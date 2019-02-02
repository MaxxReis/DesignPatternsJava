package app;

import interfaces.CarPrototype;
import prototype.FordPrototype;
import prototype.JeepPrototype;

public class Main {
    public static void main(String[] args) {
        FordPrototype ford_protorype = new FordPrototype();
        
        CarPrototype newFord = ford_protorype.clone();
        newFord.setCarPrice(18000.0);
        CarPrototype oldFord = ford_protorype.clone();
        oldFord.setCarPrice(8000.0);
        
        System.out.println(newFord.showInfo());
        System.out.println(oldFord.showInfo());
        System.out.println("=====================");
        
        JeepPrototype jeep_protorype = new JeepPrototype();
        
        CarPrototype newJeep = jeep_protorype.clone();
        newJeep.setCarPrice(50000.0);
        CarPrototype oldJeep = jeep_protorype.clone();
        oldJeep.setCarPrice(25000.0);
        
        System.out.println(newJeep.showInfo());
        System.out.println(newJeep.showInfo());
    }
}
