package SOLID_7_FACTORY_BUTTON.components.button;

public class WindowButton implements Button{
    @Override
    public void create() {
        System.out.println("Window button creation...");
    }
}
