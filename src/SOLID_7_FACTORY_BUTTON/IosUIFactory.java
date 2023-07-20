package SOLID_7_FACTORY_BUTTON;

import SOLID_7_FACTORY_BUTTON.components.button.Button;
import SOLID_7_FACTORY_BUTTON.components.button.IosButton;
import SOLID_7_FACTORY_BUTTON.components.dropdown.Dropdown;
import SOLID_7_FACTORY_BUTTON.components.dropdown.IosDropdown;

public class IosUIFactory implements UIFactory{
    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
