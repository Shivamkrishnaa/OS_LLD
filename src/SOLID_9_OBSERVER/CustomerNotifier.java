package SOLID_9_OBSERVER;

public class CustomerNotifier implements OrderPlacedSubscriber {
    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Notify all the customers");
        System.out.println("Notify customer");
        return returnData;
    }
}
