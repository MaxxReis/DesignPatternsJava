package carLuxury;

import interfaces.ICarFactory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;

public class CarLuxury implements ICarFactory{
    @Override
    public IMotor createMotor() {
        return new MotorLuxury();
    }

    @Override
    public IPneu createPneu() {
        return new PneuLuxury();
    }

    @Override
    public IChassi createChassi() {
        return new ChassiLuxury();
    }
}
