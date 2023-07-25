package Solid.SOLID_7_ADAPTER_Calendly.ExternalApi;

import java.util.UUID;

public class Teams implements Meeting{
    @Override
    public String createLink() {
        return  "www.teams.microsoft.com/"+UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
