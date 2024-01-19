package designPatterns.creational.Factory;

import designPatterns.creational.Factory.components.button.IosButton;
import designPatterns.creational.Factory.components.dropdown.IosDropdown;
import designPatterns.creational.Factory.components.menu.IosMenu;

public class IosUIFactory implements  UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
