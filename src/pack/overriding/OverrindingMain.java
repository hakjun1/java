package pack.overriding;

public class OverrindingMain {

    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("value = "+ child.value);
        child.method();

        //부모변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+parent.value);
        parent.method();

        //핵심
        //부모 변수가 자식 신스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = "+poly.value);//변수는 오버라이딩x
        poly.method();//메서드 오버라이딩! 인스턴스안에서 오버라이딩 된 메서드는 우선권을 가짐
        //하위로갈수록 우선권 가짐
    }
}
