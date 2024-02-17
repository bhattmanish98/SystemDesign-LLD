public class Factory {
    public Shape getShape(Shapes shapes) throws Exception{
        switch (shapes) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new Exception("Not a valid Shape");
        }
    }
}
