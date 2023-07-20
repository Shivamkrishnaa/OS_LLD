package SOLID_9_OBSERVER;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private static Amazon instance;

    private Amazon() {
       orderPlacedSubscribers = new ArrayList<>();
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
    public void orderPlaces() {
        // customer notifier.notify
        // WMSNotifier.notify
        // InvoiceGenerator.generate
        for (OrderPlacedSubscriber orderPlacesSubscribers: orderPlacedSubscribers) {
            orderPlacesSubscribers.orderPlaceEvent();
        }

    }
}
