package designPatterns.creational.Factory;

import designPatterns.creational.Factory.components.button.AndroidButton;
import designPatterns.creational.Factory.components.button.Button;
import designPatterns.creational.Factory.components.dropdown.AndroidDropdown;
import designPatterns.creational.Factory.components.dropdown.DropDown;
import designPatterns.creational.Factory.components.menu.AndroidMenu;
import designPatterns.creational.Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
