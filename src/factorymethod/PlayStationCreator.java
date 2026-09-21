package factorymethod;

public class PlayStationCreator extends ConsoleCreator {

    @Override
    public Console createConsole() {
        return new PlayStation();
    }
}
