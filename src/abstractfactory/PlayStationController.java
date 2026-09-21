package abstractfactory;

public class PlayStationController implements Controller {

    @Override
    public void connect() {
        System.out.println("PlayStation Controller connected.");
    }

    @Override
    public String getName(){
        return "PlayStation Controller";
    }
}
