package app;

import carLuxury.CarLuxury;
import carPopular.CarPopular;
import interfaces.ICarFactory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;

public class Main {
    public static void createCar(ICarFactory factory) {
       IMotor motor = factory.createMotor();
       motor.turn();
       IPneu pneu = factory.createPneu();
       pneu.calibrate();
       IChassi chassi = factory.createChassi();
       chassi.drawNumber();
    }
    
    public static void main(String[] args) {
        createCar(new CarLuxury());
    }
}
