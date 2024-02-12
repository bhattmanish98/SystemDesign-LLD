public class Vehicle {
    DrivingTechnique drivingTechnique;

    Vehicle(DrivingTechnique drivingTechnique) {
        this.drivingTechnique = drivingTechnique;
    }
//    public void drive() {
//        System.out.println("Normal Driving Technique");
//    }

    public void drive() {
        drivingTechnique.drive();
    }
}
