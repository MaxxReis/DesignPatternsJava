package factoryNokia;

import interfaces.ISmartphone;

public class FactoryNokia implements ISmartphone{
    @Override
    public void createSmartphone() {
        Camera camera = new Camera("18 MP");
        System.out.println(camera.showDetail());
        Screen screen = new Screen("LCD");
        System.out.println(screen.showDetail());
        Memory memory = new Memory("4 GB");
        System.out.println(memory.showDetail());
    }
}
