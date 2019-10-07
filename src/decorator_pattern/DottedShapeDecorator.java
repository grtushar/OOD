package decorator_pattern;

public class DottedShapeDecorator extends ShapeDecorator {
    DottedShapeDecorator(Shape shapeToDecorate) {
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
