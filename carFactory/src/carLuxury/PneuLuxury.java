package carLuxury;

import interfaces.IPneu;

public class PneuLuxury implements IPneu{
    @Override
    public void calibrate() {
        System.out.println("Pneu was calibrated with gas");
    }
}
