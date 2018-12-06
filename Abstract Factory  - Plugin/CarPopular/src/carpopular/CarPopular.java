package carpopular;

import interfaces.ICarFactory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;

public class CarPopular implements ICarFactory{
    @Override
    public IMotor createMotor() {
        return new MotorPopular();
    }

    @Override
    public IPneu createPneu() {
        return new PneuPopular();
    }

    @Override
    public IChassi createChassi() {
        return new ChassiPopular();
    }
}
