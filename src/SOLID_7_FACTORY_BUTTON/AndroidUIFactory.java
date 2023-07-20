package SOLID_7_FACTORY_BUTTON;

import SOLID_7_FACTORY_BUTTON.components.button.AndroidButton;
import SOLID_7_FACTORY_BUTTON.components.button.Button;
import SOLID_7_FACTORY_BUTTON.components.button.IosButton;
import SOLID_7_FACTORY_BUTTON.components.dropdown.AndroidDropdown;
import SOLID_7_FACTORY_BUTTON.components.dropdown.Dropdown;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
