package Solid.SOLID_5_PROTOTYPE;

public class Test {
    public static void main(String[] args) {
        Student original = new Student();
        original.setName("sk");

        if(original instanceof Student) {
            Student copy = new Student(original);
        } else if(original instanceof AverageStudent){
            AverageStudent copy = new AverageStudent((AverageStudent)original);
        }
    }
}
