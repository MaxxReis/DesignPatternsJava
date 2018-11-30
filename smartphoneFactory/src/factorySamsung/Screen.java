package factorySamsung;

public class Screen {
    private String model;
    
    public Screen(String model){
        this.model = model;
    }
    
    public String showDetail(){
        return "Screen model: " + this.model;
    }
}
