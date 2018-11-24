package factoryBlue;

public class ShoesBlue {
    private String name;
    
    public ShoesBlue(String name){
        this.name = name;
    }
    
    public String toString(){
        return "Shoes " + this.name + " blue was created";
    }
}
