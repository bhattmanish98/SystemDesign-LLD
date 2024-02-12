public class SportyVehicle extends Vehicle {
    // Code duplicacy
//    public void drive() {
//        System.out.println("Required Special Driving Technique");
//    }

    SportyVehicle() {
        super(new SpecialDrivingTechnique());
    }
}
