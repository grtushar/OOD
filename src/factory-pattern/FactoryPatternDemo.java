package factoryPattern;

/**
 * Created by prime on 5/22/15.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory ref = new ShapeFactory();

        Shape circle = ref.getShape("circle");
        Shape square = ref.getShape("square");
        Shape rectangle = ref.getShape("rectangle");

        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
