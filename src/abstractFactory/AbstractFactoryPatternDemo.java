package abstractFactory;

import factory.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 팩토리의 팩토리인 FactoryProducer 를 통해 구체적인 팩토리 shapeFactory 를 얻습니다.
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // shapeFactory 로 구체적인 Product 를 만듭니다. (팩토리 메쏘드와 동일)
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();

        // 이번엔 FactoryProducer를 통해 구체적인 팩토리 shapeFactory1 을 얻습니다.
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        // 위와 동일하지만, 이번엔 shapeFactory1 로 Product 를 만듭니다.
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }

}
