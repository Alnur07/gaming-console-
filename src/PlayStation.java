package factorymethod;

public class PlayStation implements Console {
    @Override
    public void start(){
        System.out.println("PlayStation is starting...");
    }

    @Override
    public String getName(){
        return "PlayStation";
    }

}
