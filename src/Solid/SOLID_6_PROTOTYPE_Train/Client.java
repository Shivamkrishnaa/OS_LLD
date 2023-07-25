package SOLID_6_Prototype_Train;

import java.util.ArrayList;
import java.util.List;

/*
    Create a prototype and registry design pattern solution for Local trains in Mumbai
    ALL trains have same fare, same train type, same engine type, same number of seats
    but have different timings, and stations.
*/
public class Client {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Train bulletTrains = new Train();
        bulletTrains.setFare(100);
        bulletTrains.setType("Inter-state");
        bulletTrains.setEngineType("v2");
        bulletTrains.setNumberOfSeats(500);

        Train metroTrains = new Train();
        metroTrains.setFare(50);
        metroTrains.setType("Inter-city");
        metroTrains.setEngineType("v1");
        metroTrains.setNumberOfSeats(1500);

        registry.register(bulletTrains);
        registry.register(metroTrains);

        Prototype<Train> blueLine = registry.get("v1");
        List stations = new ArrayList();
        stations.add("1");
        stations.add("2");
        stations.add("3");
        List timings = new ArrayList();
        timings.add(0);
        timings.add(6);
        timings.add(12);
        Train b1 = blueLine.clone();
        b1.setStations(stations);
        b1.setTimings(timings);

        Prototype<Train> kawasaki = registry.get("v2");
        Train k1 = kawasaki.clone();
        k1.setStations(stations);
        k1.setTimings(timings);



    }
}
