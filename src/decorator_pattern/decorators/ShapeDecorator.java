package decorator_pattern.decorators;

import decorator_pattern.Shape;

abstract class ShapeDecorator implements Shape {
    Shape shapeToDecorate;

    ShapeDecorator(Shape shapeToDecorate) {
        this.shapeToDecorate = shapeToDecorate;
    }
}
