package interfaces;

public abstract class CarPrototype {
    protected double carPrice;
    public abstract String showInfo();
    public abstract CarPrototype clone();

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double car_price) {
        this.carPrice = car_price;
    }
}
