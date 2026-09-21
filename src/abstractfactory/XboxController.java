package abstractfactory;

public class XboxController implements Controller{

    @Override
    public void connect() {
        System.out.println("Xbox Controller connected");
    }

    @Override
    public String getName() {
        return "Xbox controller";
    }
}
