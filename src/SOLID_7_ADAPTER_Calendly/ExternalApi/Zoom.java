package SOLID_7_ADAPTER_Calendly.ExternalApi;

import java.util.UUID;

public class Zoom implements Meeting{
    @Override
    public String createLink() {
        return  "www.meet.zoom.com/"+UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
