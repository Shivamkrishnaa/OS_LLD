package SOLID_3_Builder;

import SOLID_3_Builder.Exception.InvalidNameException;
import SOLID_3_Builder.Exception.InvalidYorException;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private double psp;
    private String batchName;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }
    public static Builder builder() {
        Builder b = new Builder();
        return b;
    }
    static class Builder {
        private int id;
        private String name; // not be null
        private int yoe; // >= 1
        private double psp;
        private String batchName;
        Builder() {

        }
        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getYoe() {
            return yoe;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatchName() {
            return batchName;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public void validate() {
//            List<String> exceptions = new ArrayList<>();
//            boolean exceptionVaught = false;
            if(name == null){
                throw new InvalidNameException("Name is invalid");
            }
            if (yoe <= 1) {
                throw new InvalidYorException("Year of exp should greater than 1");
            }

        }
        public Student build() {
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }



}
