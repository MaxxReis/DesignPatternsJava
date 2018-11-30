package factorySamsung;

import interfaces.ISmartphone;

public class FactorySamsung implements ISmartphone{
    @Override
    public void createSmartphone() {
        Camera camera = new Camera("12 MP");
        System.out.println(camera.showDetail());
        Screen screen = new Screen("IPS");
        System.out.println(screen.showDetail());
        Memory memory = new Memory("1 GB");
        System.out.println(memory.showDetail());
    }
}
