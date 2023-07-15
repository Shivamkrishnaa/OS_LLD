package SOLID_8_DECORATOR;

public class ChocolateScoop implements Icecream{
    private Icecream icecream;
    private String description = "ChocolateScoop";
    private int price = 30;
    public ChocolateScoop(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public int getPrice() {
        return icecream.getPrice() + this.price;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + this.description;
    }
}
