package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) {//이걸해야 안전
            System.out.println("Child 인스턴스가 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }


    }
}
