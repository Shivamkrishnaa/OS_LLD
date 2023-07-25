package Solid.SOLID_7_FACTORY_booking;

import Solid.SOLID_7_FACTORY_booking.components.Tickets;

//Assignment -> Booking type on a plane -> Business, Premium, Economy. Each have 3 sets of features, seattype, food menu and drinks menu
// depending on the booking type chosen, create the ticket object with internal 3 set of features.

public class Client {
    public static void main(String[] args) {
        Tickets b = new Booking(BookingType.BUSINESS).createTicket();
        System.out.println(b.toString());
        Tickets e = new Booking(BookingType.ECONOMY).createTicket();
        System.out.println(e.toString());
        Tickets f = new Booking(BookingType.FIRST_CLASS).createTicket();
        System.out.println(f.toString());
        Tickets p = new Booking(BookingType.PREMIUM).createTicket();
        System.out.println(p.toString());
    }
}
