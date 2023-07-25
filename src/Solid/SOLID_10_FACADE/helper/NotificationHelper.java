package Solid.SOLID_10_FACADE.helper;

import Solid.SOLID_10_FACADE.service.EmailService;
import Solid.SOLID_10_FACADE.service.SmsService;

public class NotificationHelper {
    private EmailService emailService;
    private SmsService smsService;
    public NotificationHelper() {
        this.smsService = new SmsService();
        this.emailService = new EmailService();
    }
    public void sendNotification(){
        smsService.sendNotification();
        emailService.sendNotification();
    }
}
