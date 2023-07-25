package Solid.SOLID_9_OBSERVER;

public class WarehouseMSNotifier implements OrderPlacedSubscriber, OrderCancelledSubscriber{
    public WarehouseMSNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
        a.registerOrderCancelledSubscriber(this);
    }
    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Updating Warehouse management system after order is places");
        System.out.println("Updating UMS after order places");
        return returnData;
    }
    @Override
    public ReturnData orderCanceled() {
        ReturnData returnData = new ReturnData("Warehouse Notifier all the customers for cancellation");
        System.out.println("Warehouse Notifier customer for cancellation");
        return returnData;
    }
}
