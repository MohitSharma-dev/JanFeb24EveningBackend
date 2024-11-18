package BackendLLD2.Factory.Platforms;

import BackendLLD2.Factory.Platforms.Button.AndroidButton;
import BackendLLD2.Factory.Platforms.Button.Button;
import BackendLLD2.Factory.Platforms.Dropdown.Dropdown;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String platformName = scanner.nextLine();

        Platform p = PlatformFactory.getPlatformByName(platformName);
//        Button b;
//        if(p instanceof Android){
//            b = new AndroidButton();
//        }
        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        Button b = uiComponentFactory.createButton();
        b.click();
        Dropdown d = uiComponentFactory.createDropdown();
        d.getOptions();
    }
}
