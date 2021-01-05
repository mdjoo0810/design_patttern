package abstractFactory;

import factory.Shape;

public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);

}
