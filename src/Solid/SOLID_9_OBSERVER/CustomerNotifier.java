package Solid.SOLID_9_OBSERVER;

public class CustomerNotifier implements OrderPlacedSubscriber, OrderCancelledSubscriber {
    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
        a.registerOrderCancelledSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Notify all the customers");
        System.out.println("Notify customer");
        return returnData;
    }

    @Override
    public ReturnData orderCanceled() {
        ReturnData returnData = new ReturnData("Notify all the customers for cancellation");
        System.out.println("Notify customer for cancellation");
        return returnData;
    }
}
