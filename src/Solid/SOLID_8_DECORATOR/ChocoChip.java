package Solid.SOLID_8_DECORATOR;

public class ChocoChip implements Icecream{
    private Icecream icecream;
    private String description = "ChocoChip";
    private int price = 15;
    public ChocoChip(Icecream icecream){
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
