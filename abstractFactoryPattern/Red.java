package abstractFactoryPattern;

/**
 * Created by prime on 5/26/15.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("inside the fill method of RED class");
    }
}
