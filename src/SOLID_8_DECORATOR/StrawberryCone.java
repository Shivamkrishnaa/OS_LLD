package SOLID_8_DECORATOR;

public class StrawberryCone implements Icecream{
    private Icecream icecream;
    private String description = "StrawberryCone";
    private int price = 20;
    public StrawberryCone(Icecream icecream){
        this.icecream = icecream;
    }
    public StrawberryCone(){}
    @Override
    public int getPrice() {
        return icecream!= null ? icecream.getPrice() + price : price;
    }

    @Override
    public String getDescription() {
        return icecream != null ? icecream.getDescription() + this.description : this.description;
    }
}
