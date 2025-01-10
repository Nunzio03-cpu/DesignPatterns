package Factory;

public class Main {
    public static void main(String[] args) {
        Shape cerchio = ShapeFactory.getShape(ShapeType.CERCHIO);
        Shape rettangolo = ShapeFactory.getShape(ShapeType.RETTANGOLO);

        cerchio.draw();
        rettangolo.draw();
    }
}
