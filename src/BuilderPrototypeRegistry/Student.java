package BuilderPrototypeRegistry;
import java.util.HashMap;


import BuilderPrototypeRegistry.Exception.InvalidNameError;

import java.util.HashMap;

public class Student implements Prototype<Student>{
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }

    private String name;
    private String batch;

    Student(Student s) {
        this.name = s.getName();
        this.batch = s.getBatch();
    }
    @Override
    public Student clone() {
        return new Student(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    Student() {}
    Student(Builder b) {
        this.name = b.getName();
        this.batch = b.getBatch();
    }
    public static Builder builder() {
        Builder b = new Builder();
        return b;
    }
    public static class Builder {
        private String batch;
        private String name;
        public Builder() {};

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public void validate() {
            if(this.name.length() < 1) {
                throw new InvalidNameError("Name is invalid");
            }
        }

        public Student build() {
            this.validate();
            return new Student(this);
        }
    };



    public static class StudentRegistry {
        private static HashMap<String, Student> studentRegistry = new HashMap<>();

        public static Student get(String batch) {
            return studentRegistry.get(batch);
        }

        public static void save(String batch, Student s) {
            studentRegistry.put(batch, s);
        }


    }
}
