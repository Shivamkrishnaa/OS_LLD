package Solid.SOLID_7_ADAPTER_Calendly;

public class Client {
    public static void main(String[] args) {
        System.out.println(new MeetAdapter(Platforms.GOOGLE).createLink());
        System.out.println(new MeetAdapter(Platforms.TEAMS).createLink());
        System.out.println(new MeetAdapter(Platforms.ZOOM).createLink());
    }
}
