package poly.ex5;

import poly.ex4.Animal;

public class InterfaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }



}
