package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child; //(Parent)child를 해야한다. 원래는 업캐스팅은 생략가능
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

    }


}
