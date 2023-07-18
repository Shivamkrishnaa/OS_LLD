package BuilderPrototypeRegistry;

import BuilderPrototypeRegistry.Exception.InvalidIqError;

import java.util.HashMap;

public class MasterStudent extends Student {
    private String majors;
    private String name;
    private String batch;

    @Override
    public String toString() {
        return "MasterStudent{" +
                "majors='" + majors + '\'' +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBatch() {
        return batch;
    }

    @Override
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public MasterStudent(MasterStudent ms) {
        super(ms);
        this.majors = ms.majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public MasterStudent clone(){
      return new MasterStudent(this);
    };
    public static MasterStudentBuilder builders(){
        return new MasterStudentBuilder();
    }
    public MasterStudent(MasterStudentBuilder msb) {
        this.majors = msb.getMajors();
        this.name = msb.getName();
        this.batch = msb.getName();
    }
    public static class MasterStudentBuilder {
        private String majors;
        private String name;
        private String batch;

        public String getName() {
            return name;
        }

        public MasterStudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public MasterStudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getMajors() {
            return majors;
        }

        public MasterStudentBuilder setMajors(String majors) {
            this.majors = majors;
            return this;
        }
        public void validate() {
            if (this.majors != "Science"){
                throw new InvalidIqError("Invalid majors");
            }
        }

        public MasterStudent buildMaster() {
            this.validate();
            return new MasterStudent(this);
        }
        MasterStudentBuilder() { }

    }
}
