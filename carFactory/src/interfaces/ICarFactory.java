package interfaces;

public interface ICarFactory {
    public IMotor createMotor();
    public IPneu createPneu();
    public IChassi createChassi();
}
