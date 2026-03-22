package extends1.access.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10,20);
        //super(); 정의할 수 없다 b에는 생성자 인자가 있다.
        System.out.println("ClassC 생성자");

    }
}
