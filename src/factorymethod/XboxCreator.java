package factorymethod;

public class XboxCreator extends ConsoleCreator {

    @Override
    public Console createConsole() {
        return new Xbox();
    }
}
