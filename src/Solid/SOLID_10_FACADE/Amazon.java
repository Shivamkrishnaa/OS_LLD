package Solid.SOLID_10_FACADE;

import Solid.SOLID_10_FACADE.helper.InventoryManagementHelper;
import Solid.SOLID_10_FACADE.helper.NotificationHelper;
import Solid.SOLID_10_FACADE.service.*;

public class Amazon {
//    private InventoryManagementService inventoryManagementService;
    private InventoryManagementHelper inventoryManagementHelper;
    private PaymentService paymentService;
    private TrackService trackService;
    private NotificationHelper notificationHelper;
//    private EmailService emailService;
//    private SmsService smsService;
    public Amazon(){
//        this.inventoryManagementService = new InventoryManagementService();
        this.inventoryManagementHelper = new InventoryManagementHelper();
        this.paymentService = new PaymentService();
        this.trackService = new TrackService();
        this.notificationHelper = new NotificationHelper();
//        this.smsService = new SmsService();
//        this.emailService = new EmailService();
    }
    public void orderPlaced(){
//       inventoryManagementService.checkInventory();
//       inventoryManagementService.updateInventory();
//       inventoryManagementService.checkItemLocation();
//       inventoryManagementService.notifyWarehouse();
        inventoryManagementHelper.updateOrderPlace();
        paymentService.doPayment();
        notificationHelper.sendNotification();
//       smsService.sendNotification();
//       emailService.sendNotification();

       trackService.track();
    }
}
