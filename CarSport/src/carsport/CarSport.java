package carsport;

import interfaces.ICarFactory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;

public class CarSport implements ICarFactory{
    @Override
    public IMotor createMotor() {
        return new MotorSport();
    }

    @Override
    public IPneu createPneu() {
        return new PneuSport();
    }

    @Override
    public IChassi createChassi() {
        return new ChassiSport();
    }
}
