public class main
{
    public static void main(String[] args)
    {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object
        Bicycle myBike = new Bicycle("Mountain Bike", 2, 16);
        System.out.println(myBike.getName()); // inherited method
        System.out.println(myBike.getWheels()); // inherited method
        System.out.println(myBike.getgearCount()); // method ONLY available on bike objects
        myBike.move(30); // inherited method
        myBike.turn(90); // inherited method
        myBike.brake(0.50); // inherited method
        myBike.ringBell(); // method ONLY available on bike objects

        //Airplane

        Airplane myAirplane = new Airplane("Jet Blue", 2, 3);
        System.out.println(myAirplane.getName()); // inherited method
        System.out.println(myAirplane.getWheels()); // inherited method
        System.out.println(myAirplane.getWings()); // method ONLY available on Airplane objects
        myAirplane.move(30); // inherited method
        myAirplane.turn(90); // inherited method
        myAirplane.brake(0.50); // inherited method
        myAirplane.altitude(34000); // method ONLY available on Airplane objects






    }
}

