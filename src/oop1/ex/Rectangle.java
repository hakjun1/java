package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width*height;
    }

    void calculatePerimeter(int width, int height) {
        System.out.println("둘레: " + 2 * (width + height));
    }

    void isSquare(int width, int height) {
        System.out.println("정사각형 여부: " + (width == height));
    }

}
