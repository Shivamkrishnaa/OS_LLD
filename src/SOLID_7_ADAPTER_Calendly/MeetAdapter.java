package SOLID_7_ADAPTER_Calendly;

import SOLID_7_ADAPTER_Calendly.ExternalApi.GoogleMeet;
import SOLID_7_ADAPTER_Calendly.ExternalApi.Meeting;
import SOLID_7_ADAPTER_Calendly.ExternalApi.Teams;
import SOLID_7_ADAPTER_Calendly.ExternalApi.Zoom;

public class MeetAdapter implements Meeting {
    private Platforms platform;
    private Meeting meetingPlatform;
    public MeetAdapter(Platforms platform) {
        this.platform = platform;
        switch (platform){
            case ZOOM:
                this.meetingPlatform = new Zoom();
                break;
            case TEAMS:
                this.meetingPlatform = new Teams();
            default:
                this.meetingPlatform = new GoogleMeet();
        }
    }
    @Override
    public String createLink(){
        return meetingPlatform.createLink();
    }
}
