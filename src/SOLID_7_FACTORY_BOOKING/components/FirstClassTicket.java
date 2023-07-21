package SOLID_7_FACTORY_BOOKING.components;

import java.util.HashMap;

public class FirstClassTicket implements Tickets{
    private String seatType;
    private HashMap<Integer, String> foodMenu;
    private HashMap<Integer, String> drinkMenu;
    public FirstClassTicket() {
        this.seatType = "First Class";
        this.foodMenu = new HashMap<>();
        this.drinkMenu = new HashMap<>();
    }
    @Override
    public String getSeatType() {
        return seatType;
    }

    @Override
    public HashMap<Integer, String> getFoodMenu() {
        return foodMenu;
    }

    @Override
    public HashMap<Integer, String> getDrinkMenu() {
        return drinkMenu;
    }

    @Override
    public String toString() {
        return "FirstClassTicket{" +
                "seatType='" + seatType + '\'' +
                ", foodMenu=" + foodMenu +
                ", drinkMenu=" + drinkMenu +
                '}';
    }
}
