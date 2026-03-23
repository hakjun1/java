package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        // 코드가 변하는 부분 새로운 객체도 여기부부분만 추가하면 해결된다.
        //즉 변하는 부분을 최소하 하는 것이다.
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};
        //Animal을 상속받는 곳에서 오버라이딩 하지 않을 가능성
        //제약이 있는프로그램이 좋은프로그램이다. 추상클래스를알아본다.

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }
    //코드가 변하지 않는부분
    private static void soundAnimal(Animal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }

}
