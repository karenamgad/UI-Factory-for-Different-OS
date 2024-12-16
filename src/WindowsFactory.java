public class WindowsFactory implements UI_Factory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public CheckBox createCheckBox ()
    {
        return new WindowsCheckBox();
    }
}
