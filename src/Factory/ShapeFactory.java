package Factory;

public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CERCHIO:
                return new Cerchio();
            case RETTANGOLO:
                return new Rettangolo();
            default:
                throw new IllegalArgumentException("Forma non valida.");
        }
    }
}
