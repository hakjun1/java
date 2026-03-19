package oop1.ex;

public class Rectangle {
    int width;
    int height;
    boolean square;

    int calculateArea() {
        return width*height;
    }

    boolean isSquare(){
        return this.width == this.height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

}
