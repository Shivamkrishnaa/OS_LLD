package Solid.SOLID_7_FACTORY_booking;

import Solid.SOLID_7_FACTORY_booking.components.Tickets;

public class Booking {
    private BookingType bookingType;
    public Booking(BookingType bookingType) {
        this.bookingType = bookingType;
    }
    public Tickets createTicket(){
        return TicketFactory.createTicket(bookingType);
    }
}
