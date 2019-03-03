package abstractFactoryPattern;

/**
 * Created by prime on 5/26/15.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if(type.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }

        return null;
    }
}
