package factoryWhite;

public class TshirtWhite {
    private String name;
    
    public TshirtWhite(String name){
        this.name = name;
    }
    
    public String toStrng(){
        return "Tshirt " + this.name + " white was created";
    }
}
