package SOLID_7_FACTORY_BOOKING;

import SOLID_7_FACTORY_BOOKING.components.*;

public class TicketFactory {
    public static Tickets createTicket(BookingType bookingType) {
        switch (bookingType){
            case PREMIUM:
                return new PremiumTicket();
            case BUSINESS:
                return new BusinessTicket();
            case FIRST_CLASS:
                return new FirstClassTicket();
            default:
                return new EconomyTicket();
        }
    }
}
