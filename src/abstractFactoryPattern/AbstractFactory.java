package abstractFactoryPattern;

/**
 * Created by prime on 5/26/15.
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
