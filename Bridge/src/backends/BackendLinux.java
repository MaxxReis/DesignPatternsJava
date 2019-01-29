package backends;

import interfaces.IBackend;

public class BackendLinux implements IBackend{
    @Override
    public void drawLine() {
        System.out.println("Drawing one line on linux screen");
    }

    @Override
    public void drawText() {
        System.out.println("Drawing a text on linux screen");
    }
}
