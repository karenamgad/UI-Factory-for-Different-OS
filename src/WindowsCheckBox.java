public class WindowsCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox...");
    }

    @Override
    public void check() {
        System.out.println("Windows checkbox checked!");
    }
}
