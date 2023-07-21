package SOLID_7_FACTORY_BOOKING.components;

import java.util.HashMap;

public class PremiumTicket implements Tickets{
    private String seatType;
    private HashMap<Integer, String> foodMenu;
    private HashMap<Integer, String>  drinkMenu;

    public String getSeatType() {
        return seatType;
    }

    public HashMap<Integer, String> getFoodMenu() {
        return foodMenu;
    }
    public HashMap<Integer, String> getDrinkMenu() {
        return drinkMenu;
    }

    public PremiumTicket(){
        this.foodMenu = new HashMap<>();
        this.drinkMenu = new HashMap<>();
        this.seatType = "Premium";
    }

    @Override
    public String toString() {
        return "PremiumTicket{" +
                "seatType='" + seatType + '\'' +
                ", foodMenu=" + foodMenu +
                ", drinkMenu=" + drinkMenu +
                '}';
    }
}
