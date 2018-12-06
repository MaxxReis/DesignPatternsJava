package carsport;

import interfaces.IPneu;

public class PneuSport implements IPneu{
    @Override
    public void calibrate() {
        System.out.println("Pneu sport was created");
    }
}
