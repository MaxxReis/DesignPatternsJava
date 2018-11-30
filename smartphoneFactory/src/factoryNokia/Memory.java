package factoryNokia;

public class Memory {
    private String ram;

    public Memory(String ram) {
        this.ram = ram;
    }
    
    public String showDetail(){
        return "Memory: " + this.ram;
    }
}
