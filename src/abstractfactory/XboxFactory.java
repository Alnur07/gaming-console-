package abstractfactory;

import factorymethod.Console;
import factorymethod.Xbox;

public class XboxFactory implements GamingConsoleFactory {

    @Override
    public Console createConsole(){
        return new Xbox();
    }

    @Override
    public Controller createController(){
        return new XboxController();
    }
}
