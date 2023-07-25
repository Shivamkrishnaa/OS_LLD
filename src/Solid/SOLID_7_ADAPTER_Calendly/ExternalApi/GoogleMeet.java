package Solid.SOLID_7_ADAPTER_Calendly.ExternalApi;

import java.util.UUID;

public class GoogleMeet implements Meeting{
    @Override
    public String createLink() {
        return  "www.meet.google.com/"+UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
