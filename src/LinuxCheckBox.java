public class LinuxCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering a Linux checkbox...");
    }

    @Override
    public void check() {
        System.out.println("Linux checkbox checked!");
    }
}
