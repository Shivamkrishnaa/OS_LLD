package SOLID_5_Prototype;

public class Client {
    public static void main(String[] args) {

        Student juneBatch = new Student();
        juneBatch.setBatch("june");
        juneBatch.setAvgPsp(12);

        AverageStudent avgBatch = new AverageStudent();
        avgBatch.setBatch("average");
        avgBatch.setAvgPsp(50);

        StudentRegistry registry = new StudentRegistry();
        registry.save(juneBatch);
        registry.save(avgBatch);

        Student s = registry.get("B2");
        s.setName("Shivam"); s.setId(1);

        Student s1 = registry.get("A1");
        s1.setName("Krishna"); s.setId(2);



    }
}
