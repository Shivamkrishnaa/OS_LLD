package SOLID_6_Prototype_Train;

//ALL trains have same fare, same train type, same engine type, same number of seats
// but have different timings, and stations

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Train implements Prototype<Train> {

    private int fare;
    private String type;
    private String engineType;
    private int numberOfSeats;
    private List<String> timings;
    private List<String> stations;

    public List<String> getTimings() {
        return timings;
    }

    public void setTimings(List<String> timings) {
        this.timings = timings;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    Train() {
        this.timings = new ArrayList<>();
        this.stations = new ArrayList<>();
    }

    public Train (Train t) {
        this.engineType = t.getEngineType();
        this.fare = t.getFare();
        this.numberOfSeats = t.getNumberOfSeats();
        this.type = t.getType();
        this.timings = new ArrayList<>(t.getTimings());
        this.stations = new ArrayList<>(t.getStations());
    }

    @Override
    public Train clone() {
        Train t = new Train(this);
        return t;
    }
}
