import abstractfactory.Controller;
import abstractfactory.GamingConsoleFactory;
import abstractfactory.PlayStationFactory;
import abstractfactory.XboxFactory;
import factorymethod.Console;
import factorymethod.ConsoleCreator;
import factorymethod.PlayStationCreator;
import factorymethod.XboxCreator;

public class Main {

    public static void main(String[] args) {

        System.out.println("==Factory Method==");

        ConsoleCreator playStationCreator = new PlayStationCreator();
        playStationCreator.startConsole();

        System.out.println();

        ConsoleCreator xboxCreator = new XboxCreator();
        xboxCreator.startConsole();

        System.out.println("\n==Abstract Factory==");

        GamingConsoleFactory playStationFactory = new PlayStationFactory();

        Console playStation = playStationFactory.createConsole();
        Controller playStationController = playStationFactory.createController();

        System.out.println("Console: " + playStation.getName());
        playStation.start();

        System.out.println("Controller: " + playStationController.getName());
        playStationController.connect();


        System.out.println();

        GamingConsoleFactory xboxFactory = new XboxFactory();

        Console xbox = xboxFactory.createConsole();
        Controller xboxController = xboxFactory.createController();

        System.out.println("Console: " + xbox.getName());
        xbox.start();

        System.out.println("Controller: " + xboxController.getName());
        xboxController.connect();
    }
}