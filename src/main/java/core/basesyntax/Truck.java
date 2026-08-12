package core.basesyntax;

public class Truck extends Machine{

    @Override
    public void doWork(){
        System.out.println("Hello!I am Truck!");
    }

    @Override
    public void stopWork(){
        System.out.println("Truck stopped.");
    }
}
