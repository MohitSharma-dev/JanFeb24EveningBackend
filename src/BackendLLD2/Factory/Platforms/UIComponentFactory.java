package BackendLLD2.Factory.Platforms;

import BackendLLD2.Factory.Platforms.Button.Button;
import BackendLLD2.Factory.Platforms.Dropdown.Dropdown;
import BackendLLD2.Factory.Platforms.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
