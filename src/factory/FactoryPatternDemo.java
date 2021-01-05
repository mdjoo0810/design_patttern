package factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        // Shape 인스턴스를 생성해주는 팩토리를 만듭니다.
        ShapeFactory shapeFactory = new ShapeFactory();

        // 팩토리로부터 생성할 객체를 팩토리 메쏘드로 받습니다.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

    }

}
