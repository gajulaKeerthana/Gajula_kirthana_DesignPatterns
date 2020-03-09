package creational.factory;

public abstract class ShapeFactory {
    public static GeometricShape getShape(ShapeType name) {
        GeometricShape shape = null;
        switch (name) {
            case LINE:
                shape = (GeometricShape) new Line();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}