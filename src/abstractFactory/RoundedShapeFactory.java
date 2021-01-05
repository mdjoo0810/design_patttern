package abstractFactory;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle(); // 위 팩토리와 이 부분이 다릅니다.
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare(); // 위 팩토리와 이 부분이 다릅니다.
        }
        return null;
    }
}
