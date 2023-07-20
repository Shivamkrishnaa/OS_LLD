package SOLID_7_FACTORY_BUTTON.components.button;

public class AndroidButton implements Button{
    @Override
    public void create() {
        System.out.println("Android button creating...");
    }
}
