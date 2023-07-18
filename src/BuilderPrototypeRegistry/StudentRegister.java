package BuilderPrototypeRegistry;

import SOLID_5_Prototype.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRegister<T> {
    private HashMap<String, T> register = new HashMap<>();

    public T getRegister(String key) {
        return register.get(key);
    }

    public void setRegister(String key, T value) {
        register.put(key, value);
    }
}
