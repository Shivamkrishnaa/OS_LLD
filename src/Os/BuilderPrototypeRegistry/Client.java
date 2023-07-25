package Os.BuilderPrototypeRegistry;

public class Client {
    public static void main(String[] args) {
        Student john = Student.builder()
                                .setBatch("B2")
                                .setName("john")
                                .build();
        System.out.println("Student builder: " + john.toString());

        StudentRegister<Student> register = new StudentRegister<Student>();
        register.setRegister(john.getBatch(), john);


        Student registeredB2 = register.getRegister(john.getBatch());
        System.out.println("Student Registered: " + registeredB2.toString());

        Student clonedB2 = registeredB2.clone();
        System.out.println("Student Cloned Registered: " + clonedB2.toString());


        MasterStudent mastersStudent = MasterStudent.builders()
                                                        .setBatch("master")
                                                        .setName("shivam")
                                                        .setMajors("Science")
                                                        .buildMaster();
        System.out.println("MasterStudent builder: " +  mastersStudent.toString());

        register.setRegister(mastersStudent.getBatch(), mastersStudent);
        MasterStudent shivam = (MasterStudent) register.getRegister(mastersStudent.getBatch());
        System.out.println("MasterStudent Registered: " +  shivam.toString());

    }
}
