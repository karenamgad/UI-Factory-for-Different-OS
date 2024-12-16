public class LinuxMenu implements Menu {
    @Override
    public void render() {
        System.out.println("Rendering a Linux menu...");
    }

    @Override
    public void addItem(String item) {
        System.out.println("Added item to Linux menu: " + item);
    }
}