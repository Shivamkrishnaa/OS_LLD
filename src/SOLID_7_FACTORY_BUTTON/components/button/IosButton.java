package SOLID_7_FACTORY_BUTTON.components.button;

public class IosButton implements Button{
    @Override
    public void create() {
        System.out.println("IOS button creation...");
    }
}
