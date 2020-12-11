package decorator_pattern.decorators;

import decorator_pattern.Shape;

public class RedColorShapeDecorator extends ShapeDecorator {
    public RedColorShapeDecorator(Shape shapeToDecorate) {
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
