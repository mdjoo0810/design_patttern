package factory;

public class ShapeFactory {

    // getShape(...) 를 통해 상품(Shape) 를 새로 만들어 내보냅니다.
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else {
            return null;
        }
    }

}
