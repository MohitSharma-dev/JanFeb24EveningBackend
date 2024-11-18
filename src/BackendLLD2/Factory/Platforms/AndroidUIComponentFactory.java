package BackendLLD2.Factory.Platforms;

import BackendLLD2.Factory.Platforms.Button.AndroidButton;
import BackendLLD2.Factory.Platforms.Button.Button;
import BackendLLD2.Factory.Platforms.Dropdown.AndroidDropdown;
import BackendLLD2.Factory.Platforms.Dropdown.Dropdown;
import BackendLLD2.Factory.Platforms.Menu.AndroidMenu;
import BackendLLD2.Factory.Platforms.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
