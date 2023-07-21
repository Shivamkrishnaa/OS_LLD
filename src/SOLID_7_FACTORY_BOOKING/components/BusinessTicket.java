package SOLID_7_FACTORY_BOOKING.components;

import java.util.HashMap;

public class BusinessTicket implements Tickets {
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

    public BusinessTicket(){
        this.foodMenu = new HashMap<>();
        this.drinkMenu = new HashMap<>();
        this.seatType = "BUSINESS";
    }

    @Override
    public String toString() {
        return "BusinessTicket{" +
                "seatType='" + seatType + '\'' +
                ", foodMenu=" + foodMenu +
                ", drinkMenu=" + drinkMenu +
                '}';
    }
}
