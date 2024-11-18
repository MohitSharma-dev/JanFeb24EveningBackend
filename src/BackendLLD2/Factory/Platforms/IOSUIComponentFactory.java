package BackendLLD2.Factory.Platforms;

import BackendLLD2.Factory.Platforms.Button.Button;
import BackendLLD2.Factory.Platforms.Button.IOSButton;
import BackendLLD2.Factory.Platforms.Dropdown.Dropdown;
import BackendLLD2.Factory.Platforms.Dropdown.IOSDropdown;
import BackendLLD2.Factory.Platforms.Menu.IOSMenu;
import BackendLLD2.Factory.Platforms.Menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory {

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
