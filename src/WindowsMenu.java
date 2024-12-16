public class WindowsMenu implements Menu {
    @Override
    public void render() {
        System.out.println("Rendering a Windows menu...");
    }

    @Override
    public void addItem(String item) {
        System.out.println("Added item to Windows menu: " + item);
    }
}
