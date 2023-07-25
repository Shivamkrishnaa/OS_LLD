package SOLID_6_Prototype_Train;

import java.util.HashMap;

public class Registry {
    private HashMap<String, Prototype<Train>> registry = new HashMap<>();

    public Registry(){}

    public Prototype<Train> get(String engineType) {
        return registry.get(engineType);
    }

    public void register(Train t) {
        registry.put(t.getEngineType(),t);
    }

}
