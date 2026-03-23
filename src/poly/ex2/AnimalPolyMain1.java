package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        //부모는 자식을 담을 수 있다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    //다형적 참조(하나의 타입으로 통일),메서드 오버라이딩(개성화한다)
    private static void soundAnimal(Animal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }
}
