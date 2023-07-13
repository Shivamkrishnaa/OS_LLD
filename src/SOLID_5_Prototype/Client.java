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

        Student b2 = registry.get("B2");
        Student shiv = b2.clone();
        shiv.setName("Shiv"); shiv.setId(1);

        Student s1 = registry.get("A1");
        Student krishna = s1.clone();
        krishna.setName("Krishna"); krishna.setId(2);
        /*
            Create prototype object
            Store in registry
            Get prototype from map
            create clone(deep copy) of prototype
            update the value
        */
    }
}
