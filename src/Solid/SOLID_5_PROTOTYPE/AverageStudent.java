package Solid.SOLID_5_PROTOTYPE;

public class AverageStudent extends Student{
    private int iq;
    public AverageStudent(AverageStudent averageStudent) {
        super(averageStudent);
        this.iq = averageStudent.iq;
    }

    public AverageStudent() {

    }

    @Override
    public AverageStudent clone() {
      return new AverageStudent(this);
    };

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
