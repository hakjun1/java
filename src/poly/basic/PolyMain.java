package poly.basic;


public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식변수가 자식 인스턴스 참조
        System.out.println("Child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조) , 부모는 자식을 담을 수 있다.손자도
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();// parent 타입이므로 , 자식 메서드는 호출 안된다.
        //상속관계는 밑으로는 내려갈 수 없다.

        //안됨
//        poly.childMethod();
    }
}
