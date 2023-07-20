package SOLID_9_OBSERVER;

public class WarehouseMSNotifier implements OrderPlacedSubscriber{
    public WarehouseMSNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }
    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Updating Warehouse management system after order is places");
        System.out.println("Updating UMS after order places");
        return returnData;
    }
}
