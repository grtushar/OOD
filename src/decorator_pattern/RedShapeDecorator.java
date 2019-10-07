package decorator_pattern;

public class RedShapeDecorator extends ShapeDecorator {
    RedShapeDecorator(Shape shapeToDecorate) {
        super(shapeToDecorate);
    }

    @Override
    public void draw() {
        shapeToDecorate.draw();
        setRedBorder(shapeToDecorate);
    }

    private void setRedBorder(Shape shapeToDecorate) {
        System.out.println("Coloring shape to red!");
    }
}
