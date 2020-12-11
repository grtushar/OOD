package decorator_pattern.decorators;

import decorator_pattern.Shape;

public class DottedShapeDecorator extends ShapeDecorator {
    public DottedShapeDecorator(Shape shapeToDecorate) {
        super(shapeToDecorate);
    }

    @Override
    public void draw() {
        shapeToDecorate.draw();
        makeBorderDotted(shapeToDecorate);
    }

    private void makeBorderDotted(Shape shapeToDecorate) {
        System.out.println("Making the border of the shape dotted!");
    }
}
