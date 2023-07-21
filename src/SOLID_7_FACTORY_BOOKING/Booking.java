package SOLID_7_FACTORY_BOOKING;

import SOLID_7_FACTORY_BOOKING.components.Tickets;

public class Booking {
    private BookingType bookingType;
    public Booking(BookingType bookingType) {
        this.bookingType = bookingType;
    }
    public Tickets createTicket(){
        return TicketFactory.createTicket(bookingType);
    }
}
