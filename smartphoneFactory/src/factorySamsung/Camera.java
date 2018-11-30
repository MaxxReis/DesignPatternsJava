package factorySamsung;

public class Camera {
    private String model;
    
    public Camera(String model){
        this.model = model;
    }
    
    public String showDetail(){
        return "Camera model: " + this.model;
    }
}
