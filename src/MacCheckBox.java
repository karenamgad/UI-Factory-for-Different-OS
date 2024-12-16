public class MacCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering a Mac checkbox...");
    }

    @Override
    public void check() {
        System.out.println("Mac checkbox checked!");
    }
}