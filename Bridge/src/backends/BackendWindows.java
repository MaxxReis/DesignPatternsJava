package backends;

import interfaces.IBackend;

public class BackendWindows implements IBackend{
    @Override
    public void drawLine() {
        System.out.println("Drawing one line on windows screen");
    }

    @Override
    public void drawText() {
        System.out.println("Drawing a text on windows screen");
    }
    
}
