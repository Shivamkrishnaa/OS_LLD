package SOLID_9_OBSERVER;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private List<OrderCancelledSubscriber> orderCancelledSubscribers;
    private static Amazon instance;

    private Amazon() {
       orderPlacedSubscribers = new ArrayList<>();
       orderCancelledSubscribers = new ArrayList<>();
    }
    public static Amazon getInstance() {
        if (instance == null) {
            synchronized (Amazon.class) {
                if(instance == null) {
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }
    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        this.orderPlacedSubscribers.add(orderPlacedSubscriber);
    }
    public void deRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        this.orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
    public void registerOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
        this.orderCancelledSubscribers.add(orderCancelledSubscriber);
    }
    public void deRegisterOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
        this.orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }
    public void orderPlaces() {
        // customer notifier.notify
        // WMSNotifier.notify
        // InvoiceGenerator.generate
        for (OrderPlacedSubscriber orderPlacesSubscribers: orderPlacedSubscribers) {
            orderPlacesSubscribers.orderPlaceEvent();
        }

    }
    public void orderCancel() {
        for (OrderCancelledSubscriber orderCancelledSubscriber: orderCancelledSubscribers) {
            orderCancelledSubscriber.orderCanceled();
        }
    }
}
