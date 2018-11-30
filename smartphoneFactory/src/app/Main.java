package app;

import factoryNokia.FactoryNokia;
import factorySamsung.FactorySamsung;
import interfaces.ISmartphone;

public class Main {
    public static void main(String[] args) {
        ISmartphone smartphone = new FactoryNokia();
        smartphone.createSmartphone();
    }
}
