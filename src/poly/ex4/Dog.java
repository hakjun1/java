package poly.ex4;

public class Dog extends Animal {

    @Override
    public void move() {
        System.out.println("dog move");
    }

    @Override
    public void sound() {
        System.out.println("dog sound");
    }
}
