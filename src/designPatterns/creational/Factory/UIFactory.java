package designPatterns.creational.Factory;

import designPatterns.creational.Factory.components.button.Button;
import designPatterns.creational.Factory.components.dropdown.DropDown;
import designPatterns.creational.Factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    DropDown createDropdown();
    Menu createMenu();
}
