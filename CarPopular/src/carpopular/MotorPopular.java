package carpopular;

import interfaces.IMotor;

public class MotorPopular implements IMotor{
    @Override
    public void turn() {
        System.out.println("Motor popular was turned");
    }
}
