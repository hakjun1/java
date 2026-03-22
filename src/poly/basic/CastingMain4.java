package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child = (Child)parent1;
        child.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2;//제미나이 물어봤던 부분 ClassCastException
        child2.childMethod();//실행불가

        //객체를 생성하면 해당타입의 상위 부모타입은 모두 함께 생성된다.
        //런타임오류는 안좋은오류, 컴파일오류는 아예실행이안되므로 좋은오류
    }


}
