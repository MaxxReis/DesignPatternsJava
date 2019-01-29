package interfaces;

public abstract class Widget {
    protected IBackend backend;

    public abstract void show();
    
    public Widget(IBackend backend) {
        this.backend = backend;
    }
    
    public void setBackend(IBackend backend){
        this.backend = backend;
    }

}
