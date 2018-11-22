package clotheFactory;

public class ClothesBlue {
    private String name;
    
    public ClothesBlue(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "Clothes " + this.name;
    }
    
}
