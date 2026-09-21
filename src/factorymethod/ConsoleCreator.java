package factorymethod;

public abstract class ConsoleCreator {

    public abstract Console createConsole();

    public void startConsole() {
        Console console = createConsole();

        System.out.println("Created: " + console.getName());
        console.start();
    }
}
