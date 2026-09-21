package abstractfactory;

import factorymethod.Console;
import factorymethod.PlayStation;

public class PlayStationFactory implements  GamingConsoleFactory {

    @Override
    public Console createConsole() {
        return new PlayStation();
    }

    @Override
    public Controller createController() {
        return new PlayStationController();
    }
}
