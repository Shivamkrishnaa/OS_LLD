package SOLID_7_FACTORY_BUTTON;

import SOLID_7_FACTORY_BUTTON.components.button.Button;
import SOLID_7_FACTORY_BUTTON.components.dropdown.Dropdown;

public interface UIFactory {
    Dropdown createDropdown();
    Button createButton();

}
