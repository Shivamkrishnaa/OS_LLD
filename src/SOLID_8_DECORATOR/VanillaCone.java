package SOLID_8_DECORATOR;

public class VanillaCone implements Icecream{
    private Icecream icecream;
    private String description = "VanillaCone";
    private int price = 20;
    public VanillaCone(Icecream icecream) {
        this.icecream = icecream;
    }
    public VanillaCone() {};
    @Override
    public int getPrice() {
        return icecream!= null ? icecream.getPrice() + this.price : this.price;
    }

    @Override
    public String getDescription() {
        return icecream!= null ?  icecream.getDescription() + this.description : this.description;
    }
}
