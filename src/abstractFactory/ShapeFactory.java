package abstractFactory;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
