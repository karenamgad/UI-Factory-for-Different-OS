public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
    @Override
    public void onClick() {
        System.out.println("Clicking Windows Button");
    }
}
