package Solid.SOLID_5_PROTOTYPE;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> register;

    public StudentRegistry(){
        this.register = new HashMap<>();
    }
    public void save(Student s) {
        register.put(s.getBatch(), s);
    };
    public Student get(String batchName) {
      return register.get(batchName);
    };
}
