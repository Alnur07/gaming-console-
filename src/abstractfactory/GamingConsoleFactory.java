package abstractfactory;

import factorymethod.Console;

public interface GamingConsoleFactory {

    Console createConsole();

    Controller createController();

}
