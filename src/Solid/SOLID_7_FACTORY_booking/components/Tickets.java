package Solid.SOLID_7_FACTORY_booking.components;

import java.util.HashMap;

public interface Tickets {
    String getSeatType();
    HashMap<Integer, String> getFoodMenu();
    HashMap<Integer, String> getDrinkMenu();

}
