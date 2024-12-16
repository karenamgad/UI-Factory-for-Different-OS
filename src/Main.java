public class Main {
    public static void main(String[] args) {
        //Creating Factory for Mac
        UI_Factory MacFactory = new MacFactory();
        Button button = MacFactory.createButton();
        button.render();
        button.onClick();
        Menu menu = MacFactory.createMenu();
        menu.render();
        menu.addItem("Apple");

        CheckBox checkBox = MacFactory.createCheckBox();
        checkBox.render();
        checkBox.check();

        //Creating Factory for Windows
        UI_Factory WindowsFactory = new WindowsFactory();
        Button button2 = WindowsFactory.createButton();
        button2.render();
        button2.onClick();
        //and so on

    }
}