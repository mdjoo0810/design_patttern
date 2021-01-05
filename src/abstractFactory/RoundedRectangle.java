package abstractFactory;

import factory.Shape;

public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rounded Rectangle::draw() method.");
    }
}
