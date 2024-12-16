public class MacMenu implements Menu {
    @Override
    public void render() {
        System.out.println("Rendering a Mac menu...");
    }

    @Override
    public void addItem(String item) {
        System.out.println("Added item to Mac menu: " + item);
    }
}