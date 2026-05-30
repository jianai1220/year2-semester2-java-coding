public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        Car car = new Car("Toyota Camry" , 4);
        Truck truck = new Truck("Ford F-150" , 350.0f);
        Airplane airplane = new Airplane("Boeing 747" , 68.4f, 416);

        System.out.println(vehicle.describe());
        System.out.println("Vehicle moves for "+vehicle.move(100) + " hours." + "\n");

        System.out.println(car.describe());
        System.out.println("Car moves for "+car.move(100) + " hours.");
        System.out.println("Car honks: " + car.honkHorn() + "\n");

        System.out.println(truck.describe());
        System.out.println("Truck moves for "+truck.move(100) + " hours.");
        System.out.println("Truck honks: " + truck.honkHorn() + "\n");

        System.out.println(airplane.describe());
        airplane.landingGear(true);
        System.out.println("Airplane moves for "+airplane.move(100) + " hours." + "\n");
    }
}
