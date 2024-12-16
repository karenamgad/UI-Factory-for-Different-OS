public class MacFactory implements UI_Factory {

    public Button createButton() {
        return new MacButton();
    }
    public Menu createMenu() {
        return new MacMenu();
    }

    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
