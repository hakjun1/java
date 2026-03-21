package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {//붕어빵틀에서 붕어빵틀을 호출 같은 클래스인스턴스 클래스변수
//        instanceValue++;//인스턴스 변수접근 컴파일에러
//        instanceMethod();//인스턴스 메서드 접근 컴파일 에러;
//        인스턴스는 생성을 해야 알수있다. 어떤걸참조해야할지 모른다.

        staticValue++;//정적 변수 접근
        staticMethod();// 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticValue++;//정적 변수 접근
        staticMethod();// 정적 메서드 접근

    }


    private void instanceMethod() {
        System.out.println("instanceMethod ="+instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
        //스태틱에서 인스턴스가 왜 접근이되는가? 메서드에서 참조값을 넘겨받아야하는조건이기 때문이다.
    }
}
