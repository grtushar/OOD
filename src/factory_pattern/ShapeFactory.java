package factory_pattern;

/**
 * Created by prime on 5/22/15.
 */
public class ShapeFactory {
    public Shape getShape (String shape) {
        if(shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;
    }
}
