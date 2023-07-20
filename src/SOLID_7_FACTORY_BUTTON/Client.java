package SOLID_7_FACTORY_BUTTON;

import SOLID_7_FACTORY_BUTTON.components.button.Button;
import SOLID_7_FACTORY_BUTTON.components.dropdown.Dropdown;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.WINDOW);
        UIFactory ui = flutter.createUIFactory();
        Button b = ui.createButton();
        b.create();
        Dropdown d = ui.createDropdown();
        d.create();

    }
}
