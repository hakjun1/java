package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
    //추상클래스 생성 불가
//    Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }
    //코드가 변하지 않는부분
    private static void soundAnimal(Animal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }


}
