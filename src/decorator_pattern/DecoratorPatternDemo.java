package decorator_pattern;

import decorator_pattern.decorators.DottedShapeDecorator;
import decorator_pattern.decorators.RedColorShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new CircleShape();
        circle.draw();

        System.out.println();

        Shape redCircle = new RedColorShapeDecorator(circle);
        redCircle.draw();

        System.out.println();

        Shape redDottedCircle = new DottedShapeDecorator(redCircle);
        redDottedCircle.draw();
    }
}
