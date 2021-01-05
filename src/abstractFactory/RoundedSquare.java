package abstractFactory;

import factory.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rounded Square::draw() method.");
    }
}
