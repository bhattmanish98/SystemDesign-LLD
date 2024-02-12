public class VehicleTest {
    public static void main(String... args) {
        Vehicle v1 = new PassengerVehicle();
        Vehicle v2 = new OffroadVehicle();
        Vehicle v3 = new SportyVehicle();

        v1.drive();
        v2.drive();
        v3.drive();
    }
}
