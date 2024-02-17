public class Main {
    public static void main(String... args) {
        Factory factory = new Factory();
        try {
            Shape shape = factory.getShape(Shapes.CIRCLE);
            shape.draw();

            shape = factory.getShape(Shapes.RECTANGLE);
            shape.draw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
