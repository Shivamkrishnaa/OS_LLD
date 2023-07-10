package AccessModifiers;

public class Cat implements Animal {
    @Override
    public void eat(){
        System.out.println("EATING");
    }

    @Override
    public void walk(){
        System.out.println("WALKING");
    }
}
