public class LinuxButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Linux Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking Linux Button");
    }
}
