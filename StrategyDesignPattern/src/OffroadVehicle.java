public class OffroadVehicle extends Vehicle{
    // Code duplicacy
//    public void drive() {
//        System.out.println("Required Special Driving Technique");
//    }

    OffroadVehicle() {
        super(new SpecialDrivingTechnique());
    }
}
