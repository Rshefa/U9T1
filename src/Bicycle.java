public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String name, int wheels, int gearCount)
    {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    // getter methods for instance variables
    public int getgearCount()
    {
        return gearCount;
    }

    // public methods (aka behaviors)
    public void ringBell()
    {
        // write some code here to honk, etc.
        System.out.println("Ring! Ring! Get outta the way!");
    }


}



