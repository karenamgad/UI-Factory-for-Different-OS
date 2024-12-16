public class LinuxFactory implements UI_Factory {

    @Override
   public Button createButton() {
        return new LinuxButton();
    }
    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
