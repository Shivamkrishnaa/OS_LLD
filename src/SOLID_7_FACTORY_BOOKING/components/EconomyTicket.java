package SOLID_7_FACTORY_BOOKING.components;

import java.util.HashMap;

public class EconomyTicket implements Tickets{
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

    public EconomyTicket(){
        this.foodMenu = new HashMap<>();
        this.drinkMenu = new HashMap<>();
        this.seatType = "Economy";
    }

    @Override
    public String toString() {
        return "EconomyTicket{" +
                "seatType='" + seatType + '\'' +
                ", foodMenu=" + foodMenu +
                ", drinkMenu=" + drinkMenu +
                '}';
    }
}
