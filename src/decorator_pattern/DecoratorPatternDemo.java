package decorator_pattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        System.out.println();

        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        System.out.println();

        Shape redDottedCircle = new DottedShapeDecorator(redCircle);
        redDottedCircle.draw();
    }
}
