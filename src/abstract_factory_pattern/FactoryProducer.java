package abstract_factory_pattern;

/**
 * Created by prime on 5/26/15.
 */
public class FactoryProducer {
    public static abstract_factory_pattern.AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("shape")) {
            return new abstract_factory_pattern.ShapeFactory();
        } else if(type.equalsIgnoreCase("color")) {
            return new abstract_factory_pattern.ColorFactory();
        }

        return null;
    }
}
