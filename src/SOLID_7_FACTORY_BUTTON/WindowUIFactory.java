package SOLID_7_FACTORY_BUTTON;

import SOLID_7_FACTORY_BUTTON.components.button.Button;
import SOLID_7_FACTORY_BUTTON.components.button.WindowButton;
import SOLID_7_FACTORY_BUTTON.components.dropdown.Dropdown;
import SOLID_7_FACTORY_BUTTON.components.dropdown.WindowDropdown;

public class WindowUIFactory implements UIFactory{
    @Override
    public Button createButton(){
        return new WindowButton();
    };

    @Override
    public Dropdown createDropdown() {
        return new WindowDropdown();
    }
}
