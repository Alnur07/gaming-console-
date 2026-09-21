package factorymethod;

public class Xbox implements Console {

    @Override
    public void start(){
        System.out.println("Xbox is starting...");
    }

    @Override
    public String getName(){
        return "Xbox";
    }

}
