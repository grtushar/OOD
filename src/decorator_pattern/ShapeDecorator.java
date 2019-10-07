package decorator_pattern;

abstract class ShapeDecorator implements Shape {
    Shape shapeToDecorate;

    ShapeDecorator(Shape shapeToDecorate) {
        this.shapeToDecorate = shapeToDecorate;
    }
}
