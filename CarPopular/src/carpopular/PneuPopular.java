package carpopular;

import interfaces.IPneu;

public class PneuPopular implements IPneu{
    @Override
    public void calibrate() {
        System.out.println("Pneu popular was calibrated");
    }
}
