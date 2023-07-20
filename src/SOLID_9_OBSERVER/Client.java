package SOLID_9_OBSERVER;

public class Client {
    public static void main(String[] args) {
//        Amazon amazon = new Amazon();// publisher
//        CustomerNotifier customerNotifier = new CustomerNotifier();// subscriber
//        amazon.registerSubscriber(customerNotifier); // subscriber subscribing to publisher

        // Creating a subscriber and Auto subscribing
        Amazon a = Amazon.getInstance();
        new CustomerNotifier();
        new InvoiceGenerator();
        WarehouseMSNotifier ws = new WarehouseMSNotifier();
        a.orderPlaces();

        a.deRegisterSubscriber(ws);
        a.orderPlaces();
    }
}
