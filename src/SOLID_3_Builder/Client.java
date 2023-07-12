package SOLID_3_Builder;

public class Client {
    public static void main(String[] args) {


        Student s = Student.builder()
                            .setYoe(10)
                            .setName("shivam")
//                            .setYoe(0)
                            .setId(15103159)
                            .build();
        System.out.println(s);

    }


}
