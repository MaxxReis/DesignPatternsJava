package carsport;

import interfaces.IMotor;

public class MotorSport implements IMotor{
    @Override
    public void turn() {
        System.out.println("Motor sport was created");
    }
}
