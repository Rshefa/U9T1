public class Airplane extends Vehicle{
    private int wings;

    public Airplane(String name, int wheels, int wings)
    {
        super(name, wheels);
        this.wings = wings;
    }

    // getter methods for instance variables
    public int getWings()
    {
        return wings;
    }

    // public methods (aka behaviors)
    public void altitude(int feet)
    {
        // write some code here to honk, etc.
        System.out.println("I am flying around " +feet + " feet in the air!");
    }

}
