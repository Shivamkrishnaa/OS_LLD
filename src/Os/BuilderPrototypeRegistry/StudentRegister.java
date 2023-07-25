package Os.BuilderPrototypeRegistry;

import java.util.HashMap;

public class StudentRegister<T> {
    private HashMap<String, T> register = new HashMap<>();

    public T getRegister(String key) {
        return register.get(key);
    }

    public void setRegister(String key, T value) {
        register.put(key, value);
    }
}
