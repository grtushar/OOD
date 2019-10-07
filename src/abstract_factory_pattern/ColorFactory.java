package abstract_factory_pattern;

/**
 * Created by prime on 5/26/15.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if(color.equalsIgnoreCase("green")) {
            return new Green();
        }

        return null;
    }
}
