package Solid.SOLID_5_PROTOTYPE;

public class Student implements Prototype<Student>{
    int id;
    String name;
    String batch;
    float avgPsp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getAvgPsp() {
        return avgPsp;
    }

    public void setAvgPsp(float avgPsp) {
        this.avgPsp = avgPsp;
    }
    public Student(){

    }
    public Student(int id, String name, String batch, float avgPsp) {
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.avgPsp = avgPsp;
    }

    public Student(Student student) {
        this.batch = student.batch;
        this.avgPsp = student.avgPsp;
    }
    @Override
    public Student clone() {
        return new Student(this);
    }
}
