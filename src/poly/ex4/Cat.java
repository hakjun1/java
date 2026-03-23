package poly.ex4;

public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("cat move");
    }

    @Override
    public void sound() {
        System.out.println("cat sound");
    }
}
