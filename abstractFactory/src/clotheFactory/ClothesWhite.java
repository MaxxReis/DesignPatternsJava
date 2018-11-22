package clotheFactory;

public class ClothesWhite {
    private String name;
    
    public ClothesWhite(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "Clothes" + this.name;
    } 
}
