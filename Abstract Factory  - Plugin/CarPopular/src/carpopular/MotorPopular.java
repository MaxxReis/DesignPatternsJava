package carpopular;

import interfaces.IMotor;

public class MotorPopular implements IMotor{
    @Override
    public String turn() {
        return "Motor popular was turned";
    }
}
