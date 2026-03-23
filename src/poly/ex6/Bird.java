package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{//extends가 먼저임 상속은하나니까
    @Override
    public void fly() {
        System.out.println("Bird.fly");
    }

    @Override
    public void sound() {
        System.out.println("Bird.sound");
    }
}
