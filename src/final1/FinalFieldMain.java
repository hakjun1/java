package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit.value);
        System.out.println(constructInit2.value);

        //필드 초기화
        System.out.println("필드 초기화");
        //같은 final 필드가 사용되므로 메모리의 중복사용 그래서 static를 쓰면 좋다.
        //static final을 쓰는데 그럴때는 대문자로 쓰는게 괸례다.
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수접근
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

    }
}
